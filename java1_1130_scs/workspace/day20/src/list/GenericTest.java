package list;

class MyClass<T> {	// T라는 타입 매개변수를 가진 제네릭 클래스
	
//	필드
	T data;

	public MyClass(T data) {
		super();
		this.data = data;
	}
	
	void printData() {
		System.out.println(data);
	}
}

public class GenericTest {
	public static void main(String[] args) {
		MyClass<String> mc = new MyClass<String>("안녕");
		mc.printData();
		
		MyClass<Integer> mc2 = new MyClass<Integer>(10);
		mc2.printData();
	}
}
