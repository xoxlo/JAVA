package castingTask;

public class Task {
//	메소드 추가 매개변수타입 부모 클래스 타입
//	다운캐스팅해서 printText() 메소드 실행
//	메인 메소드에서 호출
	
	public static void main(String[] args) {
		Animal a = new Animal("멍통이", 3);
		Dog dog = new Dog("젤리", 4);
		Cat cat = new Cat("별", 2);
		
		animal(dog);
		animal(cat);
		animal(a);
	}

	static void animal(Animal animal) { // 제일 부모 클래스 타입인 Animal로 up casting
//		animal.printText(); // override가 아니고 Animal 클래스에 없는 메소드를 하위 클래스에서 추가했기 때문에 사용 불가
							// 만약 Animal 클래스에 printText()라는 메소드가 있고, 하위 클래스에서 오버라이딩 됐으면 사용 가능
		
		if(animal instanceof Dog) { // 매개변수로 불러온 참조변수 animal의 값이 Dog 타입이면
			((Dog)animal).printText(); // down casting
		}else if(animal instanceof Cat) { // 매개변수로 불러온 참조변수 animal의 값이 Cat 타입이면
			((Cat)animal).printText(); // down casting
		}else {
			System.out.println("무슨 동물인지 모르겠음"); // 아무것도 아니면 else문 실행
		}
	}
}
