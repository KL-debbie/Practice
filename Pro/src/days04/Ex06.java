package days04;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// switch 문
		
		/*
		switch (key) {  key : 변수 수식(정수 문자열 문자) 
		case value:     value : 리터럴가능, 변수는 불가능
			break;
		case value:     
			break;
		case value:     
			break;
		      :
              :
		[default:
			break;]   생략가능
		} // switch
		*/
		
		// 정수를 입력 받아 홀짝 출력
		int n ;
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.print(" 정수 입력 ");
			n = sc.nextInt();
			
			String result = null;
			switch (n%2) {        // 2로 나눴을 때 나머지값은 0 또는 1밖에 없으므로 case 0과 case 1만 존재
			case 0:
				result = "짝수";
				break;
			case 1:
				result = "홀수";
				break;
			} // switch
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
		System.out.println("end");
	} // main

}
