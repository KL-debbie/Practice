package days04;

import java.util.Iterator;

public class Ex05 {
	public static void main(String[] args) {
		/*
          for ( 초기식 ; 조건식 ; 증감식){
		      System.out.println("홍길동");
		  } // for
		  초기식, 증감식은 밖에 선언해도 됨, 여러개 선언해도 무관
		 break; -> 무한루프 빠져나가기
		 */

		// 1) 10뒤에 + 붙어서 나옴
		/*
		int sum =0;
		 for (int i = 0; i <= 10; i++) {
			System.out.printf("%d+",i);
			sum = sum +1;
		} // for
		System.out.printf("=%d\n", sum);
		 */

		// 2) 10뒤에 + 빼서 나옴
		/*
		int sum =0;
		for (int i = 0; i <= 10; i++) {
			if ( i ==10) {
				System.out.printf("%d", i);
			} else  {
				System.out.printf("%d+", i);
			}
			sum += i;
		} // for
		System.out.printf("=%d\n", sum);
		 */

		// 3) 방법 2) 간단하게
		/*
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			System.out.printf(i==10? "%d" : "%d+", i);
			sum += i;
		} // for
		System.out.printf("=%d\n",sum);
		 */

		// 4) 1,2,3)보다 간단
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d+",i);
			sum += i;
		} // for
		System.out.printf("\b=%d\n", sum);

		//if (condition) System.out.println("홍길동");  => 명령라인이 1줄이면 {생략 가능}

		/*
		if (condition) System.out.println("홍길동"); 
		else             System.out.println("홍길동");     => 위에랑 동일함
		 */

		// for (int i = 0; i < args.length; i++) System.out.println("홍길동") => 위와 동일 { } 생략가능
		



	} // main

}
