package org.learn.collection;

import java.util.Comparator;

public class Student1Comparator implements Comparator<Student1> {
	
	@Override
	public int compare(Student1 o1, Student1 o2) {
	//	return o1.getSmarks().compareTo(o2.getSmarks());//ascending order
		//return o2.getSmarks().compareTo(o1.getSmarks());//descending order
		int rval = 0;
		if(o1.getSmarks()<o2.getSmarks()) {
			rval=1;
			return rval;
		}
		else if(o1.getSmarks()>o2.getSmarks()) {
			rval=-1;
			return rval;
		}
		else if(o1.getSmarks()==o2.getSmarks()) {
			rval=0;
			return rval;
		}
		return rval;
	}

}
