package days02;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오후 4:27:36
 * @subject 형변환
 * @content
 */
public class Ex16 {

	public static void main(String[] args) {
		// 1. 자동형변환 - 2가지
		int i = 10; //         [][][][]		
		long l = i; // [][][][][][][][]
		float f = l; // 실수로 변환됨
		//double d = f;
		System.out.println( f );
		
		long L = l + i; // long + int = long
		
		
		// 2. 강제형변환
		//    3*(5+2)   () 최우선연산자
		//    (변환하고자하는 타입) cast 연산자        캐스트강제형변환
		
		int a = 20;
		int b = 3;
		System.out.println(  (double)a/b ); // 6.666666  몫 int/double=>int

	} // main

} // class








