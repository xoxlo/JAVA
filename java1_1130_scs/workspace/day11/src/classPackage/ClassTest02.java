package classPackage;

class Person {

//	필드 : 이름, 나이, 직업
	String name;
	int age;
	String job;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	생성자 : Person 클래스의 객체를 생성 name, age, job 초기화
	Person(String name, int age, String job) {
		this(name, age);
		this.job = job;
	}

}

public class ClassTest02 {

//	클래스명 객체명 = new 생성자();	
	public static void main(String[] args) {
		Person p1 = new Person("송창석", 24, "학생");
		Person p2 = new Person("김경윤", 24);
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.job);
		
		System.out.println();
		p2.job = "장애인";
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.job);
	}
}
