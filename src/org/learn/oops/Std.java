package org.learn.oops;

public class Std {
	
	int stdId=10;
	String stdName="Ram";
	
	public static void main(String[] args) {
		Std s=new Std();
		System.out.println(s);
	}

	@Override
	public String toString() {
		return "Std [stdId=" + stdId + ", stdName=" + stdName + "]";
	}

}
