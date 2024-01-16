package classPackage;

// Animal 클래스
// 필드 : 이름(name), 나이(age), 종(spe)
// 생성자 1개 : 이름, 나이, 종
// 메소드명 introduce() : 이름, 나이, 종 출력

class Animal {
//	필드
	String name;
	int age;
	String spe;
	
//	생성자
	Animal(String name, int age, String spe){
		this.name = name;
		this.age = age;
		this.spe = spe;
	}
	
//	introduce() 메소드
	void introduce() {
		System.out.println("동물의 이름은 \"" + name + "\"입니다");
		System.out.println("나이는 " + age + "살 이고 종은 " + spe + "입니다.");
	}
	
}

public class ClassTask01 {
	public static void main(String[] args) {
// 		2개 객체 생성
// 		dog 객체, cat 객체
// 		객체마다 메소드(introduce()) 호출
		
//		Animal 클래의 인스턴스(객체) dog 생성 : 이름, 나이, 종 초기화
		Animal dog = new Animal("젤리", 4, "강아지");
		Animal cat = new Animal("별", 2, "고양이");
		
//		Animal 클래스 안에 있는 메소드 호출
		dog.introduce();
		System.out.println();
		cat.introduce();
	}
}
