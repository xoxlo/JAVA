package abstractTest02;

abstract class Animal {
	
//	추상 메소드
	abstract void crying();
}

class Dog extends Animal {
	
//	추상 클래스를 상속받는 자식 클래스에서는 추상메소드를 재정의 해야한다 ! -> 실수로라도 기능 미구현 방지 !
	@Override
	void crying() {
		System.out.println("멍멍 !");
	}
}

class Cat extends Animal {

	@Override
	void crying() {
		System.out.println("야옹 ~");
	}
	
}


public class Abstract {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal dog1 = new Dog(); // up casting, Animal 타입을 가지고 있는 Dog 객체
		Cat cat = new Cat();
		Animal cat1 = new Cat(); // up casting, Animal 타입을 가지고 있는 Cat 객체
		dog.crying();
		dog1.crying();
		cat.crying();
		cat1.crying();
	}
}
