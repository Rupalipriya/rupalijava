package org.learn.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		System.out.println(map);
		map.put(3, "DDD");//Duplicate key
		System.out.println(map);
		map.put(4, "BBB");//duplicate value
		System.out.println(map);
		map.put(null, "TTTT");
		System.out.println(map);
		map.put(null, "MMM");//duplicate nulll as key
		System.out.println(map);
	}

}
