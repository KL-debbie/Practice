
package Prac;
import java.util.Arrays;
/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  피보나치 수열 덧셈
 * @content
 */
import java.util.Scanner;

public class DM_pra04 {

	public static void main(String[] args) {

		// 1+1+2+3+5+8+13+......+100번째 항 까지의 합
		// 1 = 1
		// 1 + 2 = 3
		// 2 + 3 = 5
		//    :
		//    :
		// p[0] + p[1] = p[2] = 1+1 =2
		// p[1] + p[2] = p[3] = 1+2 =3
		// p[2] + p[3] = p[4] = 2+3 =5
		// p[3] + p[4] = p[5] = 3+5 =8

		// 숫자  0   1    2    3    4    5  ...
		// 방   [1] [1]  [2]  [3]  [5]  [8] ...

		/*
		int [] p = new int[23];
		p[0] = p[1] = 1;

		int index = 2; 
		while(true) {
			int term = p[index-1]+p[index-2];    
			if ( term > 100) break;
			p[index] = term;
			index++;
		}
		System.out.println(Arrays.toString(p));
		System.out.println(index);   // 11 : 배열크기에 속하는 값
		 */
		
		int firstTerm =1;
		int secondTerm =1;
		int nextTerm ;
		int sum = firstTerm + secondTerm;
		
		System.out.printf("%d+%d+", firstTerm, secondTerm);
		
		while((nextTerm = firstTerm + secondTerm) <=100) {
			System.out.printf("%d+", nextTerm);
			sum +=nextTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
		System.out.printf("=%d",sum);
	} // main

}//class
