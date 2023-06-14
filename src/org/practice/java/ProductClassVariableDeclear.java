package org.practice.java;
/*
 * WAP in java in which create a class product and 
 * delcear veriable pid ,pname, pprice, pquantity and pavailablity.
 * now if pprice is greater than amd equal to 10k then give 2% discount .
(1) if pprice is greater than and equal to 30k then give 8% discount.
(2)  if pprice is greater than amd equal to 50k then give 15% discount.
pquantity is less tahn and equal to 2 then print "product out of stock"
 */
public class ProductClassVariableDeclear {

	public static void main(String[] args) {
		
		ProductClassDeclearVariable productClassDeclearVariable=new ProductClassDeclearVariable();
		productClassDeclearVariable.setPid(201);
		productClassDeclearVariable.setPname("Soni TV");
		productClassDeclearVariable.setPprice(50000);
		productClassDeclearVariable.setPquantity(100);
		productClassDeclearVariable.setPavaialablity("yes");
	double pprice =	productClassDeclearVariable.getPprice();
	 int pquantity =productClassDeclearVariable.getPquantity();
	 
	 if(pprice>=10000) {
		 double dis=(pprice*2)/100;
		 pprice=pprice-dis;
		 System.out.println("discount 2% " +pprice);
		 
	 }
	 if(pprice >=30000) {
		 double dis=(pprice*8)/100;
		 pprice= pprice-dis;
		 System.out.println("discount 8% " +pprice);
	 }
	 if(pprice >=50000) {
		 double dis=(pprice*15)/100;
		 pprice= pprice-dis;
		 System.out.println("discount 15 % " +pprice);
	 }
	 if(pquantity<=2) {
		 System.out.println("product out of stock");
	 }
	 
	}

}
