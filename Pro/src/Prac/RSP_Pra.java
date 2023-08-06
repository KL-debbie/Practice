package Prac;
/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  가위바위보
 * 	/*
		// 한 문자를 대문자로 변환하는 매서드 : toUpperCase
		System.out.println(Character.toUpperCase('y'));
		System.out.println(Character.toUpperCase('Y'));

		// 한 문자를 소문자로 변환하는 매서드 : toLowerCase
		System.out.println(Character.toLowerCase('y'));
		System.out.println(Character.toLowerCase('Y'));

		// String.toUpperCase()
		System.out.println( "abc".toUpperCase() );
		System.out.println( "abc".toLowerCase() );
		
 * @content
 */
import java.util.Scanner;

public class RSP_Pra {
	public static void main(String[] args) {
		// 입력 받아 다시 실행, 5번 잘못 입력 시 시스템 종료
		// 가위바위보

		int user,com;
		String inputData ;
		char con ='y';


		try (Scanner sc = new Scanner(System.in)){
			String regex= "[1-3]";
			boolean flag = false;
			int failure = 0;

			do {
				if (flag) {
					failure++;
					System.out.printf("[%d]번 실패 시스템 종료\n", failure);
				} // if
				if (failure ==5) {
					System.out.println("\t 5번 실패, 시스템 종료합니다");
					System.exit(0);
				} // if
				System.out.print("> user 가위 1, 바위 2, 보3");
				inputData = sc.next();
				flag = true;

			} while (!inputData.matches(regex));

			user = Integer.parseInt(inputData);
			System.out.println(user);

			do {
				user = sc.nextInt();
				com = (int)(Math.random()*3)+1;

				String [] RSP = {"가위", "바위", "보"};


				System.out.printf(" com = %s, user =%s\n", RSP[com-1], RSP[user-1]);

				switch (user-com) {
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

				System.out.print(" 계속 실행? ");
				con = (char)System.in.read();
				System.in.skip(System.in.available());

				//} while ( Character.toUpperCase(con)=='Y');
			} while ( Character.toLowerCase(con)=='y');
			// Y 가 출력되게 하려면 Character.toLowerCase(con)

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end");


	} //main

}//class
