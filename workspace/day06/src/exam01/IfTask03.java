package exam01;

import java.util.Scanner;

public class IfTask03 {
	public static void main(String[] args) {
	
//		<실습>
//		1. 홀수 짝수 판별
//		사용자로부터 하나의 정수를 입력받아,
//		입력받은 정수가 홀수인지 짝수인지 판별
//		짝수라면 "짝수" 출력
//		홀수라면 "홀수" 출력
		
//		Scanner 클래스 호출
//		홀수, 짝수 -> %연산자 이용 짝수 % 2 == 0, 홀수 % 2 == 1
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 해주세요 : ");
		int num = sc.nextInt();
		
//		삼항연산자
//		System.out.println(num % 2 == 0 ? "짝수" : "홀수")
		
//		if문 (짝수인지 판별)
		if(num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}
