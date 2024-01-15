package exam01;

public class Operator07 {
	public static void main(String[] args) {
		
//		삼항 연산자
		System.out.println(true ? "참" : "거짓");
		System.out.println(false ? "참" : "거짓");
		System.out.println(10>9 ? "참" : "거짓");
		
		String result1 = 10 > 9 ? "10은 9보다 크다" : "10은 9보다 작거나 같다";
		System.out.println(result1);
		
		int result2 = 10 > 9 ? 10 : 9;
		System.out.println(result2);
	}
}
