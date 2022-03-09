package com.CQJTU.pojo;

public class ClassInfo {
    private String className;

    private Integer studentNum;

    private String monitor;

    private String studyCommittee;

    private String lifeCommittee;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getStudyCommittee() {
        return studyCommittee;
    }

    public void setStudyCommittee(String studyCommittee) {
        this.studyCommittee = studyCommittee;
    }

    public String getLifeCommittee() {
        return lifeCommittee;
    }

    public void setLifeCommittee(String lifeCommittee) {
        this.lifeCommittee = lifeCommittee;
    }

    @Override
    public String toString() {
        return "ClassInfo{" +
                "className='" + className + '\'' +
                ", studentNum=" + studentNum +
                ", monitor='" + monitor + '\'' +
                ", studyCommittee='" + studyCommittee + '\'' +
                ", lifeCommittee='" + lifeCommittee + '\'' +
                '}';
    }
}
