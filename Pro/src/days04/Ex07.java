package days04;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// 국어점수 입력 받아 수~가 출력
		// if 문 -> switch 문으로 변경

		int kor ;
		try (Scanner sc = new Scanner(System.in)){
			System.out.print(" 국어 점수 입력 ");
			kor = sc.nextInt();
			char grade = '가';

			switch (kor/10) {
			case 10:                   // case 10과 case 9 등급은 같으므로 합칠 수 있음
				grade = '수';
				break;
				/*
			case 10: case 9:                  // case 10과 case 9 등급은 같으므로 합칠 수 있음
				grade = '수'; break;
				 */
			case 9:
				grade = '수'; break;
			case 8:
				grade = '우'; break;
			case 7:
				grade = '미'; break;
			case 6:
				grade = '양'; break;
			default:
				grade = '가'; break;
			} // switch
			System.out.println(grade);	

		} catch (Exception e) {
			e.printStackTrace();
		}

	} // main

}
