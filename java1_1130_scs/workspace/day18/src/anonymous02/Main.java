package anonymous02;

public class Main {
	public static void main(String[] args) {
		ClassA ca = new ClassA();
		InterA a = new ClassA();
		
//		익명으로 인터페이스 구현
		InterA b = new InterA() {
			
			@Override
			public void printData() {
				System.out.println("익명클래스에서 오붜롸위딍");
			}
		};
		
		b.printData();
		ca.printData();
		a.printData();
	}
}
