package exam01;

import java.util.Scanner;

public class Operator08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		<실습>
//		다음 중 음식이 아닌 것은 ?
//		1. 피자
//		2. 케이크
//		3. 불고기
//		4. JAVA
		
//		정답 입력 : 
//		정답일 경우 -> "정답"
//		오답일 경우 -> "오답"
		
//		변수
//		1) 정답을 저장하는 변수 1개
//		2) 입력하는 숫자 저장하는 변수 1개
//		삼항 연산자

		System.out.println("다음 중 음식이 아닌 것은?");
		System.out.println("1. 피자");
		System.out.println("2. 케이크");
		System.out.println("3. 불고기");
		System.out.println("4. JAVA");

//		정답을 저장하는 변수(상수)
		final int ANSWER = 4;
		
//		입력한 숫자 저장한 변수
		System.out.print("정답 입력 : ");
		int num = sc.nextInt();
		
//		삼항연산자( 조건 ? 참 : 거짓 )
		String result = ANSWER == num ? "정답" : num >= 1 && num<=4 ? "오답" : "1에서 4 사이 숫자를 입력하시오." ;
		System.out.println(result);
		
////		배열 이용
//		String[] food = {"피자", "케이크", "불고기", "JAVA", "김치", "치킨", "떡볶이", "포테이토칩"};
//		System.out.println("다음 중 음식이 아닌 것은?");
//		for (int i = 0 ; i<food.length; i++) {
//			System.out.printf("%d. %s\n",i+1, food[i]);
//		}
//		int answer = 4;
//		System.out.print("정답 입력 : ");
//		int num = sc.nextInt();
//		System.out.println(answer == num ? "정답" : "오답");
		
	}
}
