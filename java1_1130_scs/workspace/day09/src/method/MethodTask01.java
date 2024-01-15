package method;

public class MethodTask01 {

	
//	<실습1>
//	더하기, 빼기, 곱하기
	
//	더하기(add) : 매개변수 2개, 리턴 X
//	빼기(sub) : 매개변수 X, 리턴 O
//	곱하기(mul) : 매개변수 2개, 리턴 O
	
	void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	
	int sub() {
		int n1 = 300;
		int n2 = 150;
		return n1 - n2;
	}
	
	int mul(int n1, int n2) {
		return n1 * n2;
	}
	
	public static void main(String[] args) {
		MethodTask01 test = new MethodTask01();
		
//		1) 더하기(add)
		test.add(10, 20); // 10 + 20
		
//		2) 빼기(sub)
		System.out.println(test.sub()); // 300 - 150
		
//		3) 곱하기(mul)
		System.out.println(test.mul(10, 20)); // 10 * 20
		
		
		
	}
	
}