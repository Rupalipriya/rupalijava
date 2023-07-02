package org.lang.collection;

import java.util.ArrayList;

public class CustomStudentClassArrayListClient {
	    void performoperation() {
		CustomStudentClassArrayList cs = new CustomStudentClassArrayList(1, "rupali", "A+", 98);
		CustomStudentClassArrayList cs1 = new CustomStudentClassArrayList(2, "priya", "A", 80);
		CustomStudentClassArrayList cs2 = new CustomStudentClassArrayList(3, "rohit", "B+", 60);
		CustomStudentClassArrayList cs3 = new CustomStudentClassArrayList(4, "ram", "B", 55);
		CustomStudentClassArrayList cs4 = new CustomStudentClassArrayList(5, "pooja", "C", 45);
		CustomStudentClassArrayList cs5 = new CustomStudentClassArrayList(6, "virat", "D", 30);

		ArrayList<CustomStudentClassArrayList> CustomStudentClassArrayLists = new ArrayList<CustomStudentClassArrayList>();
		CustomStudentClassArrayLists.add(cs);
		CustomStudentClassArrayLists.add(cs1);
		CustomStudentClassArrayLists.add(cs2);
		CustomStudentClassArrayLists.add(cs3);
		CustomStudentClassArrayLists.add(cs4);
		CustomStudentClassArrayLists.add(cs5);
		System.out.println(CustomStudentClassArrayLists);
		for (CustomStudentClassArrayList csca : CustomStudentClassArrayLists) {
			System.out.println(csca);
		}

	}

	public static void main(String[] args) {
		CustomStudentClassArrayListClient customStudentClassArrayListClient = new CustomStudentClassArrayListClient();
		customStudentClassArrayListClient.performoperation();

	}

}
