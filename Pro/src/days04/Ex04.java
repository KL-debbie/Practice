package days04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		int kor;
		try (Scanner sc = new Scanner(System.in)){
			System.out.print(" 점수 입력 ");
			kor=sc.nextInt();

			/*
			if(0 <= kor && kor <=100) {
				if(kor >= 90) {
					System.out.println("수");
				}
				if (80 <= kor && kor <= 89) {
					System.out.println("우");
				} // if
				if (70 <= kor && kor <= 79) {
					System.out.println("미");
				} // if
				if (60 <= kor && kor <= 69) {
					System.out.println("양");
				} // if
				if ( kor <= 59) {
					System.out.println("가");
				}
			} else {
				System.out.println("국어 점수 잘못 입력");
			}
			 */
			if(0 <= kor && kor <=100) {
				char grade ='가';
				if(kor>=90) {
					grade = '수';
				} else if (80<=kor) {
					grade = '우';
				} else if (70<=kor) {
					grade = '미';
				} else if ( 60<=kor) {
					grade = '양';
				} else {

				}
				System.out.printf("kor = %d(%c)",kor, grade);	

			} else {
				System.out.println("국어 점수 잘못 입력");
			}
		} //try
		catch (Exception e) {
			e.printStackTrace();
		} // catch
	} // main

}
