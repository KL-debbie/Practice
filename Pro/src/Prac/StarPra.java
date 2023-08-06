package Prac;

/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  별그리기
 * @content
 */
public class StarPra {
	public static void main(String[] args) {
		
		 //마름모
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=5; j++) {
				if (i+j>=4&&j-i<=2) {
					System.out.print("*");	
				} else
					System.out.print("_");

			} // for
			System.out.println();
		} // for

		for (int i = 1; i <=2; i++) {
			for (int j = 1; j <=5; j++) {
				if(i+j<=5 && j-i >=1) {
					System.out.print("*");
				} else
					System.out.print("_");
			}
			System.out.println();
		} // for


		/* 결과값
	     __*__
         _***_
		 *****
         _***_
         __*__
		 */
		
		
		//왼쪽 대각선
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print("_");
				}
				
			} // for
			System.out.println();
	
		} // for
		
		/*
		*____
		_*___
		__*__
		___*_
		____*
		*/
		
		
		//오른쪽 대각선
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if (i+j ==6) {
					System.out.print("*");
				} // if
				else {
					System.out.print("_");
				}
				
		} // for
			System.out.println();
		} // for
		
		/*
		____*
		___*_
		__*__
		_*___
		*____
		*/
		
		
		// X 표시
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=5; j++) {
				if (i==j || i+j==6) {
					System.out.print("*");
				} // if
				else System.out.print("_");
			} // for
			System.out.println();
		} // for
		
		/*
		*___*
		_*_*_
		__*__
		_*_*_
		*___*
		*/
		
		
		// 모래시계
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=5; j++) {
				if (i<=j && i+j<=6) {
					System.out.print("*");
				} // if
				else System.out.print("_");
			} // for
			System.out.println();
		} // for
		
		for (int i = 1; i <=2; i++) {
			for (int j = 1; j <=5; j++) {
				if (i+j>=3 && j-i<=3) {
					System.out.print("*");
				} // if
				else System.out.print("_");
			} // for
			System.out.println();
		} // for
		/*
		*****
		_***_
		__*__
		_***_
		*****
		*/
	} // main
}
