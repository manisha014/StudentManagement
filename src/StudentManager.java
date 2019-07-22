
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class StudentManager {
    Connection conn=null;
    Statement stmt;
    String sql;
    Statement stmt1;
    ResultSet rs=null;
 
    public Connection openConnection()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement","root","root");
            stmt=conn.createStatement();
            stmt1=conn.createStatement();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            return null;
        }
        return conn;
        
    }
    public void addStudent(Student s)
    {
        openConnection();
        
        
        try {
            
            sql ="insert into student(`adm_no`, `name`, `father_name`,`mother_name`, `adhaar_no`, `gender`, `dob`, `address`, `contact`,`class`,`feesrem`,`status`) VALUES ('"
                    +s.getAdm_no()+"','"+s.getName()+"','"+s.getFather_name()+"','"+s.getMother_name()+"','"+s.getAdhaar_no()
                    +"','"+s.getGender()+"','"+s.getDob()+"','"+s.getAddress()+"','"+s.getC_no()+"','"+s.getStandard()+"','"+s.getFeesrem()+"','Present');";
            
            stmt.execute(sql);
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        
    }
    
    public int getMaxId()
    {
        openConnection();
        int max=0;
        sql="select max(adm_no) from student";
        try {
            rs=stmt.executeQuery(sql);
            if(rs.next())
            {
                max=rs.getInt(1);
            }
            return max;
            
        } catch (SQLException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return 0;
    }
    
    public Student getStudentById(int id)
    {
        openConnection();
        Student s=new Student();
        try {
            
            sql ="select student.*,coursefees.fees from student join coursefees using(class) where adm_no='"+id+"';";
            rs=stmt.executeQuery(sql);
            if(rs.next())
            {
                s.setAdm_no(rs.getInt("adm_no"));
                s.setName(rs.getString("name"));
                s.setFather_name(rs.getString("father_name"));
                s.setMother_name(rs.getString("mother_name"));
                s.setAdhaar_no(rs.getString("adhaar_no"));
                s.setGender(rs.getString("gender").charAt(0));
                s.setDob(rs.getString("dob"));
                s.setAddress(rs.getString("address"));
                s.setC_no(rs.getString("contact"));
                s.setStandard(rs.getString("class"));
                s.setMonthlyfees(rs.getInt("fees"));
                s.setFeesrem(rs.getInt("feesrem"));
                s.setStatus(rs.getString("status"));
                return s;
            }
            else
            {
                return null;
            }
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
        
    }
    
    public void updateStudentById(Student s)
    {
        openConnection();
        try {
            
            sql ="update student set `name`='"+s.getName()+"',`father_name`='"+s.getFather_name()+"',`mother_name`='"+s.getMother_name()
                    +"', `adhaar_no`='"+s.getAdhaar_no()+"', `gender`='"+s.getGender()+"', `dob`='"+s.getDob()+"', `address`='"+s.getAddress()+"', `contact`='"
                    +s.getC_no()+"',`class`='"+s.getStandard()+"',`feesrem`='"+s.getFeesrem()+"',`status`='"+s.getStatus()+"' where (adm_no='"+s.getAdm_no()+"');";
            
            stmt.execute(sql);
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        
    }
    
    public int getClassFees(int std)
    {
        openConnection();
        int fees=0;
        sql="select fees from coursefees where class='"+std+"';";
        try {
            rs=stmt.executeQuery(sql);
            if(rs.next())
            {
                fees=rs.getInt(1);
            }
            return fees;
            
        } catch (SQLException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return 0;
    }
    
    public void setCourseFee(int std,int fee)
    {
        openConnection();
        try {
            
            sql ="update coursefees set `fees`='"+fee+"' where (class='"+std+"');";
            stmt.execute(sql);
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
    
    public int getLastFeesUpdatedDate()
    {
        openConnection();
        int month=0;
        sql="select month from fees_last_updated;";
        try {
            rs=stmt.executeQuery(sql);
            if(rs.next())
            {
                month=rs.getInt(1);
            }
            return month;
            
        } catch (SQLException ex) {
            Logger.getLogger(AddStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return 0;
    }
    
    public void setLastFeesUpdateMonth(int m)
    {
        openConnection();
        try {
            
            sql ="update fees_last_updated set `month`='"+m+"';";
            stmt.execute(sql);
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
    
    public void updateFees()
    {
        openConnection();
        try {
            
            sql ="update student join coursefees using(class) set `feesrem`=feesrem+coursefees.fees where adm_no>0;";
            stmt.execute(sql);
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
    
    public void promoteStudents()
    {
        openConnection();
        String sql1;
        Student s=new Student();
        
        try {
            
            sql ="select * from student;";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                s.setAdm_no(rs.getInt("adm_no"));
                s.setStandard(rs.getString("class"));
                s.setStatus(rs.getString("status"));
                if(s.getStatus().equals("Present"))
                {
                    int std=Integer.parseInt(s.getStandard());
                    if(std<5)
                    {   
                        std=std+1;
                        sql1="update student set `class`='"+std+"' where (adm_no='"+s.getAdm_no()+"')";
                        stmt1.execute(sql1);
                    }
                    else
                    {
                        sql1="update student set `status`='Pass Out' where (adm_no='"+s.getAdm_no()+"')";
                        stmt1.execute(sql1);
                    }
                }
            }
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
    }
    
    public ArrayList<Student> getStudentByName(String str)
    {
        openConnection();
        ArrayList <Student> list=new ArrayList();
        
        try {
            
            sql ="select student.*,coursefees.fees from student join coursefees using(class) where name like '"+str+"%';";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                Student s=new Student();
                s.setAdm_no(rs.getInt("adm_no"));
                s.setName(rs.getString("name"));
                s.setFather_name(rs.getString("father_name"));
                s.setMother_name(rs.getString("mother_name"));
                s.setAdhaar_no(rs.getString("adhaar_no"));
                s.setGender(rs.getString("gender").charAt(0));
                s.setDob(rs.getString("dob"));
                s.setAddress(rs.getString("address"));
                s.setC_no(rs.getString("contact"));
                s.setStandard(rs.getString("class"));
                s.setMonthlyfees(rs.getInt("fees"));
                s.setFeesrem(rs.getInt("feesrem"));
                s.setStatus(rs.getString("status"));
                list.add(s);
            }
            return list;
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }
    
    public ArrayList<Student> getStudentByClass(String std)
    {
        openConnection();
        ArrayList <Student> list=new ArrayList();
        
        try {
            
            sql ="select student.*,coursefees.fees from student join coursefees using(class) where (class='"+std+"');";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                Student s=new Student();
                s.setAdm_no(rs.getInt("adm_no"));
                s.setName(rs.getString("name"));
                s.setFather_name(rs.getString("father_name"));
                s.setMother_name(rs.getString("mother_name"));
                s.setAdhaar_no(rs.getString("adhaar_no"));
                s.setGender(rs.getString("gender").charAt(0));
                s.setDob(rs.getString("dob"));
                s.setAddress(rs.getString("address"));
                s.setC_no(rs.getString("contact"));
                s.setStandard(rs.getString("class"));
                s.setMonthlyfees(rs.getInt("fees"));
                s.setFeesrem(rs.getInt("feesrem"));
                s.setStatus(rs.getString("status"));
                list.add(s);
            }
            return list;
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }
    
     public ArrayList<Student> getAllStudents()
    {
        openConnection();
        ArrayList <Student> list=new ArrayList();
        
        try {
            
            sql ="select student.*,coursefees.fees from student join coursefees using(class);";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                Student s=new Student();
                s.setAdm_no(rs.getInt("adm_no"));
                s.setName(rs.getString("name"));
                s.setFather_name(rs.getString("father_name"));
                s.setMother_name(rs.getString("mother_name"));
                s.setAdhaar_no(rs.getString("adhaar_no"));
                s.setGender(rs.getString("gender").charAt(0));
                s.setDob(rs.getString("dob"));
                s.setAddress(rs.getString("address"));
                s.setC_no(rs.getString("contact"));
                s.setStandard(rs.getString("class"));
                s.setMonthlyfees(rs.getInt("fees"));
                s.setFeesrem(rs.getInt("feesrem"));
                s.setStatus(rs.getString("status"));
                list.add(s);
            }
            return list;
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }
     
     public ArrayList<Student> getStudentsbyStatus(String st)
    {
        openConnection();
        ArrayList <Student> list=new ArrayList();
        
        try {
            
            sql ="select student.*,coursefees.fees from student join coursefees using (class) where (status='"+st+"');";
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                Student s=new Student();
                s.setAdm_no(rs.getInt("adm_no"));
                s.setName(rs.getString("name"));
                s.setFather_name(rs.getString("father_name"));
                s.setMother_name(rs.getString("mother_name"));
                s.setAdhaar_no(rs.getString("adhaar_no"));
                s.setGender(rs.getString("gender").charAt(0));
                s.setDob(rs.getString("dob"));
                s.setAddress(rs.getString("address"));
                s.setC_no(rs.getString("contact"));
                s.setStandard(rs.getString("class"));
                s.setMonthlyfees(rs.getInt("fees"));
                s.setFeesrem(rs.getInt("feesrem"));
                s.setStatus(rs.getString("status"));
                list.add(s);
            }
            return list;
            } catch (SQLException ex) {
            Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        closeConnection();
        return null;
    }
     
     public boolean changePassword(String oldpw,String newpw)
     {
         openConnection();
            try {
                String sql1="select * from login;";
                rs=stmt.executeQuery(sql1);
                
                if(rs.next())
                {
                    if(rs.getString("password").equals(oldpw))
                    {
                        sql ="update login set `password`='"+newpw+"';";
                        stmt1.execute(sql);
                        closeConnection();
                        return true;
                    }
                }
                          
                } catch (SQLException ex) {
                Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            closeConnection();
            return false;
     }
     
     public void closeConnection()
     {
        try {
            rs.close();
            stmt.close();
            conn.close();
            stmt1.close();
        } catch (SQLException ex) {
        }
         
     }
     
//     public void updateMonthlyFees(int std, int fees)
//     {
//         openConnection();
//            try {
//
//                sql ="update student set `monthlyfees`='"+fees+"' where (class='"+std+"');";
//                stmt.execute(sql);
//                } catch (SQLException ex) {
//                Logger.getLogger(StudentManager.class.getName()).log(Level.SEVERE, null, ex);
//            }
//     }
}

