package com.hashmap;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap map = new HashMap();
		
		System.out.println("the size of current size of hashmap is :"+map.size);
		
		System.out.println("is hashmap empty : " +map.isHashMapEmpty());
		
		map.put(1, 1111);
		
		map.put(3, 45678);
		
		map.put(343, 786);
		
		System.out.println("after inserting the entry into hashmap");
		 
        System.out.println("the size of current size of hashmap is :"+map.size);
		
		System.out.println("is hashmap empty : " +map.isHashMapEmpty());
		
		System.out.println("the value of a particular key is "+map.getValue(1));
		
		System.out.println("the total contents in the hash map are :");
		
		System.out.println("key  value");
		
		map.printHashMap();
		
		
		map.remove(343);
		
		System.out.println("after removing the entry");
		
		map.printHashMap();
		
		map.makeHashMapEmtpy();
		
		System.out.println("is hashmap empty : " +map.isHashMapEmpty());
		
		System.out.println("the size of current size of hashmap is :"+map.size);
		
	}

}
