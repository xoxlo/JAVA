package casting02;

public class Person {
	
//	필드
	String name;
	int age;
	String job;
	
//	부모 생성자
	public Person(String name, int age, String job) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
//	자식클래스에서 추가할 메소드
	void eat() {
		System.out.println(name + "은(는) 밥을 먹는다");
	}
}
