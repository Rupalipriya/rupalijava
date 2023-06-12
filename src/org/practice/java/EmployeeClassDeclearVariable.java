package org.practice.java;
/*
 * .WAP in java to create a class employee declear veriable empid,empname,empddesignation,empsal,empcountry
and generate getterand setter method. now if empsalry smallerthan equal than 50k then print "grade c" employee and give increament of 10% .
(1)if empsalry smallerthan equal than 70k then print grade B employee and give increament of 5% .
(2)if empsalry smallerthan equal than 90k then print grade A employee and give increament of 2% .
(3)if empcountry is equal india  then print "amazonvouchar" .
 */
public class EmployeeClassDeclearVariable {
	private  int empid;
	private String empname;
	private String empddesignation;
	private double empsalary;
	private String empcountry;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpddesignation() {
		return empddesignation;
	}
	public void setEmpddesignation(String empddesignation) {
		this.empddesignation = empddesignation;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public String getEmpcountry() {
		return empcountry;
	}
	public void setEmpcountry(String empcountry) {
		this.empcountry = empcountry;
	}
	

}
