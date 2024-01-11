package exam01;

import java.util.Scanner;

public class WhileTask01 {
	public static void main(String[] args) {
		
//		while문
//		안녕하세요 10번 출력
//		while(조건식){}
		
//		횟수를 count해줄 변수 선언
//		int cnt = 1;
//		while(cnt++ <= 10) {
//			System.out.println("안녕하세요");
//		}

//		무한반복문
/*
		while(true) {
			System.out.println("무한반복");
			break; // 반복문 안에서 break는 반복문 탈출
		}
*/
		
//		while문 무한반복
//		1 ~ 10 숫자를 입력
//		입력한 숫자가 1 ~ 10 -> 숫자 출력
//		아니라면 다시 숫자를 입력
		
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
//			System.out.print("1 ~ 10사이의 숫자 입력 : ");
//			int num = sc.nextInt();
//			
////			조건문
//			if(num >= 1 && num <= 10) {
//				System.out.println("입력한 숫자는 " + num + "입니다.");
//				break;
//			}else {
//				System.out.println("1 ~ 10사이의 숫자를 입력해 주세요.");
//			}
//		}
		
//		<실습>
//		무한반복문
//		정수 1개 입력 받아와서 입력받은 값이 1이면 "반복문 탈출" 출력 -> 반복 탈출
//		1이 아니면 숫자 다시 입력
		while(true) {
			System.out.print("숫자를 입력(1 : 종료) : ");
			int num = sc.nextInt();
			
			if(num != 1){
				System.out.println("입력한 숫자는 " + num + "입니다.");
			}else {
				System.out.println("반목문 탈출");
				break;
			}
		}
	}
}
