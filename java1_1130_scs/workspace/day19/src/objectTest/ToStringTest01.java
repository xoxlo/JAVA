package objectTest;

class Student{
	// 필드
	int math;
	int kor;
	int eng;
	
//	생성자
	public Student(int math, int kor, int eng) {
		super();
		this.math = math;
		this.kor = kor;
		this.eng = eng;
	}
	
	@Override
	public String toString() {
		return "수학 : " + math + "\n국어 : " + kor + "\n영어 : " + eng;
	}
	
}

public class ToStringTest01 {
	public static void main(String[] args) {
		Student st1 = new Student(100, 95, 90);
		System.out.println(st1);
	}
}
