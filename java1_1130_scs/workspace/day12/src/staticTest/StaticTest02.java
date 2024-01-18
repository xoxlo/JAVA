package staticTest;

class ClassA{
	
//	필드(멤버 변수)
	int instanceVar; // iv. 인스턴스 변수
	static int staticVar; // cv. 정적 변수, 스태틱 변수, 클래스 변수
	
//	메소드
	
	void instanceMethod() { // 인스턴스 메소드
		instanceVar = 10; // 인스턴스 메소드 안에서 인스턴스 변수 사용 가능
		staticVar = 20; // 인스턴스 메소드 안에서 static 변수 사용 가능
		instanceMethod2(); // 인스턴스 메소드 호출 가능
		System.out.println("iv입니다");
	}
	void instanceMethod2() { // 인스턴스 메소드
		
	}
	static void staticMethod() { // 정적 메소드, 스태틱 메소드, 클래스 메소드, ....
//		instanceVar = 20; // 스태틱 메소드 안에서 인스턴스 변수 사용 불가능
		staticVar = 30; // 스태틱 메소드 안에서 static 변수 사용 가능
//		instanceMethod(); // 스태틱 메소드 안에서 인스턴스 메소드 사용 불가능
		staticMethod2(); // 스태틱 메소드 안에서 static 메소드 사용 가능
		System.out.println("cv입니다"); // 클래스 메소드
	}
	static void staticMethod2() {
		
	}
	
	
}

public class StaticTest02 {
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.instanceVar = 20; // 객체명.인스턴스 변수 가능
		System.out.println(a.instanceVar); // 객체명.스태틱 변수 가능
		a.instanceMethod();
		a.staticMethod();
		
		a.staticVar = 30; // a.cv 30으로 변경
		ClassA.staticMethod(); //
//		인스턴스 변수 호출

		
	
	}
}
