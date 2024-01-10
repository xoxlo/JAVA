package exam01;

import java.util.Scanner;

public class IfTask04 {
	public static void main(String[] args) {
		
//		<실습2>
//		성적 부여 프로그램
//		사용자 점수(정수)를 입력받고
//		90이상 -> 당신의 학점 : A
//		80이상 90미만 -> B
//		70이상 80미만 -> C
//		60이상 70미만 -> D
//		60미만 -> F
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		
//		점수 저장하는 변수
		int score = sc.nextInt();
		
//		학점을 저장하는 변수(선언만)
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		}else if(score >= 80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else if(score >= 60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.printf("당신의 학점 : %c", grade);
		
//		if(score >= 90) {
//			System.out.println("당신의 학점 : A");
//		}else if(score >= 80) {
//			System.out.println("당신의 학점 : B");
//		}else if(score >= 70) {
//			System.out.println("당신의 학점 : C");
//		}else if(score >= 60) {
//			System.out.println("당신의 학점 : D");
//		}else {
//			System.out.println("당신의 학점 : F");
//		}
		
	}
}
