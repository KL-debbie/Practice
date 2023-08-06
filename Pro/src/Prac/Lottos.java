package Prac;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Lottos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print(">로또 게임 횟수 ? ");

		int [][] lottos;

		int gameNumber = sc.nextInt();
		lottos = new int[gameNumber][6];
		fillLottos(lottos);
		dispLottos(lottos);



	}//main



	private static void fillLottos(int[][] lottos) {
		int index,n;
		for (int i = 0; i < lottos.length; i++) {
			index=0;
			Random rnd = new Random();
			while(index<=5) {
				n=rnd.nextInt(45)+1;
				if(! isDuplicateLottos(lottos, i, n, index)) lottos[i][index++]=n;
			}
		} // for

	}



	private static boolean isDuplicateLottos(int[][] lottos, int i, int n, int index) {
		for (int j = 0; j <index; j++) {
			if(lottos[i][j]==n)return true;
		} // for
		return false;
	}



	private static void dispLottos(int[][] lottos) {
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("[%d번째]", i+1);
			for (int j = 0; j < lottos[i].length; j++) {
				System.out.printf("[%d]",lottos[i][j]);
			} // for
			System.out.println();
		} // for

	}
}//class