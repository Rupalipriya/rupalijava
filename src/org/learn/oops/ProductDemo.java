package org.learn.oops;

/*
 * .WAP in java in which create a class product and delcear veriable pid ,pname, pprice, pquantity and pavailablity.
 * now if pprice is greater than and equal to 10k then give 2% discount .
(1) if pprice is greater than and equal to 30k then give 8% discount.
(2)  if pprice is greater than and equal to 50k then give 15% discount.
pquantity is less than and equal to 2 then print "product out of stock"
 */
public class ProductDemo {

	public static void main(String[] args) {
		ProductClass productClass = new ProductClass();
		productClass.setPid(121);
		productClass.setPname("face wash");
		productClass.setPprice(80000);
		productClass.setPquantity(20);
		productClass.setPavailablity("in stock");
		double pprice = productClass.getPprice();
		double pquantity = productClass.getPquantity();

		if (pprice>=0 && pprice<=10000) {
			double dis = (pprice * 2) / 100;
			pprice = pprice - dis;

			System.out.println("2% discount " + pprice);
		}
		if (pprice>10000 && pprice<=30000) {
			double dis = (pprice * 8) / 100;
			pprice = pprice - dis;
			System.out.println("8% discount " + pprice);
		}
		if (pprice>30000 && pprice>=50000) {
			double dis = (pprice * 15) / 100;
			pprice = pprice - dis;
			System.out.println("15% discount " + pprice);
		}
		if (pquantity <= 2) {
			System.out.println("product out of stock");
		}
	}
}
