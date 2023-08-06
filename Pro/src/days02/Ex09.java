package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오후 12:36:25
 * @subject 표준 입력 장치(키보드)로 부터 이름을 입력받아서
 * @content name 변수에 저장하고 나서 출력.
 */
public class Ex09 {

	public static void main(String[] args) throws IOException {
		
		String name = "이준희";
		
		//바이트스트림->문자 스트림 변환-> 라인단위 처리 스트림변환
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		
		// Unhandled exception type IOException  예외처리
		System.out.print("> 이름을 입력하세요 ? ");
		name = br.readLine();
		
		System.out.printf("> 이름 : %s\n", name);

	} // main

} // class
