package com.bubblesort;

public class BubbleSort {

	/**
	 * @param array
	 * each element in the array is compared to next element and
	 * max element is bubbled to the end of array
	 */
	public void bubblesort(int array[]){
		
		int length = array.length;
		boolean swapped;
		
		
		for(int i=0;i<length-1;i++){
			
			//inner for loop is to compare the adjacent elements in the array
			//and to swap the elements..
			swapped = false;
			for(int j=0;j<length-1-i;j++){
				
				if(array[j]>array[j+1]){
					
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					swapped = true;
				}
			}
			//if the elements are not swapped break the loop
			if(swapped == false){
				break;
			}
		}
	}
	
	public void display(int array[]){
		int length = array.length;
		for(int i=0;i<length;i++){
			System.out.println(array[i]);
		}
	}
}
