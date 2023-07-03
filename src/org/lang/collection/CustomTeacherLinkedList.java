package org.lang.collection;

public class CustomTeacherLinkedList {
   private int tid;
   private String tname;
   private String tsub;
   private String tcont;
   
   CustomTeacherLinkedList(){
   }

public CustomTeacherLinkedList(int tid, String tname, String tsub, String tcont) {
	super();
	this.tid = tid;
	this.tname = tname;
	this.tsub = tsub;
	this.tcont = tcont;
}

public int getTid() {
	return tid;
}

public void setTid(int tid) {
	this.tid = tid;
}

public String getTname() {
	return tname;
}

public void setTname(String tname) {
	this.tname = tname;
}

public String getTsub() {
	return tsub;
}

public void setTsub(String tsub) {
	this.tsub = tsub;
}

public String getTcont() {
	return tcont;
}

public void setTcont(String tcont) {
	this.tcont = tcont;
}

@Override
public String toString() {
	return "TeacherLinkedList [tid=" + tid + ", tname=" + tname + ", tsub=" + tsub + ", tcont=" + tcont + "]";
}  
   
}
