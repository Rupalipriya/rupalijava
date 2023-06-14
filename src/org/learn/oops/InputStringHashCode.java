package org.learn.oops;

import java.util.Objects;

public class InputStringHashCode {
	
private String s="welcome";

@Override
public int hashCode() {
	return Objects.hash(s);
	
	
}

public String getS() {
	return s;
}

public void setS(String s) {
	this.s = s;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	InputStringHashCode other = (InputStringHashCode) obj;
	return Objects.equals(s, other.s);
}

}
