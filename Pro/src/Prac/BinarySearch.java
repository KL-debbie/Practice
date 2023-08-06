package Prac;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {

		int [] m = { 0, 4, 5, 15, 20, 21, 22, 24, 25, 28, 29, 30, 32, 33, 40, 43, 46, 47, 48, 58, 62, 63, 71, 76, 
				86, 91, 94, 99, 111, 116, 128, 135, 137, 139, 142, 145, 146, 150, 151, 160, 161, 166, 168, 
				169, 172, 181, 184, 185, 191, 198 };

		System.out.println(   Arrays.toString(m)   );
		
		int n = 99;
		int index = binSearch(m,n);
		
		if(index ==-1) {
			System.out.println("찾는 값 없음");
		} else System.out.println(index + " 위치에 있음");
	}

	private static int binSearch(int[] m, int n) {
		int top = m.length-1;
		int bottom= 0;
		int count =0;
		int middle;
		
		while (bottom<=top) {
			count++;
			middle = (top+bottom)/2;
			if(m[middle]==n) {
				System.out.println("찾은 횟수 " + count);
				return middle;
			} else if(m[middle]>n) {
				top = middle -1;
			} else {
				bottom = middle+1;
			}
		}//while
		System.out.println("못찾은 횟수 "+ count);
		return -1;
	}//binSearch
}