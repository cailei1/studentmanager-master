package com.wdd.studentmanager.domain;

import java.util.Date;

/**
 * 班级实体类
 */
public class Clazz {
	private Integer id;
	private String name;
	private String sex;
	private String mobile;
	private String sanitation;
	private String teacher;
	private String su;
	private String status;
	private String info;
	private Date date;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSanitation() {
		return sanitation;
	}

	public void setSanitation(String sanitation) {
		this.sanitation = sanitation;
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


	@Override
	public String toString() {
		return "Clazz{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", mobile='" + mobile + '\'' +
				", sanitation='" + sanitation + '\'' +
				", teacher='" + teacher + '\'' +
				", su='" + su + '\'' +
				", status='" + status + '\'' +
				", info='" + info + '\'' +
				", date=" + date +
				'}';
	}
}
