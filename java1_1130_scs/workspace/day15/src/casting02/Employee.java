package casting02;

public class Employee extends Person {
	
//	필드
	String workSpace; // 회사명

	public Employee(String name, int age, String job, String workSpace) {
		super(name, age, job);
		this.workSpace = workSpace;
	}
	
//	자식 클래스에서 추가할 메소드
	
	void walk() {
		System.out.println(name + "은(는) " + workSpace + "로 출근한다");	
	}

	@Override
	void eat() {
		System.out.println(name + "은(는) " + workSpace + "의 구내식당에서 점심을 먹는다");
	}
	
	
}
