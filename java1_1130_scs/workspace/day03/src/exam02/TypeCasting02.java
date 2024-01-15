package exam02;

public class TypeCasting02 {
	public static void main(String[] args) {
		
//		자동형변환
		double number1 = 1 + 0.0; // 정수 + 실수 = 실수
		char character = 'A' + 1; // 문자형 + 정수 = 문자형
		int number2 = 'a';		// 문자형 -> 정수
		System.out.println(number1);
		System.out.println(number2);
		System.out.println(character);

	}
}
