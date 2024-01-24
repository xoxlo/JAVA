package inter;

public class Main {
	public static void main(String[] args) {
	
	
//		인터페이스는 객체화 할 수 없다
//		Inter inter = new Inter();
		ClassA a = new ClassA(); // 인터페이스를 구현한 클래스 객체화
		Inter inter = new ClassA(); // 인터페이스 타입으로 업캐스팅 가능 !, Inter 타입을 가진 자식클래스(ClassA)의 객체
		
		a.method1();
		a.method2();
		inter.method1();
		inter.method2();
		
		System.out.println(Inter.VAR1);
//		Inter.method1(); 인터페이스의 메소드는 호출 안됨 ! (미구현된 메소드이기 때문)
		
	}
}
