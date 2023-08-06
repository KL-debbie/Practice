package Prac;
/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  분수 덧셈 표현
 * @content
 */
import java.util.Scanner;

public class DM_pra03 {
	public static void main(String[] args) {
		// 2. 1+2+4+7+11+16+ ...+191= ???  규칙적인 수열 (1,2,3 --증가) 항의 갯수가 20개까지 합 구하기
		//     1 2 3 4  5  6  ....
		// 1+(n-1)
		/*
		int term=1;
		int defference = 0;
		int sum=0;
		
		for (int i = 1; i <=20; i++) {
			term += defference;              // term은 de- 만큼 증가 1+(1+1)+(1+2)
			System.out.printf("%d+",i);      // i = 1씩 증가         1->2->3
			sum += term;                     // sum은 term만큼 증가  1+2+3
			defference++;                    // de는 1씩 증가        1 ->2->3 
		} // for
		System.out.printf("\b=%d\n",sum);
		*/
		
		int term;
		int sum=0;
		for (int i = 1; i <= 20; i++) {
			// (n^2-n)/2+1
			term =  (int) ((Math.pow(i, 2)-i)/2+1);
			System.out.printf("%d+", term );
			sum+=term;
		} // for
		System.out.printf("\b=%d\n",sum);
	} //main

}//class
