package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex01 {
	public static void main(String[] args) throws IOException 
	{



		String name ;
		int kor, eng, mat, total;
		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름,국,영,수 입력? ");

		String data = br.readLine();
		String regex = "[, ]";
		String [] datas = data.split(regex);

		name = datas[0];
		kor = Integer.parseInt(datas[1]);
		eng = Integer.parseInt(datas[2]);
		mat = Integer.parseInt(datas[3]);

		total = kor+eng+mat;

		avg =(double)total/3;


		System.out.printf("> 이름 = \"%s\", 국어 = %d, 영어 = %d, 수학 = %d 총첨 = %d 평균 = %.2f", name, kor,eng,mat,total,avg);	
	} // main



} // class
