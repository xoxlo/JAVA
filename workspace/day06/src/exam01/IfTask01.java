package exam01;

import java.util.Scanner;

public class IfTask01 {
	public static void main(String[] args) {
//		제어문(if문)
//		나이(정수)를 입력받아서
//		조건1) 나이가 >= 20 "20살 이상입니다"
//		조건2) 나이가 < 20 & 나이 >= 17 "고등학생입니다"
//		조건3) 나이가 >= 14 -> "중학생입니다"
//		조건4) 14미만이면 "어린이입니다"
		
//		Scanner 클래스 호출
		Scanner sc = new Scanner(System.in);
		
//		나이를 입력 출력 메소드
		System.out.print("나이를 입력해 주세요 : ");
		
//		입력받은 정수 myAge에 대입
		int myAge = sc.nextInt();
		
//		조건문(if문)을 활용해서 20살 이상인지 확인
		if(myAge >= 20) {
			System.out.println("20살 이상입니다.");
		}else if(myAge >= 17) {
			System.out.println("고등학생입니다");
 		}else if(myAge >= 14) {			// else if는 여러개 작성 가능
			System.out.println("중학생입니다");
		}else {
			System.out.println("어린이입니다");
		}
		System.out.println("프로그램을 종료합니다");
		
		
		
	}
}
