package org.learn.oops;
/*
 * WAP in java  create a class flight  and declear variable fid,fname,fprice,destination and duration.
 * if destiantion equal to bangluru, pune ,delhi,hydrabad then set the duration 2hr.
(1)if destiantion equal to chennai, gwaliour ,chandigadh ,gujrat then set the duration 4 hr
 */
public class FlightDemo {

	public static void main(String[] args) {
		
		FlightClass flightClass=new FlightClass();
		flightClass.setFid(234);
		flightClass.setFname("spicesjet");
		//flightClass.setFprice(6000);
		//flightClass.setDuration(4);
		flightClass.setDestination("pune");
		String destination =flightClass.getDestination();
		
		if(destination .equals("bangluru")|| destination.equals("pune")||destination.equals("delhi")||destination.equals("hydrabad")){
			flightClass.setDuration(2);
			flightClass.setFprice(12000);
			System.out.println(flightClass.getDuration());
			System.out.println(flightClass.getFprice());
			}
		else if(destination .equals("chennai")|| destination.equals("gwaliour")||destination.equals("chandigadh")||destination.equals("gujrat ")){
			flightClass.setDuration(4);
			flightClass.setFprice(14000);
			System.out.println(flightClass.getDuration());
			System.out.println(flightClass.getFprice());
	}

}
}