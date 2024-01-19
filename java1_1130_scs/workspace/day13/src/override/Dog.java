package override;

public class Dog extends Animal{
	String spec;
	
	Dog(String name, int age, String spec) {
		super(name, age);
		this.spec = spec;
		
	}
	
//	오버라이드 단축키 : Alt + Shift + S, V
	@Override
	void eat() {
		System.out.println(spec + "종인 강아지 " + name +"는 사료를 먹습니다");
	}
	@Override
	void sleep() {
		System.out.println(spec + "종인 강아지 " + name + "는 기분에 따라 다릅니다");
	}

	void walk(String place) {
		System.out.println(spec + "종인 강아지 " + name + "는 " + place + " 산책하는 걸 좋아합니다");
	}
	@Override
	void age() {
		System.out.println(spec + "종인 강아지 " + name + "는 " + age + "살 입니다");
	}
}
