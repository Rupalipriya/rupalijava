package org.learn.oops;

/*
 * WAP in java in which create a class product and delcear veriable pid ,pname, pprice, pquantity and pavailablity.now if pprice is greater than amd equal to 10k then give 2% discount .
(1) if pprice is greater than amd equal to 30k then give 8% discount.
(2)  if pprice is greater than amd equal to 50k then give 15% discount.
pquantity is less tahn and equal to 2 then print "product out of stock"
 */
public class ProductClass {
	private int pid;
	private String pname;
	private double pprice;
	private double pquantity;
	private String pavailablity;

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

	public double getPquantity() {
		return pquantity;
	}

	public void setPquantity(double pquantity) {
		this.pquantity = pquantity;
	}

	public String getPavailablity() {
		return pavailablity;
	}

	public void setPavailablity(String pavailablity) {
		this.pavailablity = pavailablity;
	}

}
