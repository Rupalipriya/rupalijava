package org.learn.collection;

import java.util.ArrayList;

public class StudentClient {
	
	void performOperation() {
	Student s1=new Student("1", 33, "C", "Steve");
	Student s2=new Student("2", 66, "B", "Smith");
	Student s3=new Student("3", 77, "A", "Rohit");
	Student s4=new Student("4", 98, "A", "Virat");
		
		/*	Student s1=new Student();
		s1.setGrade("A");
		s1.setSid("1");
		s1.setSmarks(66);
		s1.setSname("Ram");
		
		Student s2=new Student();
		s2.setGrade("A");
		s2.setSid("2");
		s2.setSmarks(75);
		s2.setSname("Shyam");
		
		Student s3=new Student();
		s3.setGrade("B");
		s3.setSid("3");
		s3.setSmarks(44);
		s3.setSname("Seeta");*/
		
		
		ArrayList<Student> students=new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		System.out.println(students);
		
		for(Student student:students) {
			System.out.println(student);
		}
		
		
	}
public static void main(String[] args) {
	StudentClient studentClient=new StudentClient();
	studentClient.performOperation();
}
}
