package days04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;
		
		System.out.print(">실수 입력 ? ");
		x =sc.nextDouble();
		
		x = (int)(x*100+0.5)/100d;
		
		System.out.printf(">결과 : %f", x);
		
		sc.close();
	} // main

}
