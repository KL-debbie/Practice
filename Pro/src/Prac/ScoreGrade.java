
package Prac;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  피보나치 수열 덧셈
 * @content
 */
import java.util.Scanner;

import days13.Student;

public class ScoreGrade {

	public static void main(String[] args) throws IOException {
		
		String name;
		int kor,eng,mat,tot;
		double avg;
		int rank;

		final int STUDENT_COUNT = 30;

		Student [] students = new Student[STUDENT_COUNT];
		
		Scanner scanner =new Scanner(System.in);
		int count =0;
		char con = 'y';
		int no = 1;
		do {
			System.out.print(">이름 국, 영, 수 입력 ? ");

			name =getName();
			kor= getScore();
			eng= getScore();
			mat= getScore();

			tot = kor+eng+mat;
			avg = (double)tot/3;
			rank = 1;
			students[count]= new Student();
			
			students[count].no= no++;
			students[count].name= name;
			students[count].kor= kor;
			students[count].eng= eng;
			students[count].mat= mat;
			students[count].tot= tot;
			students[count].avg= avg;
			students[count].rank= rank;

			count++;

			System.out.print("계속 진행 ? ");
			con =(char)System.in.read();
			System.in.skip(System.in.available());

		} while (Character.toUpperCase(con)=='Y');


		for (int i = 0; i <count; i++) {
			students[i].printStudentInfo();
		} // for

	}

	private static String getName() {
		Random rnd = new Random();
		char [] nameArr = new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i]= (char)(rnd.nextInt('힣'-'가'+1)+'가');

		} // for
		String name = String.valueOf(nameArr);
		return name;

	}

	private static int getScore() {
		return (int)(Math.random()*101);
	}


}//class
