package staticTest;

// 클래스명 ItStudent
// 멤버 : 이름, 나이, 과목명("java") subject
// 메소드 : 이름, 나이, 과목명 출력
// 생성자 1개 : 이름, 나이 초기화

// 메인 메소드
// 객체 2개 생성
// 모든 학생의 과목을 java로 통일
// 메소드 호출
class ItStudent {
	String name;
	int age;
	static String subject;
	
	ItStudent(String name, int age){
		this.name = name;
		this.age = age;
	}
	void introduce() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("과목명 : " + subject);
		System.out.println();
	}
}


public class StaticTask01 {
	public static void main(String[] args) {
		ItStudent st1 = new ItStudent("송창석", 24);
		ItStudent st2 = new ItStudent("안철수", 5);
		
//		모든 학생의 과목을 JAVA로 통일 -> 스태틱 변수 subject = "JAVA";
		ItStudent.subject = "JAVA";
		
		st1.introduce();
		st2.introduce();
	}
}
