package Prac;

/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  주민번호/우편번호---- 정규표현식
 *           숫자             -   \d
 *           반복 횟수        -   {n}  - n 만큼 오기,  {n,m}  -  n에서 m까지,   {n,}  -  적어도 n번
 *                                 ?   - 와도 되고 안와도 되고,  +(1, 여러번),  *(0,여러번)
 * 
 * 
 * @content
 */
public class Rrn_pra {

	public static void main(String[] args) {
		// 1. 주민번호 000000-0000000
		String Rnn = "123456-1234567";
		String regex = "[0-9]{6}-\\d{7}";
		
		if (Rnn.matches(regex)) {
			System.out.println("올바른 주민번호");
		} // if
		else System.out.println("틀린 주민번호");
		
		System.out.println();
		
		// 2. 우편번호 000-000, 00000
		
		/*
		String zipCode = "123-456";
		String zipCode2 = "12356";
		String zipCode3 = "1234-456";
		String zipCode4 = "123456";
		String zipCode5 = "1236";
		*/
		
		String [] zipCodes = {"123-456", "12356", "1234-456", "123456", "1256"};
		String regex1 = "\\d{3}-\\d{3}|\\d{5}";
		boolean flag = false;
			
		for (int i = 0; i < zipCodes.length; i++) {
			flag = zipCodes[i].matches(regex1);
			System.out.printf("%s - %s 우편번호\n", zipCodes[i], flag? "올바른":"잘못된");
			
		} // for
	}  //main
	

}  //class
