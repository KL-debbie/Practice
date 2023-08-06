package days05;

import java.io.LineNumberInputStream;

/**
 * @author KL
 * @date 2023. 7. 19. - 오전 11:27:13
 * @subject
 * @content
 */
public class Ex03 {

	public static void main(String[] args) {
		/*
		// ASCII 256가지
		for (int i = 0; i < 256 ; i++) {
			//System.out.printf("%d-%c\n", i, (char)i );    // 1~32 제어문 
			System.out.printf("[%c]", (char)i );    // 
		} // for
		 */

		// [문제1] 한 라인에 열개씩 출력
		/*
		 for (int i = 0; i < 256 ; i++) {
		  if (i%10 == 0) {
					System.out.println();   // 첫줄 개행 후 10개씩
				}
		  System.out.printf("[%c]\n", (char)i );    
		  if (i%10 == 0) {
				System.out.println();   // 0에서 개행 후 찍힘
			}
		} // for
		 */

		// [문제 2] 라인 앞에 번호 붙이기
		for (int i = 0, lineNumber = 1;  i <256 ; i++) {

			// for (int 'A' = 0, lineNumber = 1;  i <'Z' ; i++) {  // 대문자 출력
			// for (int 'a' = 0, lineNumber = 1;  i <'z' ; i++) {  // 소문자 출력
			// for (int '0' = 0, lineNumber = 1;  i <'9' ; i++) {  // 숫자 출력

			if(i %10==0) 
				// System.out.printf("%d: ", 1/10+1);
				System.out.printf("%d: ", lineNumber++);
			// for (int i = 0; i < 256 ; i++) {
			System.out.printf("[%c]", (char)i );
			if ( i %10 == 9) {
				System.out.println(); 
			}
			/* 결과값 ?  개행하는 제어문자 자체가 포함되어있어서, 결과값 자체가 한줄
			 * [
			        ][][][
			        ][][][][][][]
			 */

		}
		

		// 1: 0  1  2  3 4 5  6  7  8  9 개행
		// [] [] [] [] [] [] [] [] [] []
		// 2: 10 [] [] [] [] [] [] [] [] 19
		// 3: 20 [] [] [] [] [] [] [] [] 29
		// 나머지가 9일때 개행

		// ASCII 10 개행하는 의미               '\n'    LineFeed(  LF  )           새 줄로 이동 커서가 바로 밑으로 이동
		// ASCII 13 개행하는 의미(자동 개행)   '\r'     CarrageReturn (  CR  )  새 줄로 이동한 커서를 맨 앞으로 당기는 행위
		// 엔터 == 개행  == '\r\n'을 의미





	} //main

} //class
