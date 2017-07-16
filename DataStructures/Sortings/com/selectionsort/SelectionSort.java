package com.selectionsort;

public class SelectionSort {

	public void selectionsort(int array[]){
		int length = array.length;
		for(int i=0;i<length-1;i++){
			//stores the index of minimum element
			// 1st min element is stored at index 0 
			//2nd min element is stored at index 1
			
			
			
			//find the minimum element in an array
			int min_index = i;
			
			for(int j=i+1;j<length;j++){
				
				if(array[j]<array[min_index]){
					//update the minimum element
					min_index =j;
					//for swapping the elements which is less than current minimum 
					//element
					int temp = array[min_index];
					array[min_index] = array[i];
					array[i] = temp;
				}
			}
		}
	}
	public void print(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
}
