package animal;

public class Dog extends Animal {
	
	@Override // 부모 클래스의 메소드를 재정의 했다는 어노테이션
	void cry() {
		super.cry();
		System.out.println("강아지는 왈라라라라왈왈왈라라라왈왈");
	}
	// 부모 클래스의 cry()를 재정의
}
