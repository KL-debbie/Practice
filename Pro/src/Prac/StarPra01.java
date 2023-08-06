package Prac;
/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  별그리기
 * @content
 */
import java.util.Scanner;

public class StarPra01 {
	public static void main(String[] args) {
		//행 갯수 입력 받아 별 그리기
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.print(" 이등변 행 갯수 입력 ");
			int row = sc.nextInt();  // row : 행 갯수
			
			for (int i = 1; i <=row; i++) {
				for (int j = 1; j <=2*row-1; j++) {
					if(i+j>=row+1 && j-i<=row-1) {
						System.out.print("*");
					}//if
					else {
						System.out.print("_");
					}//else
				} // for
				System.out.println();
			} // for
		} catch (Exception e) {
			e.printStackTrace();
		}


	} // main
}
