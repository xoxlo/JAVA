package object;

class MyObject {
//	Object 클래스를 상속
//	필드 int value
	int value;

//	생성자
	public MyObject(int value) {
		super();
		this.value = value;
	}

	@Override
	public int hashCode() {
//		// TODO Auto-generated method stub
//		return super.hashCode();
		return value;
	}
	
	
}

public class Main {
	public static void main(String[] args) {
		MyObject m1 = new MyObject(10);
		
		System.out.println(m1);
		System.out.println(m1.hashCode());	// 참조값을 정수로 반환
	}
}
