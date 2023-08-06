package Prac;

import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;

public class FillM02_MagicSq {
	public static void main(String[] args) throws InterruptedException {

		int [][] m = new int[5][5];
		// 마방진 그리기
		// 1) 첫번째 행의 가운데 열  =  1
		// 2-1) 출력값이 5의 배수라면 행만 증가
		// 2-2)   2-1)이 아니면  행 감소, 열 증가 반복적으로 처리
		// 3)                     ㄴ  행 0행 -> -1행  => 가장 큰 행 4 으로 값 처리 (행을 벗어남) 
		// 4)       		                ㄴ 열 4열 -> 5열 => 가장 작은 열 0 로 값 처리(열을 벗어남)
		
		magicSquare(m);
		
	}

	private static void magicSquare(int[][] m) throws InterruptedException {
		int n =1;
		int row =0, col = 2;
		 
		while (n<=25) {
			m[row][col]=n;
			dispM(m);
			
			Thread.sleep(1000);
			
			if( n%5==0) {
				row++;	
			} else {
				row--; col++;
				if( col == 5) col = 0;
				else if( row == -1) row =4;
			}
			n++;
		}
		
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