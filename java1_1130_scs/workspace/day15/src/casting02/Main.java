package casting02;

public class Main {
	
	public static void main(String[] args) {
		Person p1 = new Person("김철수", 10, "초등학생");
		Student st1 = new Student("송창석", 24, "대학생", "순천대학교");
		Employee e1 = new Employee("김짱구", 30, "개발자", "루글");
		
//		객체 오버라이딩 진행되는 것 확인
//		p1.eat();
//		st1.eat();
//		e1.eat();
		
		printWalk(st1);
		printWalk(e1);
		printWalk(p1);

	}
	
//	static void printWalk(Student st) {
//		st.walk();
//	}
//	
//	static void printWalk(Employee e) {
//		e.walk();
//	}
	
//	매개변수에 부모 클래스 타입으로 하면 들어오면서 자동으로 업케스팅
							// Person st1	-> st1은 Student 타입이지만, up casting으로 자동으로 부모 클래스인 Person의 타입으로 변환되어 매개변수로 들어감
							// Person e1	-> e1은 Employee 타입이지만, up casting으로 자동으로 부모 클래스인 Person의 타입으로 변환되어 매개변수로 들어감
	static void printWalk(Person person) {
//		업케스팅 확인
//		person.walk();		// Person 클래스에는 walk() 메소드 없음 !
		if(person instanceof Student) {
			((Student)person).walk();	// 다운 캐스팅
		}else if(person instanceof Employee) {
			((Employee)person).walk();	// 다운 캐스팅
		}else {
			System.out.println("걷기 싫어 !");
		}
	}
}
