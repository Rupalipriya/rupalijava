package org.practice.java;
/*
 * WAP in java  create a class flight and declear variable fid,fname,fprice,destination and duration.
 * if destiantion equal to bangluru, pune ,delhi,hydrabad then set the duration 2hr.
(1)if destiantion equal to chennai, gwaliour ,chandigadh ,gujrat then set the duration 4hr

if(duration.equals(bangluru, pune ,delhi,hydrabad){
flight.setDuration(2);
}
 */
public class FlightReachDestination {
private int fid;
private String fname;
private double  fprice;
private String destination;
private int duration;
public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public double getFprice() {
	return fprice;
}
public void setFprice(double fprice) {
	this.fprice = fprice;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}

}
