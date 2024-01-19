package inheritance;


// Person클래스의 자식클래스
public class Student extends Person{
	
// 메소드
	void study() {
		System.out.println(name + "은 공부를 한다");
		// name이라는 변수는 Person 클래스에서 상속받은 필드
	}
	
	public Student() {
		super();
	}
}
