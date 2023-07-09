package org.learn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSort1 {
	
	public static void main(String[] args) {
		Student1 s1=new Student1("5", 12, "HHH", "HHHH");
		Student1 s2=new Student1("1", 13, "FFF", "FFF");
		Student1 s3=new Student1("10", 8, "AAA", "AAA");
		Student1 s4=new Student1("2", 7, "ZZZ", "ZZZ");
		Student1 s5=new Student1("9", 15, "SSS", "SSS");
		List<Student1> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Collections.sort(list, new Student1Comparator());
		for (Student1 student1 : list) {
			System.out.println(student1);
		}
		
	}

}
