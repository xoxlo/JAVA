package test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
//		점수가 100점 이하 80점 이상이면 A학점
//		80점 미만 60점 이상이면 B학점
//		나머지는 C학점
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		String grade;
		
		if(score >= 80 && score <= 100)
			grade = "A";
		else if( score >= 60 )
			grade = "B";
		else
			grade = "C";
		
		System.out.println("학점 : " + grade);
	}
}
