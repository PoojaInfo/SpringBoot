package com.cjc.curd.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int sid;
	private String sname;
	private String addr;
	private String password;
	
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
