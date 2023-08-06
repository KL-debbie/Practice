package Prac;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class Money {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)){
			System.out.print(">돈 입력");
			int money = sc.nextInt();
			
			int count =0;
			int unit =50000;
			boolean sw = false;
			
			while (unit>=1) {
				count = money /unit;
				System.out.printf("%d원 : %d개\n", unit, count);
				money %=unit;
				unit /= !sw? 5 :2;
				sw =!sw;
			}// while
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
