package Prac;
/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  더하기 빼기 혼합
 * @content
 */
import java.util.Scanner;

public class DM_pra {
	public static void main(String[] args) {
	
		//1-2+3-4+5-6+7-8+9-10= -5
		/*
		int sum=0;
		for (int i = 1; i <=10; i++) {
			if(i%2==0) {
				System.out.printf("%d+",i);
				sum-=i;
			} else {
				System.out.printf("%d-",i);
				sum +=i;
			}
		} // for
		System.out.printf("\b=%d\n",sum);
		*/
		
		/*
		int sum = 0;
		for (int i = 1; i <=10; i++) {
			sum+= i%2==0?-i:i;
			System.out.printf(i%2==0?"%d+":"%d-",i);
		} // for
		System.out.printf("\b=%d\n",sum);
		*/
		
		
		//switch 사용
		boolean sw= false;
		int sum=0;
		
		for (int i = 1; i <=10; i++) {
			if(sw) {        // true 일때 진행
				sum -=i;
				System.out.printf("%d+",i);
				// sw = false;
				sw =!sw;
			} else {        // false 일때 진행
				sum +=i;
				 System.out.printf("%d-",i);
				// sw =true;
				sw = !sw;
			}
			
		} // for
		System.out.printf("=%d\n",sum);
		
		
		/*
		boolean sw= false;
		int sum=0;
		
		for (int j = 1; j <=10; j++) {
			sum+= sw? -j : j;
			System.out.printf(sw? "%d+" : "%d-",j);
			sw = !sw;
		} // for
		System.out.printf("\b=%d\n",sum);
		*/
		
	} //main

}//class
