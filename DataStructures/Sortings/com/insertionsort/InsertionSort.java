package com.insertionsort;

public class InsertionSort {

	public void insertsort(int array[]){
		int length = array.length;
		
		for(int i=1;i<length-1;i++){
			
			int value = array[i];
			int hole =i;
			//this is to shift the greater elements than the value
			while(hole > 0 && array[hole-1] > value){
				
				array[hole] = array[hole-1];
				//new hole will be at hole-1
				hole = hole-1;
			}
			//put the value into the hole
			array[hole] = value;
		}
	}
	
	
	public void display(int array[]){
		int length = array.length;
		for(int i=0;i<length;i++){
			System.out.println(array[i]);
		}
	}
}
