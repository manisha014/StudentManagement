
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Student {
    private int adm_no;
    private String name;
    private String father_name;
    private String mother_name;
    private String adhaar_no;
    private char gender;
    private String dob;
    private String address;
    private String c_no;
    private String standard;
    private int monthlyfees;
    private int feespaid;
    private int feesrem;
    private String status;
      
    
    
    public Student()
    {
    }

    public void setC_no(String c_no) {
        this.c_no = c_no;
    }

    public String getC_no() {
        return c_no;
    }
    public Student(int adm_no, String name, String father_name, String mother_name, String adhaar_no, char gender, String dob, String address, String c_no, String std) {
        this.adm_no=adm_no;
        this.name = name;
        this.father_name = father_name;
        this.mother_name = mother_name;
        this.adhaar_no = adhaar_no;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.c_no = c_no;
        this.standard=std;
        
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public int getMonthlyfees() {
        return monthlyfees;
    }

    public void setMonthlyfees(int monthlyfees) {
        this.monthlyfees = monthlyfees;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public void setFeespaid(int feespaid) {
        this.feespaid = feespaid;
    }

    public int getFeesrem() {
        return feesrem;
    }

    public void setFeesrem(int feesrem) {
        this.feesrem = feesrem;
    }

    public void setAdm_no(int adm_no) {
        this.adm_no = adm_no;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getStandard() {
        return standard;
    }

    
    public int getAdm_no() {
        return adm_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public String getMother_name() {
        return mother_name;
    }

    public void setMother_name(String mother_name) {
        this.mother_name = mother_name;
    }

    public String getAdhaar_no() {
        return adhaar_no;
    }

    public void setAdhaar_no(String adhaar_no) {
        this.adhaar_no = adhaar_no;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
