package days14;


public class Point { 
	
	
	//필드
	private int x;
	private int y;
	
	//디폴트생성자
	public Point() {
		
		System.out.println(">Point 디폴트 생성자 호출됨...");
	}

	public Point(int x, int y) {
		System.out.println(">Point 2 생성자 호출됨...");
		// The assignment to variable x has no effect
		// x변수에 대입해도 효과가 없음,,,,,,,,,,,,,,,,,,
		// 값 넣으나 마나 매개변수인지 필드인지 구분 X
		//x=x;
		
		this.x=x; //자기자신의 멤버
	 	this.y=y; // 생략시 지역변수와 참조변수 구별이 가지않음
		
	}
	
	public Point(int i) {
		this(i,i); //point (x,y) 호출 항상 첫줄
		System.out.println(">Point 1 생성자 호출됨...");
		// this.x=i;
		// this.y=i;
	}

	// p1.printPoint()
	// 호출한 객체 p1 -> x,y
	// p2.printPoint()
	// 호출한 객체의 필드 p2 -> x,y
	// 
	public void printPoint() {
		System.out.printf(">x=%d, y=%d\n",this.x, this.x);
	}
	
	public Point offsetPoint(int n) {
		this.x += n; 
		this.y += n;
		return this;  //
	}
	
}//class

