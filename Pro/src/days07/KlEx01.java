package days07;

public class KlEx01 {


	public static void main(String[] args) {
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
		
		



	} // main

}//class
