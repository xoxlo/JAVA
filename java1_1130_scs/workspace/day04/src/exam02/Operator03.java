package exam02;

public class Operator03 {
	public static void main(String[] args) {
		
//		관계연산자
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1 > num2); // 10이 3보다 크니? -> 응, 커 !
		System.out.println(num1 <= num2); // 10이 3 이하니? -> 아니
		
		System.out.println(num1 == num2); // 10이랑 3이 같니? -> 아니, 달라
		System.out.println(num1 != num2); // 10이랑 3이 다르니? -> 응, 달라
		
		boolean bo1 = num1 > num2;
		System.out.println(bo1);
	}
}
