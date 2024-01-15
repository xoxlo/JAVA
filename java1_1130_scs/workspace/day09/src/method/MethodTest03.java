package method;

public class MethodTest03 {
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
//	오버로딩 : 같은 클래스 안에서 메소드명 동일, 매개변수 타입과 갯수만 다르면 가능하다
	
	int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	
	
	public static void main(String[] args) {
		MethodTest03 t = new MethodTest03();
		System.out.println(t.add(10, 20));
		System.out.println(t.add(10, 20, 30));
	}
}
