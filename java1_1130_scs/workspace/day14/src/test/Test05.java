package test;

class Student {
//	필드
	int kor;
	int math;
	int eng;
	
//	생성자
	Student(int kor, int math, int eng) {
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	float getAvg() {
		return (int)((kor+eng+math)/3f*10+0.5f)/10f;
	}
}
public class Test05 {
	public static void main(String[] args) {
		Student st1 = new Student(80, 70, 80);
		System.out.println(st1.getAvg());
	}
}
