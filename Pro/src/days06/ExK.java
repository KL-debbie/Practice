package days06;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class ExK {
	public static void main(String[] args) throws IOException {

		//                   공백  *
		//*****        i=1   j=0  j=5
		//_***         i=2   j=1  j=3
		//__*          i=3   j=2  j=1
		// 공백 i+j
		// *     i+j = 6, 5, 4
		
		for(int i = 1; i<=3; i++){
			for(int j =1; j<=i-1 ; j++){
				System.out.print("_");
			}
			for(int j =5; j%2==1  ; j--){
				System.out.print("*");
			}
			System.out.println();
		}


		/*
		for (int i = 1; i <=5; i++) { 
			// 공백 for
			//for (int j = 1 ; j <=3-i< 0? -1*(3-i) : 3-i; j++) {
			for (int j = 1 ; j <=Math.abs(3-i); j++) { 
				System.out.print("_");
			}
			for (int j = 1 ; j <=2*i-1; j++) { 
				System.out.print("*");
			} // for
			System.out.println();
		} // for
		*/
	} // main

} //class
