package days12;

/**
 * @author KL
 * @date 2023. 7. 28. - 오전 10:18:30
 * @subject
 * @content
 */
public class Ex01_03 {
	public static void main(String[] args) {
	
		// 3*4 -> 1차원 -> 2*6 변환
		
		// 1. 3*4 배열 불러오기
		int [][] m = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		dispM(m);

		// 2. 1차원으로 변형
		int [] n = new int[m.length*m[0].length];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				n[m[0].length*i+j]= m[i][j];
			} // for
		} // for
		dispM(n);

		// 3. 2차원으로 다시 변경
		int [][] m1 = new int[2][6];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m1[(4*i+j)/6][(4*i+j)%6]= m[i][j];
			} // for
		} // for	
		dispM(m1);
		
	}

	private static void dispM(int[] n) {
		for (int i = 0; i < n.length; i++) {
			System.out.printf("[%d]", n[i]);
		} // for
		System.out.println();
	}

	private static void dispM(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("[%02d]", m[i][j]);
			} // for
			System.out.println();
		} // for
	}
}