package days04;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// 가위,바위,보
		// 컴퓨터는 1~3까지 임의의 수
		// 상용자는 1~3까지 정수, Scanner 입력
		
		// 숫자로 표시 방법
		
		int com, user;
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.printf("> user 가위(1)바위(2) 보(3) 선택? ");
			user =sc.nextInt();
			com = (int)(Math.random()*3 +1);
			// Math.random - 임의의 수 발생시키는 메서드
			
			System.out.printf(">컴퓨터 %d 사용자 %d\n", com, user);
			
			switch (user -com) {
			case 1: case -2:
				System.out.println(" 사용자 승리 ");
				break;
			case 2: case -1:
			System.out.println(" 컴퓨터 승리 ");
			break;
			default:
				System.out.println(" 무승부 ");
				break;
			} // switch
		} catch (Exception e) {
			// TODO: handle exception
		}
	} // main

}
