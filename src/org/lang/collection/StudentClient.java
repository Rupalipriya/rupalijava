package org.lang.collection;

import java.util.ArrayList;

public class StudentClient {
	void performance() {
		Student s1=new Student("rupali", "1", 67, "A");
		Student s2=new Student("reeta", "2", 56, "B");
		Student s3=new Student("ram", "3", 33, "c");
	
      ArrayList<Student> students=new ArrayList<Student>();
      students.add(s1);
      students.add(s2);
      students.add(s3);
      System.out.println(students);
      for(Student student:students) {
    	  System.out.println(student);
      }
	} 
	public static void main(String[] args) {
		StudentClient studentClient=new StudentClient();
		 studentClient.performance();

	}

}
