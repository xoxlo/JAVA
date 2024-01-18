package staticTest;

// 실습
// Family 클래스
class Family {
	// 멤버 필드 : name, age, address
	String name;
	int age;
	static String address;
	
	// 생성자 1개 : name, age, address 초기화
	Family(String name, int age, String address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	// 메소드 : introduce() -> 이름, 나이, 주소 출력하는 기능
	void introduce() {
		System.out.println("저의 이름은 " + name + "이고 나이는 " + age + "살 입니다");
		System.out.println("사는 곳은 " + address + "입니다");
	}
}

public class StaticTest01 {
	public static void main(String[] args) {
		
//		Family 객체화
		Family son = new Family("송창석", 24, "전남 순천");
		Family pet = new Family("젤리", 4, "전남 순천");
		
//		아들이 인천으로 이사간다, 이 말은 즉 Family가 "인천"으로 이사간다는 뜻 (static 변수이기 때문에 Family 클래스로 생성된 모든 객체의 address가 바뀜)
		Family.address = "인천";
		
//		introduce 메소드
//		객체명.멤버명
//		객체명.메소드명()
		son.introduce();
		pet.introduce();

	}
}
