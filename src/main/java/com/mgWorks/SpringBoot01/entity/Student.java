package com.mgWorks.SpringBoot01.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String sname;
	private String saddr;
	private float sfee;
	private long smobile;
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
	public String getSaddr() {
		return saddr;
	}
	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}
	public float getSfee() {
		return sfee;
	}
	public void setSfee(float sfee) {
		this.sfee = sfee;
	}
	public long getSmobile() {
		return smobile;
	}
	public void setSmobile(long smobile) {
		this.smobile = smobile;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddr=" + saddr + ", sfee=" + sfee + ", smobile="
				+ smobile + "]";
	}
	
	
}
