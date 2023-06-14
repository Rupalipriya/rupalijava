package org.practice.java;
/*
 * WAP in java in which create a class product and
 *  Declare variable pid ,pname, pprice, pquantity and pavailablity.
 *  now if pprice is greater than amd equal to 10k then give 2% discount .
(1) if pprice is greater than amd equal to 30k then give 8% discount.
(2)  if pprice is greater than amd equal to 50k then give 15% discount.
pquantity is less tahn and equal to 2 then print "product out of stock"
 */
public class ProductClassDeclearVariable {
private int pid;
private String pname;
private double pprice;
private int pquantity;
private String pavaialablity;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPprice() {
	return pprice;
}
public void setPprice(double pprice) {
	this.pprice = pprice;
}
public int getPquantity() {
	return pquantity;
}
public void setPquantity(int pquantity) {
	this.pquantity = pquantity;
}
public String getPavaialablity() {
	return pavaialablity;
}
public void setPavaialablity(String pavaialablity) {
	this.pavaialablity = pavaialablity;
}

}
