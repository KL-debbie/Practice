package days04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		//제어문  1) 정의 : 프로그램의 실행 순서 제어
		//        2) 종류 : 조건       if if~else if~elseif~
		//                  분기       switch
		//                  반복       for foreach
		//                  조건반복   while do~while
		//                  기타       break continue

		/*
		조건문
		if (condition) {
			// 조건식이 참일 때만 {  } 수행
		} // if
		 */

		// 정수를 입력 받아 n 변수에 저장하고 출력
		// 입력받은 n : 짝수일 경우 출력

		int n;

		try (Scanner sc = new Scanner(System.in)){

			System.out.print("정수 입력");
			n = sc.nextInt();
			// 1)
			/*
			if ( n%2 ==0 ) {
				System.out.printf("> n=%d (짝수 even sumber)",n);
			}
			if (n % 2 !=0) {
				System.out.printf(" n=%d (홀수 odd number",n);
			} // if
			*/
			
			String result = "짝수";
			// 2)
			/*
			if (n % 2 ==0) {
				result= "짝수";
			} else {
				result= "홀수";
			}
			System.out.printf("n=%d %s", n, result);
			*/
			
			// 3)
			if(n%2!=0) {
				result = "홀수";
			}
			
			System.out.printf("n=%d %s", n, result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}




	} // main

}
