package method;

public class MethodTest02 {

//	1) 매개변수	X, 리턴	X
	void printHello() {
		System.out.println("안녕하떼연");
	}
	
//	2) 매개변수	X, 리턴	O
	int add() {
		int num1 = 1;
		return num1 + 10;
	}
	
//	3) 매개변수	O, 리턴	X
	void add2(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
//	4) 매개변수	O,	리턴	O
	int add3(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	
	public static void main(String[] args) {
		
		MethodTest02 test = new MethodTest02();
		
//		1) 매개변수	X, 리턴	X
		test.printHello();
		
//		2) 매개변수	X, 리턴	O
		System.out.println(test.add());
		
//		3) 매개변수	O, 리턴	X
		test.add2(10, 20);
		
//		4) 매개변수	O, 리턴	O
		System.out.println(test.add3(200,300));
		
	}
}
