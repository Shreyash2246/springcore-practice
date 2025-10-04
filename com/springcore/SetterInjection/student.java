package com.springcore.SetterInjection;

//dependent class for setter injection
public class student {
    private String studentName;
    private int studentRollNo;

    //setter methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentRollNo(int studentRollNo) {
        this.studentRollNo = studentRollNo;
    }

    //default constructor
    public student() {
        super();
    }
    
    @Override
    public String toString() {
        return "student [studentName=" + studentName + ", studentRollNo=" + studentRollNo + "]";
    }
}
