package exam02;

public class TypeCasting03 {
	public static void main(String[] args) {

//		int, double, char, boolean -> 기본자료형, 원시자료형
//		String, 클래스, ... -> 참조자료형, 클래스 자료형
		
//		기본 자료형 -> String
		String str1 = 3+"";
		String str2 = 'a' + "";
		System.out.println(str1);
		System.out.println(str2);
		
//		String -> 기본자료형
		int number1 = Integer.parseInt(str1);
		
		System.out.println(number1);
		System.out.println(Integer.parseInt("45"));
		System.out.println(Double.parseDouble("3.14"));
		System.out.println(Boolean.parseBoolean("true"));
	}
}
