package com.CQJTU.pojo;

import java.util.Date;

public class Student {
    private String id;

    private String studentName;

    private String idCard;

    private String phoneNumber;

    private Date startYear;

    private String studentSource;

    private String major;

    private String className;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getStartYear() {
        return startYear;
    }

    public void setStartYear(Date startYear) {
        this.startYear = startYear;
    }

    public String getStudentSource() {
        return studentSource;
    }

    public void setStudentSource(String studentSource) {
        this.studentSource = studentSource;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", studentName='" + studentName + '\'' +
                ", idCard='" + idCard + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", startYear=" + startYear +
                ", studentSource='" + studentSource + '\'' +
                ", major='" + major + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
