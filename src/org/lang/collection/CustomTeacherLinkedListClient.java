package org.lang.collection;

import java.util.LinkedList;

public class CustomTeacherLinkedListClient {

	void customteacherclient() {
		CustomTeacherLinkedList ct = new CustomTeacherLinkedList(1, "steave", "math", "983597");
		CustomTeacherLinkedList ct1 = new CustomTeacherLinkedList(2, "ram", "science", "8773856");
		CustomTeacherLinkedList ct2 = new CustomTeacherLinkedList(3, "rupali", "sst", "8678930");
		CustomTeacherLinkedList ct3 = new CustomTeacherLinkedList(4, "priya", "hindi", "854925");
		CustomTeacherLinkedList ct4 = new CustomTeacherLinkedList(5, "rita", "eng", "979856890");

		LinkedList<CustomTeacherLinkedList> l1 = new LinkedList<CustomTeacherLinkedList>();
		l1.add(ct);
		l1.add(ct1);
		l1.add(ct2);
		l1.add(ct3);
		l1.add(ct4);
		System.out.println(l1);
		for (CustomTeacherLinkedList clt : l1) {
			System.out.println(clt);

		} 

	}

	public static void main(String[] args) {
		CustomTeacherLinkedListClient cc = new CustomTeacherLinkedListClient();
		cc.customteacherclient();

	}

}
