package classPackage;

class Person{
	
//	필드(이름, 나이, 직업)
	String name;
	int age;
	String job;
	
//	생성자 : 이름, 나이, 직업 객체화 하는 작업에서 초기화
	Person(String data1, int data2, String data3){
		name = data1;
		age = data2;
		job = data3;
	}
	
	void introduce() {
		System.out.println("제 이름은 " + name + "입니다.");
		System.out.println("제 나이는 " + age + "살 이고 직업은 " + job + "입니다.");
	}
}

public class ClasstTest02 {
	public static void main(String[] args) {
		
//		Person 클래스 객체화
		Person p1 = new Person("송창석", 24, "학생");
		p1.introduce();
	}
}
