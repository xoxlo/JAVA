package exam01;

public class Variable01 {
	public static void main(String[] args) {
		//출력 메소드
		System.out.println("Java 2일차 입니다.");
		//단축키
		System.out.println("syso Ctrl + Space 출력문 자동생성");
//		Ctrl + Alt + 화살표 아래(위) : 코드 복사 단축키
		System.out.println(1000);
		System.out.println(178645464);
		
//		변수 선언 : 자료형 변수명;
		int a;
		
//		변수에 값 저장
		a = 10;
		
//		선언과 동시에 값을 저장
//		초기화 : 변수에 값을 처음 넣어 주는 것
		int b = 12; // 자료형 변수명 =(대입연산자) 값;
		
//		변수에 저장된 값 사용 : 변수명 사용
		System.out.println(a);
		
//		여러개의 변수 선언
		int c, d;
		c = 10;
		d = 20;
		System.out.println(c);
		System.out.println(d);
	}
}
