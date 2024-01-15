package exam01;

import java.util.Scanner;

public class InputTask04 {
	public static void main(String[] args) {
		
//		실습
//		이름(String), 나이(int)를 입력 받아서 출력

//		이름 : (이름입력)
//		나이 : (나이입력)
		
//		000님 안녕하세요
//		000님의 나이는 00살입니다.
//		000님 안녕히가세요
		
//		Scanner 클래스 호출
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine().replaceAll(" ", "");
		
		System.out.println();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
//		출력
		System.out.println(name + "님 안녕하세요");
		System.out.println(name + "님의 나이는 " + age + "살 입니다");
		System.out.println(name + "님 안녕히가세요");
		
		System.out.println();
		
//		출력
		System.out.printf("%s님 안녕하세요\n", name);
		System.out.printf("%s님의 나이는 %d살입니다\n", name, age);
		System.out.printf("%s님 안녕히가세요", name);
		
	}
}
