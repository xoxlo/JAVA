package castingTask;

public class Animal {
	
//	필드 : 이름, 나이
	String name;
	int age;
	
//	생성자 1개 : 이름, 나이 초기화
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
//	void printText() {} // 하위 클래스에서 override를 해주면 업캐스팅된 상태에서 바로 사용 가능
}
