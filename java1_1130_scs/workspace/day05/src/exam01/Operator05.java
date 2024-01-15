package exam01;

public class Operator05 {
	public static void main(String[] args) {
		
//		복합대입 연산자
		int num1 = 10;
		num1 += 3; // num1 = num1 + 3
		System.out.println(num1);
		
		int num2 = 5;
		num2 -= 1; // num2--; 랑 같음
		System.out.println(num2);
		
		int num3 = 2;
		int num4 = 4;
	
		num3 *= num4; // num3 = num3 * num4;
		System.out.println(num3);
		
		int num5 = 10;
		int num6 = 3;
		
		num5 %= num6; // num5 = num5(10) % num6(3)
		System.out.println(num5);
		System.out.println(~10);		
		
	}
}
