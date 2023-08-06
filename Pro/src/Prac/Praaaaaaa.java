package Prac;

import java.util.Iterator;
import java.util.Scanner;

public class Praaaaaaa {
	public static void main(String[] args) {
		int firstTerm =1;
		int secTerm =1;
		int nextTerm ;
		int sum =  firstTerm + secTerm ;
		
	System.out.printf("%d+%d+", firstTerm, secTerm);
			
	while ((nextTerm= firstTerm +secTerm)<= 100) {
		System.out.printf("%d+", nextTerm);
		firstTerm = secTerm;
		secTerm=nextTerm;
		sum += nextTerm ;
	}
	System.out.printf("\b=%d\n",sum);	
	} // main

}
