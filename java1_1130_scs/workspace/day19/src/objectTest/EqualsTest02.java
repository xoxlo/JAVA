package objectTest;

class Person {
//	필드
	String name;
	int age;
	
//	생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {	// 현재 객체와 비교대상. 객체가 같은 인스턴스인 경우
			return true;	// 두 객체가 동일하다고 판단
		}
		
		if(obj == null || this.getClass() != obj.getClass()) {
		//	비교 대상 객체 null이거나 클래스타입이 다른 경우
			return false;
		}
		
		Person p = (Person)obj;	// 다운 캐스팅
		// 비교 대상 객체 obj를 Person 타입으로 형 변환하여 p에 저장
		return this.name == p.name;
		// 현재 겍체의 name 필드와 비교 대상 객체의 name 필드를 비교하여
		// 같으면 true, 다르면 false로 출력
		
		
		// equals() 메소드는 객체의 name필드만을 비교하여 같은지 판단함
	}
}


public class EqualsTest02 {
	public static void main(String[] args) {
		
		Person p1 = new Person("철수", 345);
		Person p2 = new Person("퉁퉁이", 15);
		Person p3 = new Person("철수", 20);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		
		//getClass
		System.out.println(p1.getClass());
		System.out.println(p2.getClass());
		
	}
}
