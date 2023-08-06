package days02;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오전 11:04:31
 * @subject 표준 입력, 표준 출력 =>  System 클래스
 * @content 객체==개체==Object==클래스==물건
 *          System 클래스 안에 [표준 출력 함수]
 *          1. println()
 *          void	println​(이름, 나이)
 *          2. printf()
 *          PrintStream	printf​(String format, Object... args)
 *          3. print()
 *          void	print​(이름, 나이)
 *          
 */
public class Ex05 {
	
	public static void main(String[] args) {
		// java.lang 패키지 안에 있는 System 클래스
		// java.lang.System.out.println("이창익");
		// 함수(메서드) 3가지 파악 => 정확히 사용할 수 있다.
		//  1. 함수의 기능(일) 파악
		//  2. 함수가 일처리를 할 때 필요한 값 파악 ( 매개변수, 파라미터, 인자, 인수 )
		//  3. 함수가 일처리를 한 후에 반환(리턴)하는 값 파악 ( 리턴값, 리턴자료형 )
		
		// 예) A사람한테 담배 심부름(일)... 
		//    1. 담배심부름
		//    2. 담배값, 담배명
		//    3. 담배, 거스름돈 반환
		// 예) main() 함수 
		//    1. 기능 ? 프로그램 시작, 종료 일
		//    2. 매개변수 ? 문자열 배열 args == arguments ==인자들
		//    3. 리턴값 X ,  리턴자료형 void 선언
		
		//System.out.printf("홍길동").printf("20");
		System.out.println("홍길동");
		System.out.println("이창익");
		System.out.println("이준희");
		
		// 개행(줄바꿈) 방법 
		System.out.print("홍길동" + '\n');
		System.out.print("이창익\n");
		System.out.print("이준희");
		System.out.println(); // 개행
		System.out.print("송해영");
		
		
	} // main

} // class





