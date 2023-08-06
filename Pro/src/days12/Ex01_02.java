package days12;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 28. - 오전 10:05:04
 * @subject
 * @content
 */
public class Ex01_02 {
	public static void main(String[] args) throws IOException {
		// 3행 4열 2차원 배열 m 선언 1~12 [배열초기화]
		// int [][] m = new int[][]{};
		int [][] m = {
						{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
		             };

		dispM(m);
		
		int [] n = new int[m.length*m[0].length];
		
		// 2차원 -> 1차원 배열로 변환
		// 00 -> 0
		// 01 -> 1
		// 02 -> 2
		// 03 -> 3
		// 10 -> 4
		// 11 -> 5		
		// 12 -> 6
		// 13 -> 7
		// 20 -> 8
		// 열갯수*i+j = 인덱스 
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[m[0].length*i+j] = m[i][j];
			} // for
		} // for
		
		dispM(n);
		
	} // main

	private static void dispM(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.printf("[%d]", n[i]);
		} // for
		System.out.println();
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			} // for
			System.out.println();
		} // for
		
	}

} // class
