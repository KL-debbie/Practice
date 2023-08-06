package Prac;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

public class PutM {
	public static void main(String[] args) {
		//int [] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12  };
		int [][] m = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		dispM(m);

		int [] n = new int[m.length*m[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[m[0].length*i+j]= m[i][j];
			} // for
		} // for
		dispM(n);
	}

	private static void dispM(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.printf("[%d]", n[i]);
		
		} // for
		
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
