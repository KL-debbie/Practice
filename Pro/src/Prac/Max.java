package Prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Max {

	public static void main(String[] args) {
		int[] m = {3,2,4,1,5};

		//bubblesort(m);

		selectSort(m);

	} // main

	private static void selectSort(int[] m) {
	for (int i = 0; i < m.length; i++) {
		int minIndex=i;
				for (int j = i+1; j < m.length; j++) {
					if(m[minIndex ]>m[j]) minIndex= j;
				} // for
				int temp= m[i];
				m[i] = m[minIndex];
				m[minIndex]= temp;
			System.out.println(Arrays.toString(m));	
	} // for
		
	}

	private static void bubblesort(int[] m) {
		for (int i = 1; i <=4; i++) {
			for (int j = 0; j <4-i; j++) {
				System.out.printf("%d -%d", j,j+1);
				if(m[j]>m[j+1]) {	
					System.out.print( " *** ");
					int temp = m[j];
					m[j]=m[j+1];
					m[j+1]=temp;
				}
				System.out.println(Arrays.toString(m));
			} // for
			System.out.println();
		} // for

	}

}

