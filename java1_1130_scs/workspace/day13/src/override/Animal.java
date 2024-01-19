package override;

// <실습>
// 자식 클래스 Dog
// 필드
// String spec // 종
// 메소드
// eat, sleep 재정의
// walk() : 매개변수(place) -> "강아지 000는 000 산책하는 걸 좋아한다"

// Main 클래스
// eat, sleep, walk 호출
public class Animal {
	// 필드
	String name;
	int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//	메소드
	void eat() {
		System.out.println("동물은 어떤 것을 먹을까요 ?");
	}
	
	void sleep() {
		System.out.println("동물은 어떻게 잘까요 ?");
	}
	
	void walk() {
		System.out.println("동물은 어떤 산책을 하나요 ?");
	}
	
	void age() {
		System.out.println("동물은 몇 살 일까요 ?");
	}
}
