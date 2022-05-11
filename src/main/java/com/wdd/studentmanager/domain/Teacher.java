package com.wdd.studentmanager.domain;

import java.util.Date;

/**
 * @Classname Teacher
 * @Description None
 * @Date 2019/6/28 18:55
 * @Created by WDD
 */
public class Teacher {
    private int id;
    private String name;
    private String precedent;
    private String sex = "男";
    private String mobile;
    private String teacher;
    private String su;
    private String status;
    private String info;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrecedent() {
        return precedent;
    }

    public void setPrecedent(String precedent) {
        this.precedent = precedent;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSu() {
        return su;
    }

    public void setSu(String su) {
        this.su = su;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
