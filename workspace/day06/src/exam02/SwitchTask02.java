package exam02;

import java.util.Scanner;

public class SwitchTask02 {
	public static void main(String[] args) {
		
//		음식 메뉴 출력 프로그램
//		사용자로부터 1~3까지의 숫자를 입력받고
//		1 : 햄버거
//		2 : 피자
//		3 : 치킨
//		그외 : 1~3사이의 숫자를 입력해주세요
//		"000을 주문하셨습니다" 출력
		
		Scanner sc = new Scanner(System.in);
		String[] foodName = {"햄버거", "피자", "치킨", "떡볶이", "오뎅", "김치찌개", "닭볶음탕"};
		for (int i = 0; i<foodName.length; i++) {
			System.out.println(i+1 + " : " + foodName[i]);
		}
//		System.out.println("1 : 햄버거");
//		System.out.println("2 : 피자");
//		System.out.println("3 : 치킨");
		System.out.print("숫자를 입력해주세요 : ");
		int num = sc.nextInt();
//		String menu; // 전역변수
		for (int j = 0; j<foodName.length; j++) {
			if(num-1 == j) {
				System.out.println(foodName[j] + "를(을) 주문하셨습니다");
			}
		}
//		switch(num) {
//		case 1:
//			menu = "햄버거"; // 지역변수
//			System.out.println(menu + "를 주문하셨습니다");
//			break;
//		case 2:
//			menu = "피자";
//			System.out.println(menu + "를 주문하셨습니다");
//			break;
//		case 3:
//			menu = "치킨";
//			System.out.println(menu + "를 주문하셨습니다");
//			break;
//		default:
//			System.out.println("1~3사이의 숫자를 입력해주세요");
//		}
	}
}
