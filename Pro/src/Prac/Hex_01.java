package Prac;

public class Hex_01 {
	
	public static void main(String[] args) {
		int n = 125;
		int share,reminder;
		
		String hex = "0123456789abcdef";
		StringBuilder sb = new StringBuilder();
		
		while (n !=0) {
			share = n / 16;
			reminder = n%16;
			sb.append(hex.charAt(reminder));
			n = share;
		}
		System.out.printf("0x%s",sb.reverse());
	} // main

}
