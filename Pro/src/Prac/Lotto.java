package Prac;

import java.util.Calendar;
import java.util.Random;

public class Lotto {
	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		int thisYear = c.get(Calendar.YEAR);

		for (int i = 2000; i <=thisYear; i++) {

			System.out.printf("%d(%s)\n", i, isLeapYear(i)?"윤년":"평년");
		} // for
	}
		public static boolean isLeapYear(int year){
			if(year % 4==0 && year%100 !=0 || year % 400 ==0) {
				return true;
		}
		else return false;
	}
}//class


