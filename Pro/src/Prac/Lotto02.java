package Prac;

import java.util.Calendar;
import java.util.Random;

public class Lotto02 {
	public static void main(String[] args) {

		int [] lotto = new int[6];

		fillLotto(lotto);

		dispLotto(lotto);

	}

	private static void fillLotto(int[] lotto) {
		int index=0;
		int lottoNumber = (int)(Math.random()*45)+1;
		lotto[index++] = lottoNumber;
		boolean flag =false;

		while(index<=5) {
			flag = false;
			lottoNumber = (int)(Math.random()*45)+1;
			if(!isDupliLotto(lotto, lottoNumber,index)) lotto[index++] = lottoNumber;
		}

	}

	private static boolean isDupliLotto(int[] lotto, int lottoNumber, int index) {
		for (int i = 0; i <index; i++) {
			if(lotto[i]==lottoNumber);
			return true;
		} // for
		return false;
	}

	private static void dispLotto(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.printf("lotto[%d]=[%d]\n", i, lotto[i]);
		} // for
		System.out.println();
	}
}//class
