package com.jb.hashmapitr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapItr {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new  HashMap<Integer,String>();
		hm.put(10, "neha");
		hm.put(10, "desh");//for duplicate key it will take latest value
		Set<Entry<Integer, String>> entry=hm.entrySet();
		
		
		for(Entry<Integer, String> entryset:entry){
			
			
			System.out.println(entryset.getKey()+":"+entryset.getValue());
			
			
			
		}
		
		
		
		
		
	}

}
