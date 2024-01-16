package classPackage;

class Person{
	
//	필드(이름, 나이, 직업)
	String name;
	int age;
	String job;
	
//	생성자 : 이름, 나이, 직업 객체화 하는 작업에서 초기화
	Person(String name, int age, String job){
		this.name = name;
		this.age = age;
		this.job = job;
	}
	
//	자기소개 메소드
	void introduce() {
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println("제 나이는 " + age + "살 이고 직업은 " + job + "입니다.");
	}
}

public class ClassTest02 {
	public static void main(String[] args) {
		
//		Person 클래스 객체화
		Person p1 = new Person("송창석", 24, "학생");
		Person p2 = new Person("송창석", 24, "학생");
		System.out.println(p1);
		System.out.println(p2);
		p1.introduce();
	}
}
