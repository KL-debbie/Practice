package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// import java.lang.System;
// import java.lang.*;

/**
 * @author kenik
 * @date 2023. 7. 14. - 오후 2:00:58
 * @subject
 * @content
 */
public class Ex10 {

	public static void main(String[] args) throws IOException {
		
		// 나이 정수(0~125) byte, short, int, long		
		byte age = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("> 나이 입력 ? ");
		// 1. Type mismatch: cannot convert from String to byte
		// 2. Unhandled exception type IOException
		String inputData = br.readLine();
		age = Byte.parseByte( inputData )   ; // "20" 
		
		// byte, short, int, long -> %d
		System.out.printf("> 나이는 %d살입니다.", age);  
		


	} // main

} // class

















