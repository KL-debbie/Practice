package days02;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오전 10:21:26
 * @subject  지역변수( Local Variable ) *** 시험1
 * @content
 */
public class Ex03 {
	
	// char grade = 'A'; 

	public static void main(String[] args) {
		// "리터럴 설명"
		// String %s , int %d, double
		// 한 문자를 저장하는 자료형 :  char
		// 자바에서 문자를 나타낼 때는   '한문자'
		
		char grade = 'A'; // Local Variable(지역변수)
		// 코드영역(블럭)
		// {} 영역(범위) 연산자
		{			
			
			System.out.printf("등급 : '%c'", grade);
		}
		// grade cannot be resolved to a variable
		// grade 변수를 선언 X, 인식 X
		System.out.printf("등급 : '%c'", grade);

	} // main

} // class






