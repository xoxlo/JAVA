package method;

public class MethodTest01 {
	
//	두 개의 정수를 합하는 메소드
//	리턴타입 메소드명(매개변수)
	int add(int num1, int num2) {
//		실행할 기능
		int result = num1 + num2; // 지역변
		return result;
	}
	
	public static void main(String[] args) {
		MethodTest01 task = new MethodTest01();
		
//		int num = 10; // 프로구램을 실행하면서 저장공간에 할당됨
		
		int result = task.add(10, 20) ;
		System.out.println(result);
		System.out.println(task.add(10, 20)+2);
	}
}
