package exam01;

import java.util.Scanner;

public class InputTask03 {
	public static void main(String[] args) {

//		Scanner 클래스 호출
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num1 = sc.nextInt();
		
		System.out.println(); // 줄바꿈
		
		System.out.print("실수 입력 >> ");
		double num2 = sc.nextDouble();
		
		System.out.println("입력받은 정수의 값 : " + num1);
		System.out.println("입력받은 실수의 값 : " + num2);
	}
}
