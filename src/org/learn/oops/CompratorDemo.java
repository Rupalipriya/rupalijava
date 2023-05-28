package org.learn.oops;

import java.util.Comparator;

public class CompratorDemo implements Comparator<String> {
	
	@Override
	public int compare(String o1, String o2) {
		int reslt=o2.compareTo(o1);
		return reslt;
	}

}
