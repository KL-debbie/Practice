package days06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KL
 * @date 2023. 7. 20. - 오전 11:45:13
 * @subject 복습 6번
 * @content
 */
public class Ex04 {

	public static void main(String[] args) {
String name ;
		
		try ( Scanner scanner = new Scanner(System.in) ) {
			System.out.print("> 이름 입력 ? ");
			// name = scanner.next();
			name = scanner.nextLine();
			// System.out.println( name );
			
			/* [1]
			char [] nameArr = new char[name.length()];
			for (int i = 0; i < nameArr.length; i++) {
				nameArr[i] = name.charAt(i);
			} // for
			System.out.println( Arrays.toString(nameArr) );
			*/
			
			// char [] String.toCharArray()
			// 1) String -> char [] 변환
			char [] nameArr = name.toCharArray();
			
			// 2) char[] -> String 변환
			name = String.valueOf(nameArr);
	
			
		} catch (Exception e) {			
			e.printStackTrace();
		} // catch
	}//main

}//class
