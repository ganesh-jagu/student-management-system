package com.ganesh.studentmanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sid;
	private String sname;
	private String email;
	private String course;
	private String mobile;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCource() {
		return course;
	}
	public void setCource(String course) {
		this.course = course;
	}
	
	public String getMobile()
	{
		return mobile;
	}
	public void setMobile(String mobile)
	{
		this.mobile=mobile;
	}
	
	public Student() {
		
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", email=" + email + ", course=" + course + ", mobile=" + mobile + "]";
	}
	
}
