
package Prac;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
/**
 * @author KL
 * @date 2023. 7. 22. - 오후 5:53:08
 * @subject  피보나치 수열 덧셈
 * @content
 */
import java.util.Scanner;

public class Del {

	public static void main(String[] args) throws IOException {

		int []m= {3,4,6,7,7,8};
		System.out.println(Arrays.toString(m));
		
		int index =2;
		int n =23;
		
		int[] temp= new int[m.length+1];
		for (int i = 0; i < m.length; i++) {
			if(index>i) temp[i]=m[i];
			else if (index<=i) temp[i+1]=m[i];
		} // for
		temp[index]= 23;
		m=temp;
		System.out.println(Arrays.toString(m));
		
		System.out.println();
	
		int [] m2 = {3,6,98,2,5,8};
		
		System.out.println(Arrays.toString(m2));
		int index1 =3;
		int [] temp1 =new int[m2.length-1];
		System.arraycopy(m2, 0, temp1, 0, 4);
		for (int i = 0; i < m2.length; i++) {
			temp[index++]= m2[i];
		} // for
		m2=temp;
		System.out.println(Arrays.toString(m2));
		
		
		int [] m1 = new int[25];
		for(int i=0; i<m1.length; i++){
			m1[i]= i+1;
		}
		System.out.println(Arrays.toString(m1));

		shuffle(m1);

		System.out.println(Arrays.toString(m1));
	}

		public static void shuffle(int[]m1){

			int index,temp;
			for(int i = 0; i<25; i++){
				index = (int)(Math.random()*24)+1;
				temp=m1[0];
				m1[0] = m1[index];
				m1[index] =temp;
			}

		}

	}//class
