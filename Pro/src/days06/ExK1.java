package days06;

import java.util.Scanner;

public class ExK1 {
	public static void main(String[] args) {

		int n;
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("정수 입력");
			
			
			String inputData = scanner.nextLine();
			String regex= "^\\d+$";
			
			boolean flag= inputData.matches(regex);
			
			if(flag) {
				n=Integer.parseInt(inputData);
				System.out.println(n);
			}else {
				System.out.print("no");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}//catch
	}//main
}//class
