package com.hashmap;

public class HashEntry {

	int key;
	int value;
	HashEntry next;
	
	
	
	public HashEntry(int key, int value) {
		
		this.key = key;
		this.value = value;
	}



	public int getKey() {
		return key;
	}



	public void setKey(int key) {
		this.key = key;
	}



	public int getValue() {
		return value;
	}



	public void setValue(int value) {
		this.value = value;
	}



	public HashEntry getNext() {
		return next;
	}



	public void setNext(HashEntry next) {
		this.next = next;
	}
	
	
	
}
