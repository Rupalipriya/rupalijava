package org.lang.collection;

public class CustomStudentClassArrayList {
	private Integer sid;
	private String sname;
	private String sgrade;
	private Integer smarks;
	
	CustomStudentClassArrayList(){
		
	}

	public CustomStudentClassArrayList(Integer sid, String sname, String sgrade, Integer smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sgrade = sgrade;
		this.smarks = smarks;
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

	public String getSgrade() {
		return sgrade;
	}

	public void setSgrade(String sgrade) {
		this.sgrade = sgrade;
	}

	public Integer getSmarks() {
		return smarks;
	}

	public void setSmarks(Integer smarks) {
		this.smarks = smarks;
	}

	@Override
	public String toString() {
		return "CustomStudentClassArrayList [sid=" + sid + ", sname=" + sname + ", sgrade=" + sgrade + ", smarks="
				+ smarks + "]";
	}

}
