package org.learn.lang;

public class StudentHash {
	
private	String sname;
private	int roll;

@Override
public int hashCode() {
	return roll;
	
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	StudentHash other = (StudentHash) obj;
	if (roll != other.roll)
		return false;
	if (sname == null) {
		if (other.sname != null)
			return false;
	} else if (!sname.equals(other.sname))
		return false;
	return true;
}



}
