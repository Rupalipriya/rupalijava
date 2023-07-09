package org.learn.collection;


public class Student1 {
	
	private String sid;
	private Integer smarks;
	private String grade;
	private String sname;
	
	Student1(){
	}
	
	
	public Student1(String sid, Integer smarks, String grade, String sname) {
		super();
		this.sid = sid;
		this.smarks = smarks;
		this.grade = grade;
		this.sname = sname;
	}


	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public Integer getSmarks() {
		return smarks;
	}
	public void setSmarks(Integer smarks) {
		this.smarks = smarks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", smarks=" + smarks + ", grade=" + grade + ", sname=" + sname + "]";
	}


	

}
