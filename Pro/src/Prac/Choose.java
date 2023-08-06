
package Prac;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  피보나치 수열 덧셈
 * @content
 */
import java.util.Scanner;

public class Choose {
	
	static int index =0;
	static Scanner sc= new Scanner(System.in);
	static char con = 'y';
	
	public static void main(String[] args) throws IOException {
		
		int [] m = new int[3];
		String [] menus = {"추가","수정","삭제","검색","조회","종료"};
		int selectedNumber;
		
		while (true) {
			dispMenus(menus);
			selectedNumber = selectMenus(sc);
			processMenus(selectedNumber,m);
		}
	} // main
	
	// 3. 메뉴 고르는 과정 선택
	private static void processMenus(int selectedNumber, int[] m) throws IOException {
		switch (selectedNumber) {
		case 1: add(m); break;
		case 2: System.out.println("배열 요소 수정"); break;
		case 5: list(m); break;
		case 6: exit(); break;

		} // switch
		일시정지();
	}
	
	// 7. 일시 정지 후 다른 메뉴 선택
	private static void 일시정지() {
		System.out.println("아무키 누르면 계속 진행");
		try {
			System.in.read();
			System.in.skip(System.in.available());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	// 6. 추가 요소 작성
	private static void list(int[] m) {
		System.out.println("[5. 조회]");
		if (index==0) {
			System.out.println(">추가 요소 없음");
			return;
		} // if
		for (int i = 0; i <index; i++) {
			System.out.printf("m[%d]=%d", i,m[i]);
			
		} // for
	System.out.println();
	}

	// 4. 배열 크기 늘리기
	private static void add(int[] m) throws IOException {
		System.out.println("[1.추가]");
		do {
			if (index== m.length) {
				int [] temp = new int[m.length+1];
				for (int i = 0; i <m.length; i++) {
					temp[i]=m[i];
				} // for
				m=temp;
			} // if
			System.out.println("\n 정수 입력?");
			int n =sc.nextInt();
			m[index++]= n;
			
			System.out.println("계속 입력?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con)=='Y');
	System.out.println(Arrays.toString(m));
	}

	// 5. 프로그램 종료
	private static void exit() {
		System.out.println("\n\n 프로그램종료");
		System.exit(0);
	}

	// 2. 메뉴 선택
	private static int selectMenus(Scanner sc) {
		System.out.println("메뉴 선택하세요");
		return sc.nextInt();
	}
	
	// 1) 메뉴 불러오기
	private static void dispMenus(String[] menus) {
		System.out.println(">메뉴");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d.%s\t", i+1, menus[i]);
		} // for
		System.out.println();
	}
	

}//class
