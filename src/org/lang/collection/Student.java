package org.lang.collection;

public class Student {
	private String sname;
	private String sid;
	private Integer smark;
	private String sgrade;
	
	Student(){
		
	}

	public Student(String sname, String sid, Integer smark, String sgrade) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.smark = smark;
		this.sgrade = sgrade;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public Integer getSmark() {
		return smark;
	}

	public void setSmark(Integer smark) {
		this.smark = smark;
	}

	public String getSgrade() {
		return sgrade;
	}

	public void setSgrade(String sgrade) {
		this.sgrade = sgrade;
	}

	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", smark=" + smark + ", sgrade=" + sgrade + "]";
	}

}