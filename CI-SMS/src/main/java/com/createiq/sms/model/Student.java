package com.createiq.sms.model;

public class Student {

	private Integer sid;
	private String sname;
	private Double sfee;

	public Student(Integer sid, String sname, Double sfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Double getSfee() {
		return sfee;
	}

	public void setSfee(Double sfee) {
		this.sfee = sfee;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
	}

}
