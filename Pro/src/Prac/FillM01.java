package Prac;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;

public class FillM01 {
	public static void main(String[] args) {

		int [][] m = new int[5][5];
		
		//fillM(m);
		//fiiM02(m);
		//fiilM03(m);
		fiilM04(m);
		
		
		dispM(m);
	}

	

	private static void fiilM04(int[][] m) {
		/*
		0 [01][02][03][04][05]
		1 [10][09][08][07][06] 
		2 [11][12][13][14][15]
		3 [20][19][18][17][16]
		4 [21][22][23][24][25]
		*/
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if( i % 2 ==0) m[i][j] = 5*i+j+1;
				else m[i][4-j] = 5*i+j+i;
			} // for
		} // for
		
	}



	private static void fiilM03(int[][] m) {
		/*
		 * [05][10][15][20][25]
		   [04][09][14][19][24]
		   [03][08][13][18][23]
		   [02][07][12][17][22]
		   [01][06][11][16][21]
		 */
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-j][i]= 5*i+j+1;
			} // for
		} // for
	}



	private static void fiiM02(int[][] m) {
		/*
		 [25][24][23][22][21]
	     [20][19][18][17][16]
		 [15][14][13][12][11]
		 [10][09][08][07][06]
		 [05][04][03][02][01]
		 */
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[4-i][4-j]= 5*i+j+1;
			} // for
		} // for
	}

	private static void dispM(int[][] m) {
		/*
		   [01][02][03][04][05]
		   [06][07][08][09][10]
		   [11][12][13][14][15]
		   [16][17][18][19][20]
		   [21][22][23][24][25]
		 */
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			} // for
			System.out.println();
		} // for
	}	

	private static void fillM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]= 5*i+j+1;
			} // for
		} // for
		
	}
}