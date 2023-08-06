package Prac;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class PutM1_01 {
	public static void main(String[] args) {
		// 3*4 -> 1차원 -> 2*6 변환

		// 1. 3*4 배열 불러오기
		int [][] m = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		dispM(m);
		
		// 1차원으로 바꾸기
		int [] n = new int[m.length*m[0].length];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[m[0].length*i+j]= m[i][j];
			} // for
		} // for
		
		dispM(n);
		
		// 다시 2차원으로
		int [][] k = new int[2][6];
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				k[(4*i+j)/6][(4*i+j)%6]= m[i][j];
			} // for
		} // for
		
		dispM(k);
	}



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
}