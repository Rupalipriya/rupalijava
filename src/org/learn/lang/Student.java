package org.learn.lang;

public class Student {
	
private	int sid;
private	String Sname;
private	int contNumn;

//gettr and setter
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return Sname;
}
public void setSname(String sname) {
	Sname = sname;
}
public int getContNumn() {
	return contNumn;
}
public void setContNumn(int contNumn) {
	this.contNumn = contNumn;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", Sname=" + Sname + ", contNumn=" + contNumn + "]";
}




}
