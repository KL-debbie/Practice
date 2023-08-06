package Prac;

import java.util.Iterator;
import java.util.Scanner;

public class Pra {

	public static void main(String[] args) {
		//피보나치수열
		// 1+1+2+3+5+8+------+100번째 항
		
		int firstTerm =1;
		int secTerm =1;
		int sum =firstTerm+secTerm;
		int nextTerm;
		
		System.out.printf("%d+%d+", firstTerm ,secTerm);
		
		while ((nextTerm = firstTerm + secTerm)<=100) {
			System.out.printf("%d+",nextTerm);
			sum += nextTerm;
			firstTerm = secTerm;
			secTerm = nextTerm;
		}
		System.out.printf("\b=%d\n",sum);
	}//main

}// class
