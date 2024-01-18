package person;

public class Main {
	public static void main(String[] args) {
//		부모 클래스 Person
		Person p = new Person();

		p.sleep();
//		s.study(); 부모의 객체에서 자식의 멤버 접근 불가 !
		
		Student s = new Student();
		s.eat(); // 자식 클래스의 객체는 부모의 멤버 접근 가능
		s.sleep();
		
		Employee e = new Employee();
		e.employeenumber = 10;
		e.sleep();
//		e.study(); 자식끼리는 서로 멤버를 공유하지 않음 !
	}
}
