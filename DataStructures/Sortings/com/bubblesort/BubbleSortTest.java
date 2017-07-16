package com.bubblesort;

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] ={111,67,53,9,5,2,786,-1,8,3,2};
		
		BubbleSort bubblesort = new BubbleSort();
		bubblesort.bubblesort(array);
		System.out.println("after sorting the array...");
		bubblesort.display(array);
	}

}
