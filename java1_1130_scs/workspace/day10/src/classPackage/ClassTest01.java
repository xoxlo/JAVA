package classPackage;

// 클래스 선언
// class 클래스명{}
class Student{
	
	// 멤버 필드
	String name; // 학생의 이름
	int kor; // 국어 점수 전역변수
	int math; // 수학 점수
	int eng; // 영어 점수
	
//	생성자 : 클래스명과 동일
//	기본생성자 : 생성자를 선언하지 않았더라도 자동으로 생성됨
	Student(){
	
	}
	
//	멤버 메소드
//	총점을 구하는 메소드
	int getTotal() {
		return kor + math + eng; // 전역변수는 해당 클래스 내에 있는 메소드 안에서 재사용 가능ㄴㄴㄴㄴㄴㄴ
	}
	
}

public class ClassTest01 {
	public static void main(String[] args) {
		
		
//		객체화 작업 : 클래스 사용하기 위해
//		클래스명 객체명 = new 클래스명();
		Student st1 = new Student(); // Student라는 틀로 st1 객체 생성
		Student st2 = new Student();
		
//		st1이라는 학생의 이름과 점수 넣기
		st1.name = "짱구";
		st1.kor = 60;
		st1.math = 80;
		st1.eng = 90;
		
//		st2이라는 학생의 이름과 점수 넣기
		st2.name = "철수";
		st2.kor = 95;
		st2.math = 100;
		st2.eng = 85;

		System.out.println(st1.name + "의 총점은 " + st1.getTotal() + "입니다.");
		System.out.println(st2.name + "의 총점은 " + st2.getTotal() + "입니다.");
	}
}


