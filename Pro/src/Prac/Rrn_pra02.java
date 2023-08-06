package Prac;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  국어 점수 입력 받아 0<=kor<=100 올바른 점수/ 그 외는 잘못된 점수
 *           	//[정규표현식 사용]
		// 국어 점수kor을 입력받아 0<=kor<=100 올바른점수
		// 그외는 잘못된 점수
		/*
		//int [] kors= {99,1,100,101,-90,0};
		String kor="10";
		// String regex="\\d{3}"; // 100-999까지 무조건 참인 결과가 나옴
		// String regex="\\d{1,2}|100";  // 09 이런식도 참으로 나옴
		// String regex="\\d{1}|\\d{2}|100";   위랑 같은식
		// String regex="100|[1-9]\\d|\\d";
		String regex="100|[1-9]?\\d";   // 위랑 같은 식 

		System.out.println(kor.matches(regex));
 * @content
 */
public class Rrn_pra02 {

	public static void main(String[] args) {
		/*
		String kor ="85";
		String regex = "100|[1-9]?\\d";

		System.out.println(kor.matches(regex));
		 */

		
		String [] codes = {"[0-100]"};
		String regex ="100|[0-9]?\\d";
		
		boolean flag =false;
		
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print(">점수 입력 ");
			int kor = scanner.nextInt();

			for (int i = 0; i < codes.length; i++) {
				flag= codes[i].matches(regex);
				System.out.printf("%s-%s 국어점수", codes[i],flag?"올바른":"잘못된");
			} // for

		} catch (Exception e) {
			e.printStackTrace();
		}

	}  //main

}  //class
