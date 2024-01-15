package exam01;

public class IfTask02 {
	public static void main(String[] args) {
		
		int myAge = 20;
		
//		if문을 여러개 작성했을 시 else if문과는 다르게 조건식들이 동시에 참인지 거짓인지 판별
		if(myAge >= 20) {
			System.out.println("20살 이상입니다");
		}if(myAge >= 17) {
			System.out.println("고등학생입니다");
		}
	}
}
