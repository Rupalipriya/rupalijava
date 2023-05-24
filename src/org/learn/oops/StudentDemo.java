package org.learn.oops;

public class StudentDemo {

	public static void main(String[] args) {
	StudentClass  studentClass =new StudentClass();
	studentClass.setSid(2);
	studentClass.setSgrade('A');
	studentClass.setSmarks(30.2f);
	studentClass.setSname("rupali");
	studentClass.setSroll(13);
	int sid=studentClass.getSid();
	char sgrade =studentClass.getSgrade();
	 float smarks=studentClass.getSmarks();
	 String sname =studentClass.getSname();
	 int  sroll=  studentClass.getSroll();
	
	if (sgrade=='A') {
		System.out.println("good stsudent");
	}
	if (smarks>=40) {
		System.out.println("pass");
		
	}
	else {
		System.out.println("fail");
	}
	

	}

}
