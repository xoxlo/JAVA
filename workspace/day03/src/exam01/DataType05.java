package exam01;

public class DataType05 {
	public static void main(String[] args) {
//		논리형 boolean
		boolean bol1 = true;
		boolean bol2 = false;
		System.out.println(bol1);
		System.out.println(bol2);
		
//		상수
		
		int num1 = 5;
//		변수의 값 수정
		num1 = 10;
		
		final int NUM1 = 10;
//		NUM1 = 120; 상수는 값의 수정이 불가능하다
		
		final int FINAL_NUMBER = 30;
		
		System.out.println(num1);
		System.out.println(NUM1);
		System.out.println(FINAL_NUMBER);
		System.out.println("\"안녕하세연\"");
		
	}
}
