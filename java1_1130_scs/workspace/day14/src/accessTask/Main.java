package accessTask;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		private 멤버 접근 실습
//		학생의 이름, 나이 입력 받고
//		입력받은 이름, 나이를 setter로 값을 전달
//		전달할 이름, 나이 출력 getter
		
		Student st1 = new Student();
		
		Scanner sc = new Scanner(System.in);
		
//		Scanner를 이용해서 이름과 나이 입력
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
//		setter 메소드를 이용해 이름과 나이 저장
		st1.setName(name);
		st1.setAge(age);
		
		System.out.println();
		
//		getter 메소드를 이용해 이름과 나이 출력
		System.out.println("학생 이름 : " + st1.getName());
		System.out.println("학생 나이 : " + st1.getAge());
		
	}
}
