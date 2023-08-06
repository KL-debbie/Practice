package days01;

public class Ex04_02 {
	
	// 본인의 이름을 name 이라는  변수를 선언하고 
	// 본인의 나이를 age 이라는 변수를 선언하고
	// 이름, 나이를 출력하는 코딩을 하세요.
	public static void main(String[] args) {
		String name;
		name = "이창익";		
		
		// 나이를 저장할 변수 선언
		// Type mismatch: cannot convert from int to String
		// 자료형 변수명=초기값;
		//  정수자료형      age = 20;
		int age = 20;
		
		System.out.println( name );
		System.out.println( age );
	} // main

} // class
