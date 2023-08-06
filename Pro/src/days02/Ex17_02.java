package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오후 4:43:37
 * @subject  br
 * @content  Scanner 클래스 
 */
public class Ex17_02 {

	public static void main(String[] args) throws IOException {
		// 이름, 국어, 영어, 수학을 입력받아서
		// 총점, 평균을 계산하고
		// [출력형식]
		// 홍길동님은 국:89 영:78 수:56 총점:000 평균:00.00 이다.
		// (5:25 풀이)
		String name;
		byte kor, eng, mat;
		short total;
		double avg;
		
		// Resource leak: 'sc' is never closed
		Scanner sc = new Scanner(System.in);
		
		System.out.print("> 이름 국어 영어 수학 입력 ? ");
		name = sc.next();    // String
		kor = sc.nextByte(); // byte
		eng = sc.nextByte(); // byte
		mat = sc.nextByte(); // byte
		
		// Type mismatch: cannot convert from int to short
		total = (short) (kor + eng + mat);
		avg = (double)total/3;
		System.out.printf("%s님은 국:%d 영:%d 수:%d 총점:%d 평균:%.2f 이다."
				,name, kor, eng,mat, total, avg );
		
		
       sc.close();
	} // main

} // class


