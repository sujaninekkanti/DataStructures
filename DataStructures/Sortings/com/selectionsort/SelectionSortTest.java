package com.selectionsort;

public class SelectionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] ={111,67,53,9,5,2,786,-1,8,3,2};
		SelectionSort selectionsort = new SelectionSort();
		
		selectionsort.selectionsort(array);
		
		
		System.out.println("after sorting the array..");
		selectionsort.print(array);
	}

}
