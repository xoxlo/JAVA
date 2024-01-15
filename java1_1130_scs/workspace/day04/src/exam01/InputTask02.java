package exam01;

import java.util.Scanner;

public class InputTask02 {
	public static void main(String[] args) {
//		Scanner 클래스 호츌
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 >> ");
//		System.out.println(sc.next());
//		System.out.println(sc.next());
//		System.out.println(sc.next());
		
//		nextLine();
		String name = sc.nextLine();
		System.out.println(name);
	}
}
