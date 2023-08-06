package days02;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오후 3:30:48
 * @subject
 * @content
 */
public class Ex14 {

	public static void main(String[] args) {
		// ㄴ. 실수계열 - float(4), [double(8)]
		float f ;  // 32비트 [[0][00000000 8지수][00000000000000000000000 23 가수]]
		double d ; // 64비트 [[0][00000000000 11지수][0000000000000000000000000000000000000000000000000000 52]
		
		//  10 -> 0000 1010
		// -10 -> 2의 보수법 -> 1111 0110
		// 'A' -> 65 -> 00000000 01000001
		//    9.1234567 실수
		// 1001.000111111001101011011011.....
		// 1.XXX   x 2^n  정규화
		// 1.001000111111001101011011011..... x 2^3
		
		// 모든 실수 자료형  double 기본으로 사용하자.
		// Type mismatch: cannot convert from double to float
		float pi = 3.14f;
		// float pi = (float) 3.14;
		// double pi = 3.14;
		
		System.out.printf("pi = %f", pi);

	} // main

} // class
