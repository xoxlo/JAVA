package castingTask;

public class Dog extends Animal {
	
//	메소드 1개 추가 printText() : 이름, 나이 출력하는 메소드
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	void printText() {
		System.out.println("강아지 \"" + name + "\"은(는) " + age + "살");
	}
}
