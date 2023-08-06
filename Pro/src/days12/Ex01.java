package days12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) throws IOException {

		/*
		 int [] m = { 3,5,2,4,1 };
		 Arrays.sort(m); // 오름차순 정렬 ASC
		 System.out.println( Arrays.toString( m ) );
		 */
		// sequentialSearch()

		int [] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  };
		dispM(m);
		//            행 열
		// i=0/2  0%2  0 0        2차원배열의 열갯수:2
		// i=1         0 1
		// i=2         1 0
		// i=3         1 1
		// i=4         2 0  		
		int [][] n = new int[6][2];  

		for (int i = 0; i < m.length; i++) {
			n[i/2][i%2] = m[i];
		} // for

		dispM(n); 

		// 10:04 수업 시작
	} // main

	private static void dispM(int[][] n) {
		for (int i = 0; i < n.length; i++) {       // 행갯수
			for (int j = 0; j < n[i].length; j++) { // 열갯수
				System.out.printf("n[%d][%d]=%d ", i, j, n[i][j]);
			} // for
			System.out.println();
		} // for

	}

	private static void dispM(int[] m) {
		for (int i = 0; i < m.length; i++) {
			System.out.printf("m[%d]=%d\n", i, m[i]);
		} // for

	}

} // class







