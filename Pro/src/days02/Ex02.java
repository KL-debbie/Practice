package days02;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오전 9:51:20
 * @subject   식별자와 키워드 구분
 * @content   변수, 상수, 리터럴 구분
 *            상수 문법 - 대,final, _ 등등
 */
public class Ex02 {

	public static void main(String[] args) {
		// 10:02 수업 시작~ 
		/*
		 * 키워드(keyword):의미가 부여된 예약어
		 * 식별자(identifier): 개발자 부여한 이름들
		 *                    ( 변수명, 클래스명, 함수명 등등)
		 * */
		
		String name;  // name 변수
		name = "홍길동";
		// 출력
		name = "김길동";
		// 출력
		
		// 변수와 상수 설명
		//  - 값을 저장하는 메모리상의 저장공간
		//  - 변하는 수, 고정된 수
		
		// 원주율 PI  3.141592
		// 변수( 숫자: 정수, 실수 )
		// 변수 선언 형식  p30
		// 자료형 상수 [= 초기값];
		
		// String firstName 변수
		// String FIRST_NAME 상수, MAX_VALUE, MIN_VALUE
		final double PI = 3.141592;
		// The final local variable pi cannot be assigned. 
		// pi = 3.24;
		

		// 리터럴  1  true 'A' 3.14
	} // main

} // class








