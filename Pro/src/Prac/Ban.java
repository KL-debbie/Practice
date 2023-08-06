package Prac;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.stream.IntStream;

import days10.Ex06_04;

public class Ban {
	public static void main(String[] args) throws IOException {
		// 3반 30명 학생 이,국,영,수,총,평,반등수,전교등수 처리 코딩.
		final int STUDENT_COUNT = 30;
		final int CLASS_COUNT =3;
		
		String [][] names = new String [CLASS_COUNT][STUDENT_COUNT];
		double [][] avgs = new double [CLASS_COUNT][STUDENT_COUNT];
		int [][][] infos = new int [CLASS_COUNT][STUDENT_COUNT][6];
		
		char con ='y';
		int [] counts = new int [CLASS_COUNT];
		
		String name;
		int kor,eng,mat,tot,rank,wrank;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		int ban;
		
		do {
			System.out.printf("반 입력");
			ban = sc.nextInt();
			
			System.out.printf("[%d반]의 %d번 학생 이름,국영수 입력 ? ",ban, counts[ban-1]+1);
			name = Ex06_04.getName();
			kor = Ex06_04.getScore();
			eng = Ex06_04.getScore();
			mat = Ex06_04.getScore();
			
			tot = kor+eng+mat;
			avg = (double)tot/3;
			rank =1;
			wrank=1;
			
			names[ban-1][counts[ban-1]]=name;    //names[반][번호]
			infos[ban-1][counts[ban-1]][0] =kor;
			infos[ban-1][counts[ban-1]][1] =eng;
			infos[ban-1][counts[ban-1]][2] =mat;
			infos[ban-1][counts[ban-1]][3] =tot;
			infos[ban-1][counts[ban-1]][4] =rank;
			infos[ban-1][counts[ban-1]][5] =wrank;
			
			counts[ban-1] ++;
			
			System.out.print("계속 입력 ? ");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con)=='Y');
		
		
		// 등수 처리
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts.length; j++) {
				infos[i][j][4] =1;
				infos[i][j][5] =1;
			
				for (int i2 = 0; i2 < counts.length; i2++) {
					for (int j2 = 0; j2 < counts[i]; j2++) {
						if( infos[i][j][3] <  infos[i2][j2][3])
							infos[i][j][5]++;
						if(i==i2)
							infos[i][j][3] =1;
					} // for j2
				} // for i2
			} // for f
		} // for i
		
		int 총학생수 = IntStream.of(counts).sum();
		System.out.println("\n\n\n\n");
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d반] 학생 %d명\n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n",
								i+1, 
								names[i][j], 
								infos[i][j][0],
								infos[i][j][1],
								infos[i][j][2],
								infos[i][j][3],
								avgs[i][j],
								infos[i][j][4],
								infos[i][j][5]
										);
			} // for
		} // for
	} // main

} // class









