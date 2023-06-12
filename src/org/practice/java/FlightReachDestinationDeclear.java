package org.practice.java;

/*
 * WAP in java  create a class flight  and declear variable fid,fname,fprice,destination and duration.
 * if destiantion equal to bangluru, pune ,delhi,hydrabad then set the duration 2hr.
(1)if destiantion equal to chennai, gwaliour ,chandigadh ,gujrat then set the duration 4hr

if(duration.equals(bangluru, pune ,delhi,hydrabad){
flight.setDuration(2);
if(destination .equals("bangluru")|| destination.equals("pune")||destination.equals("delhi")||destination.equals("hydrabad")){
			flightClass.setDuration(2);
			flightClass.setFprice(12000);

}
 */
public class FlightReachDestinationDeclear {

	public static void main(String[] args) {
		FlightReachDestination flightReachDestination = new FlightReachDestination();
		flightReachDestination.setFid(3);
		flightReachDestination.setFname("spice jet");
		// flightReachDestination.setDuration(2);
		flightReachDestination.setDestination("delhi");
		// flightReachDestination.setFprice(40000);
		String destination = flightReachDestination.getDestination();

		if (destination.equals("bangluru") || destination.equals("pune") || destination.equals("delhi")
				|| destination.equals("hydrabad")) {
			flightReachDestination.setDuration(2);
			flightReachDestination.setFprice(40000);

			System.out.println(flightReachDestination.getDuration());
			System.out.println(flightReachDestination.getFprice());
		} else {
			if (destination.equals("chennai") || destination.equals("gwaliour") || destination.equals("chandigadh")
					|| destination.equals("gujrat"))
				flightReachDestination.setDuration(4);
			flightReachDestination.setFprice(20000);

			System.out.println(flightReachDestination.getDuration());
			System.out.println(flightReachDestination.getFprice());
		}
	}
}