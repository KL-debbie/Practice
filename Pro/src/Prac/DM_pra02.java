package Prac;
/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  분수 덧셈 표현
 * @content
 */
import java.util.Scanner;

public class DM_pra02 {
	public static void main(String[] args) {
		// 1. 1/2+2/3+3/4+ .... +8/9+9/10= ??? 
		
		double sum =0;
		for (int i = 1; i < 10; i++) {
			sum+=(double) i/(i+1);
			System.out.printf("%d/%d+", i, i+1);
		} // for
		System.out.printf("=%f\n",sum);
	} //main

}//class
