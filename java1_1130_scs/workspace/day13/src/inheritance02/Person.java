package inheritance02;

public class Person {
	
//	부모 클래스 필드
	String name;
	int age;

//	부모 클래스 생성자
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void printName() {
		System.out.println("부모 클래스의 name은 " + name);
	}
}
