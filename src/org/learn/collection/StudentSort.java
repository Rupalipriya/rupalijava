package org.learn.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class StudentSort {
	
	public static void main(String[] args) {
		Student s1=new Student("5", 12, "HHH", "HHHH");
		Student s2=new Student("1", 13, "FFF", "FFF");
		Student s3=new Student("10", 8, "AAA", "AAA");
		Student s4=new Student("2", 7, "ZZZ", "ZZZ");
		Student s5=new Student("9", 15, "SSS", "SSS");
		Student s6=new Student("9", 15, "SSS", "SSS");
		List<Student> list=new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println(list);
		Collections.sort(list);
for (Student student : list) {
	System.out.println(student);
}
System.out.println(Collections.binarySearch(list, s6));
	}

}
