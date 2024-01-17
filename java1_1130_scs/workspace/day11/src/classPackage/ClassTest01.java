package classPackage;

// 클래스 선언
// class 클래스명 (앞글자 대문자 !)

class Student {
	
//	멤버(필드)
	String name;
	int kor;
	int math;
	int eng;
	
//	메소드
//	학생의 총합 점수를 계산하는 메소드 getTotal()
	int getTotal() {
		return kor + eng + math;
	}
	
//	기본 생성자(우리가 선언하지 않아도 자동으로 생성됨(묵시적 생성자))
	Student() {
		
	}
	
}
public class ClassTest01 {
	public static void main(String[] args) {
		
//		클래스로 객체를 생성
		Student st1 = new Student();
		Student st2 = new Student();
		
//		클래스의 멤버 접근
//		객체명.멤버명
		st1.name = "김경윤 붕쉰\n존나 쳐자네 ㅋㅋ";
		st1.kor = 0;
		st1.math = 0;
		st1.eng = 0;
		
		st2.name = "송창석";
		st2.kor = 100;
		st2.math = 100;
		st2.eng = 100;
		
		System.out.println(st1.name + "의 국어 점수는 " + st1.kor + "입니다");
		System.out.println(st2.name + "의 국어 점수는 " + st2.kor + "입니다");
		System.out.println(st1.name + "의 총점은 " + st1.getTotal() + "입니다");
		System.out.println(st2.name + "의 총점은 " + st2.getTotal() + "입니다");
//		System.out.println(st1.name);
//		System.out.println(st2.name);
	}
}
