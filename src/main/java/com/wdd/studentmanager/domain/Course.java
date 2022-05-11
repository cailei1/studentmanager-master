package com.wdd.studentmanager.domain;

/**
 * @Classname Course
 * @Description None
 * @Date 2019/6/29 20:06
 * @Created by WDD
 */
public class Course {
    private int id;
    private String name;
    private int teacherId;
    private String courseDate;
    private int selectedNum = 0;//已选人数
    private int maxNum = 50;//课程最大选课人数
    private String info;
    private int applyState = 0;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseDate() {
        return courseDate;
    }

    public void setCourseDate(String courseDate) {
        this.courseDate = courseDate;
    }

    public int getSelectedNum() {
        return selectedNum;
    }

    public void setSelectedNum(int selectedNum) {
        this.selectedNum = selectedNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getApplyState() {
        return applyState;
    }

    public void setApplyState(int applyState) {
        this.applyState = applyState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
