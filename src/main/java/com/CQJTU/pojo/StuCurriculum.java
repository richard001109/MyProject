package com.CQJTU.pojo;

public class StuCurriculum {
    private Integer id;

    private Integer courseId;

    private String courseName;

    private String courseNature;

    private String courseSelectedId;

    private String courseSelectedStu;

    private String courseStatus;

    private Integer grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNature() {
        return courseNature;
    }

    public void setCourseNature(String courseNature) {
        this.courseNature = courseNature;
    }

    public String getCourseSelectedId() {
        return courseSelectedId;
    }

    public void setCourseSelectedId(String courseSelectedId) {
        this.courseSelectedId = courseSelectedId;
    }

    public String getCourseSelectedStu() {
        return courseSelectedStu;
    }

    public void setCourseSelectedStu(String courseSelectedStu) {
        this.courseSelectedStu = courseSelectedStu;
    }

    public String getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(String courseStatus) {
        this.courseStatus = courseStatus;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }



    @Override
    public String toString() {
        return "StuCurriculum{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseNature='" + courseNature + '\'' +
                ", courseSelectedId='" + courseSelectedId + '\'' +
                ", courseSelectedStu='" + courseSelectedStu + '\'' +
                ", courseStatus='" + courseStatus + '\'' +
                ", grade=" + grade +
                '}';
    }
}
