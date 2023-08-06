package days04;

import java.util.Scanner;

public class Ex08_02 {
	public static void main(String[] args) {
		// 가위,바위,보
		// 컴퓨터는 1~3까지 임의의 수
		// 상용자는 1~3까지 정수, Scanner 입력
		
		// 숫자가 아닌 문자열로 표시방법
		
		int com, user;
		String coms = null, users = null;
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.printf("> user 가위(1)바위(2) 보(3) 선택? ");
			user =sc.nextInt();
			com = (int)(Math.random()*3 +1);
			
			switch (user) {
			case 1: users = "가위"; break;
			case 2: users = "바위"; break;
			case 3: users = "보"; break;
			}
			if ( com == 1) {
				coms = "가위";
			} else if ( com ==2 ) {
				coms = "바위";
			} else if ( com == 3 ) {
				coms = "보";
			}
			System.out.printf("> 컴 : %d, 사 : %d\n", com, user);	
			System.out.printf("> 컴 : %s, 사 : %s\n", coms, users);	

			switch (user -com) {
			case 1: case -2:
				System.out.println(" 사용자 승리 ");
				break;
			case 2: case -1:
				System.out.println(" 컴퓨터 승리 ");
				break;
			default:
				System.out.println( " 무승부 ");
				break;
			} // switch
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main

}
