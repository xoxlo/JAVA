package castingTask;

public class Cat extends Animal {

	public Cat(String name, int age) {
		super(name, age);
	}
	
	void printText() {
		System.out.println("고양이 \"" + name + "\"은(는) " + age + "살");
	}
}
