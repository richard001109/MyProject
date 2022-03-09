package com.CQJTU.pojo;

public class TrainingProgram {
    private Integer courseId;

    private String courseName;

    private String courseNature;

    private String courseMajor;

    private String courseTeacher;

    private String courseAttributes;

    private String preliminaryCourse;

    private String followupCourse;

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

    public String getCourseMajor() {
        return courseMajor;
    }

    public void setCourseMajor(String courseMajor) {
        this.courseMajor = courseMajor;
    }

    public String getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(String courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public String getCourseAttributes() {
        return courseAttributes;
    }

    public void setCourseAttributes(String courseAttributes) {
        this.courseAttributes = courseAttributes;
    }

    public String getPreliminaryCourse() {
        return preliminaryCourse;
    }

    public void setPreliminaryCourse(String preliminaryCourse) {
        this.preliminaryCourse = preliminaryCourse;
    }

    public String getFollowupCourse() {
        return followupCourse;
    }

    public void setFollowupCourse(String followupCourse) {
        this.followupCourse = followupCourse;
    }

    @Override
    public String toString() {
        return "TrainingProgram{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseNature='" + courseNature + '\'' +
                ", courseMajor='" + courseMajor + '\'' +
                ", courseTeacher='" + courseTeacher + '\'' +
                ", courseAttributes='" + courseAttributes + '\'' +
                ", preliminaryCourse='" + preliminaryCourse + '\'' +
                ", followupCourse='" + followupCourse + '\'' +
                '}';
    }
}
