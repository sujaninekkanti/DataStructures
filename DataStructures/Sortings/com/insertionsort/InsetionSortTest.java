package com.insertionsort;

public class InsetionSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] ={111,67,53,9,5,2,786,-1,8,3};
		InsertionSort insertionsort = new InsertionSort();
		insertionsort.insertsort(array);
		
		System.out.println("after sorting ");
		insertionsort.display(array);
	}

}
