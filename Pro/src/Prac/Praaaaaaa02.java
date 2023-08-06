package Prac;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Praaaaaaa02 {
	public static void main(String[] args) {
	
		String rrn = "890704-1574685";
		
		String birthday = getBirth(rrn);
		
		System.out.println(birthday);
		
		int age = 0;
		 
		age = getCount(rrn);
		System.out.println("세는나이 : " + age);
		
		age = getAmerican(rrn);
		System.out.println("만나이 : " + age);
		
		boolean checkSum = CheckRRN(rrn);
		
		if (checkSum) {
			System.out.println("올바른 주민번호");
		} // if
		else System.out.println("잘못된 주민번호");
	} // main

	private static boolean CheckRRN(String rrn) {
		int total =0;
		int [] m = {2,3,4,5,6,7,0,8,9,2,3,4,5};
		for (int i = 0; i <=12; i++) {
			total += (rrn.charAt(i)-'0')*m[i];
		} // for
		int check = (11-total%11)%10;
		int ㅍ = rrn.charAt(13)-'0';
		return ㅍ ==check;
	}

	private static int getAmerican(String rrn) {
		Date d = new Date ();
		String pattern = "MMdd";
		SimpleDateFormat sdf = new SimpleDateFormat (pattern);
		int thisMMdd = Integer.parseInt(sdf.format(d));
		
		int birthMMdd= 0;
		boolean flag = thisMMdd - birthMMdd >=0;
		int americanAge = getCount(rrn)-1 +(flag? 0:-1);
		return americanAge;
	}

	private static int getCount(String rrn) {
		Date d = new Date();
		int thisYear = d.getYear() + 1900;
		
		int birthYear = Integer.parseInt(getBirth(rrn).substring(0, 4));
		
		int countAge = thisYear - birthYear +1;
		return countAge;
	}

	private static String getBirth(String rrn) {
		int year = Integer.parseInt(rrn.substring(0, 2));
		int month = Integer.parseInt(rrn.substring(2,4));
		int day = Integer.parseInt(rrn.substring(4,6));
		
		int ㅅ =getGender(rrn);
		
		int century =1800;
		switch ( ㅅ ) {
		case 1: case 2: case 5: case 6:
			century = 1900; break;
		case 3: case 4: case 7: case 8:
			century = 2000; break;
		case 9 : case 0:
			century = 1800; break;
		} // switch
	year = century + year;
	String birthday = String.format("%d.%d.%d\n",year, month, day);
	return birthday;
	}

	private static int getGender(String rrn) {
		return rrn.charAt(7)-'0';
	}
	

}
