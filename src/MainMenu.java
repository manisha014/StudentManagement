
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    StudentManager sm=new StudentManager();
    public MainMenu() {
        initComponents();
        admtf.setEditable(false);
        nametf.setEditable(false);
        classcb.setEnabled(false);
        statuscb.setEnabled(false);
        jTable1.setAutoCreateRowSorter(true);
        
        ArrayList <Student> list=sm.getAllStudents();
        Student s;
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object []col=new Object[9];    
            for(int i=0;i<list.size();i++)
            {
               col[0]=list.get(i).getAdm_no();
               col[1]=list.get(i).getName();
               col[2]=list.get(i).getFather_name();
               col[3]=list.get(i).getGender();
               col[4]=list.get(i).getStandard();
               col[5]=list.get(i).getStatus();
               col[6]=list.get(i).getC_no();
               col[7]=list.get(i).getMonthlyfees();
               col[8]=list.get(i).getFeesrem();
               model.addRow(col);
            }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        logoutbutton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        admtf = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        classcb = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        admnorb = new javax.swing.JRadioButton();
        namerb = new javax.swing.JRadioButton();
        classrb = new javax.swing.JRadioButton();
        allstudentsbutton = new javax.swing.JButton();
        statusrb = new javax.swing.JRadioButton();
        statuscb = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        changepasswordbutton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        homeMenu = new javax.swing.JMenu();
        manageMenu = new javax.swing.JMenu();
        addMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        updateStudentmi = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        promoteStudentmi = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        feesMenu = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        studentfees = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        monthwisefee = new javax.swing.JMenuItem();
        aboutmenu = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu4.setText("jMenu4");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Search Students by:");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adm No.", "Name", "FatherName", "Gen", "Class", "Status", "Contact", "Monthly Fee", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(5);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(8);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(12);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(18);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(15);
        }

        logoutbutton.setText("LogOut");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Admission No.");

        admtf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        searchButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Name");

        nametf.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        classcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "1", "2", "3", "4", "5" }));
        classcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classcbActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Class");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Search Students");

        buttonGroup1.add(admnorb);
        admnorb.setText("Admission No.");
        admnorb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admnorbActionPerformed(evt);
            }
        });

        buttonGroup1.add(namerb);
        namerb.setText("Name");
        namerb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namerbActionPerformed(evt);
            }
        });

        buttonGroup1.add(classrb);
        classrb.setText("Class");
        classrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classrbActionPerformed(evt);
            }
        });

        allstudentsbutton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        allstudentsbutton.setText("Get All Students");
        allstudentsbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allstudentsbuttonActionPerformed(evt);
            }
        });

        buttonGroup1.add(statusrb);
        statusrb.setText("Status");
        statusrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusrbActionPerformed(evt);
            }
        });

        statuscb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Present", "Left", "Pass Out" }));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Status");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        changepasswordbutton.setText("Change Password");
        changepasswordbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepasswordbuttonActionPerformed(evt);
            }
        });

        homeMenu.setText("Home");
        homeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(homeMenu);

        manageMenu.setText("Manage Students");

        addMenuItem.setText("Add Student");
        addMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuItemActionPerformed(evt);
            }
        });
        manageMenu.add(addMenuItem);
        manageMenu.add(jSeparator1);

        updateStudentmi.setText("Update Student");
        updateStudentmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateStudentmiActionPerformed(evt);
            }
        });
        manageMenu.add(updateStudentmi);
        manageMenu.add(jSeparator2);

        promoteStudentmi.setText("Promote All to Next Class");
        promoteStudentmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promoteStudentmiActionPerformed(evt);
            }
        });
        manageMenu.add(promoteStudentmi);
        manageMenu.add(jSeparator3);

        jMenuBar1.add(manageMenu);

        feesMenu.setText("Fees ");

        jMenuItem5.setText("Update Course Fee");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        feesMenu.add(jMenuItem5);
        feesMenu.add(jSeparator4);

        studentfees.setText("Student Fees");
        studentfees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentfeesActionPerformed(evt);
            }
        });
        feesMenu.add(studentfees);
        feesMenu.add(jSeparator5);

        monthwisefee.setText("Update Monthwise Fee");
        monthwisefee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthwisefeeActionPerformed(evt);
            }
        });
        feesMenu.add(monthwisefee);

        jMenuBar1.add(feesMenu);

        aboutmenu.setText("About");

        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        aboutmenu.add(jMenuItem4);

        jMenuBar1.add(aboutmenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(allstudentsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(324, 324, 324)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(logoutbutton)
                                    .addComponent(changepasswordbutton)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(30, 30, 30)
                                        .addComponent(admnorb)
                                        .addGap(31, 31, 31)
                                        .addComponent(namerb)
                                        .addGap(49, 49, 49)
                                        .addComponent(classrb)
                                        .addGap(50, 50, 50)
                                        .addComponent(statusrb))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(admtf, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(classcb, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(statuscb, 0, 148, Short.MAX_VALUE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(logoutbutton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changepasswordbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admnorb)
                    .addComponent(namerb)
                    .addComponent(classrb)
                    .addComponent(statusrb))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(admtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(classcb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(statuscb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(allstudentsbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 962, 774);
    }// </editor-fold>//GEN-END:initComponents

    private void addMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuItemActionPerformed
        this.setVisible(false);
        new AddStudent().setVisible(true);
    }//GEN-LAST:event_addMenuItemActionPerformed

    private void homeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeMenuActionPerformed
       
    }//GEN-LAST:event_homeMenuActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        int dialogResult=JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "LogOut", JOptionPane.YES_NO_OPTION);
        if(dialogResult==JOptionPane.YES_OPTION)
        {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void updateStudentmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateStudentmiActionPerformed
        new UpdateStudent().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_updateStudentmiActionPerformed

    private void studentfeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentfeesActionPerformed
        new StudentFees().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_studentfeesActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        this.setVisible(false);
        new UpdateCourseFee().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void monthwisefeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthwisefeeActionPerformed
        int month = Calendar.getInstance().get(Calendar.MONTH);
        int last=sm.getLastFeesUpdatedDate();
        if(month==last)
        {
            JOptionPane.showMessageDialog(this, "Fees for this month has already been updated!");
        }
        else
        {
            sm.updateFees();
            sm.setLastFeesUpdateMonth(month);
            JOptionPane.showMessageDialog(this, "Update Successful");
        }
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_monthwisefeeActionPerformed

    private void promoteStudentmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promoteStudentmiActionPerformed
        int dialogResult=JOptionPane.showConfirmDialog(this, "Are you sure to promote students?", "Promote Students", JOptionPane.YES_NO_OPTION);
        if(dialogResult==JOptionPane.YES_OPTION)
        {
            sm.promoteStudents();
            JOptionPane.showMessageDialog(this, "All Students Promoted");
        }
        
        this.setVisible(false);
        new MainMenu().setVisible(true);
        
    }//GEN-LAST:event_promoteStudentmiActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        Student s;
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object []col=new Object[9];
        if(admnorb.isSelected())
        {
            try {
                s=sm.getStudentById(Integer.parseInt(admtf.getText()));
                if(s!=null)
                {
                    ArrayList <Student> list=new ArrayList();
                    list.add(s);

                    col[0]=list.get(0).getAdm_no();
                    col[1]=list.get(0).getName();
                    col[2]=list.get(0).getFather_name();
                    col[3]=list.get(0).getGender();
                    col[4]=list.get(0).getStandard();
                    col[5]=list.get(0).getStatus();
                    col[6]=list.get(0).getC_no();
                    col[7]=list.get(0).getMonthlyfees();
                    col[8]=list.get(0).getFeesrem();
                    model.addRow(col);

                }
                else
                 {
                     JOptionPane.showMessageDialog(this, "No Student with this Adm No. exists");
                 }              
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Enter Valid Data");
            }
           
        }
        if(namerb.isSelected())
        {
            ArrayList <Student> list=sm.getStudentByName(nametf.getText());
            
            for(int i=0;i<list.size();i++)
            {
               col[0]=list.get(i).getAdm_no();
               col[1]=list.get(i).getName();
               col[2]=list.get(i).getFather_name();
               col[3]=list.get(i).getGender();
               col[4]=list.get(i).getStandard();
               col[5]=list.get(i).getStatus();
               col[6]=list.get(i).getC_no();
               col[7]=list.get(i).getMonthlyfees();
               col[8]=list.get(i).getFeesrem();
               model.addRow(col);
            }
            
        }
        if(classrb.isSelected())
        {
            ArrayList <Student> list=sm.getStudentByClass(classcb.getSelectedItem().toString());
            
            for(int i=0;i<list.size();i++)
            {
               col[0]=list.get(i).getAdm_no();
               col[1]=list.get(i).getName();
               col[2]=list.get(i).getFather_name();
               col[3]=list.get(i).getGender();
               col[4]=list.get(i).getStandard();
               col[5]=list.get(i).getStatus();
               col[6]=list.get(i).getC_no();
               col[7]=list.get(i).getMonthlyfees();
               col[8]=list.get(i).getFeesrem();
               model.addRow(col);
            }
        }
        
        if(statusrb.isSelected())
        {
            ArrayList <Student> list=sm.getStudentsbyStatus(statuscb.getSelectedItem().toString());
            
            for(int i=0;i<list.size();i++)
            {
               col[0]=list.get(i).getAdm_no();
               col[1]=list.get(i).getName();
               col[2]=list.get(i).getFather_name();
               col[3]=list.get(i).getGender();
               col[4]=list.get(i).getStandard();
               col[5]=list.get(i).getStatus();
               col[6]=list.get(i).getC_no();
               col[7]=list.get(i).getMonthlyfees();
               col[8]=list.get(i).getFeesrem();
               model.addRow(col);
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void admnorbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admnorbActionPerformed
        admtf.setEditable(true);
        nametf.setEditable(false);
        nametf.setText("");
        classcb.setEnabled(false);
        classcb.setSelectedIndex(0);
        statuscb.setEnabled(false);
        statuscb.setSelectedIndex(0);
    }//GEN-LAST:event_admnorbActionPerformed

    private void namerbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namerbActionPerformed
        nametf.setEditable(true);
        admtf.setEditable(false);
        admtf.setText("");
        classcb.setEnabled(false);
        classcb.setSelectedIndex(0);
        statuscb.setEnabled(false);
        statuscb.setSelectedIndex(0);
    }//GEN-LAST:event_namerbActionPerformed

    private void classrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classrbActionPerformed
        classcb.setEnabled(true);
        nametf.setEditable(false);
        admtf.setEditable(false);
        admtf.setText("");
        nametf.setText("");
        classcb.setSelectedIndex(0);
        statuscb.setEnabled(false);
        statuscb.setSelectedIndex(0);
    }//GEN-LAST:event_classrbActionPerformed

    private void classcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classcbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_classcbActionPerformed

    private void allstudentsbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allstudentsbuttonActionPerformed
        buttonGroup1.clearSelection();
        classcb.setEnabled(false);
        nametf.setEditable(false);
        admtf.setEditable(false);
        admtf.setText("");
        nametf.setText("");
        classcb.setSelectedIndex(0);
        statuscb.setEnabled(false);
        statuscb.setSelectedIndex(0);
        ArrayList <Student> list=sm.getAllStudents();
        Student s;
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object []col=new Object[9];    
            for(int i=0;i<list.size();i++)
            {
               col[0]=list.get(i).getAdm_no();
               col[1]=list.get(i).getName();
               col[2]=list.get(i).getFather_name();
               col[3]=list.get(i).getGender();
               col[4]=list.get(i).getStandard();
               col[5]=list.get(i).getStatus();
               col[6]=list.get(i).getC_no();
               col[7]=list.get(i).getMonthlyfees();
               col[8]=list.get(i).getFeesrem();
               model.addRow(col);
            }
            
    }//GEN-LAST:event_allstudentsbuttonActionPerformed

    private void statusrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusrbActionPerformed
        classcb.setEnabled(false);
        nametf.setEditable(false);
        admtf.setEditable(false);
        admtf.setText("");
        nametf.setText("");
        classcb.setSelectedIndex(0);
        statuscb.setEnabled(true);
        statuscb.setSelectedIndex(0);
    }//GEN-LAST:event_statusrbActionPerformed

    private void changepasswordbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepasswordbuttonActionPerformed
        new ChangePassword().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_changepasswordbuttonActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.setVisible(false);
        new About().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutmenu;
    private javax.swing.JMenuItem addMenuItem;
    private javax.swing.JRadioButton admnorb;
    private javax.swing.JTextField admtf;
    private javax.swing.JButton allstudentsbutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton changepasswordbutton;
    private javax.swing.JComboBox<String> classcb;
    private javax.swing.JRadioButton classrb;
    private javax.swing.JMenu feesMenu;
    private javax.swing.JMenu homeMenu;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JMenu manageMenu;
    private javax.swing.JMenuItem monthwisefee;
    private javax.swing.JRadioButton namerb;
    private javax.swing.JTextField nametf;
    private javax.swing.JMenuItem promoteStudentmi;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> statuscb;
    private javax.swing.JRadioButton statusrb;
    private javax.swing.JMenuItem studentfees;
    private javax.swing.JMenuItem updateStudentmi;
    // End of variables declaration//GEN-END:variables
}