package days22;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

public class Ex15 {
	
	public static void main(String[] args) {
		
		LinkedHashSet lotto = new LinkedHashSet();
		dispLotto(lotto);
		fillLotto(lotto);
	}//main

	public static void fillLotto(LinkedHashSet lotto) {
		Iterator ir=lotto.iterator();
		while (ir.hasNext()) {
			int n = (int) ir.next();
			System.out.printf("[%d]",n);
		} //while
	}

	public static void dispLotto(LinkedHashSet lotto) {
		Random rnd = new Random();
		while (lotto.size() <6) {
			int n = rnd.nextInt(45)+1;
			lotto.add(n);
		} //while
		
	}

}
