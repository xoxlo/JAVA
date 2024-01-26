package anonymous;

class Animal {
	public void cry() {
		
	}
}

public class Anonymous {
	
//	방법1) 필드 익명 자식 객체를 생성
	Animal dog = new Animal() {
//		일회성으로 Animal 클래스를 구현
		
		String name = "멍멍이";
		
		@Override
		public void cry() {
			System.out.println("강아지 " + name + "는(은) 멍멍 !");
		}
	};
	
//	방법2) 지역변수의 초기값으로 대입
	void method1() {
		Animal cat = new Animal() {
				
			String name = "별이";

			@Override
			public void cry() {
				System.out.println("고영이 " + name + "는(은) 야옹 ~");
			}
		};
		cat.cry();	// 지역 변수이기 때문에 바로 사용해야함
	}
	
//	방법3) 익명객체를 매개변수로 대입
	void method2(Animal animal) {
		animal.cry();
	}
	
	public static void main(String[] args) {
		
		Anonymous a = new Anonymous();
		
//		방법1) 필드에 익명 자식 객체를 생성
		a.dog.cry();
		
//		방법2) 지역변수의 초기값으로 대입
		a.method1();
		
//		방법3) 익명객체 매개변수로 대입
		a.method2(new Animal() {
			
			String name = "무우";
			
			@Override
			public void cry() {
				System.out.println("소 " + name + "는(은) 음메 ~");
			}
		});
		
	}

	
}
