package inheritance02;

// Person 클래스의 자식 클래스
public class Student extends Person{
	
//	자식 클래스 필드
	String job;

	public Student(String name, int age, String job) {
		super(name, age); // 부모 클래스 생성자 호출
//		this.name = name;
//		this.age = name;
		this.job = job;
	}
	
	void introduce() {
		super.printName(); // 부모 클래스의 멤버에 접근
		System.out.println("내 이름은 " + name + "이야 !");
		System.out.println("나이는 " + age + "살이고");
		System.out.println("직업은 " + job + "이야");
	}
	
}
