package exception;

import java.util.Scanner;

public class ExceptionTest02 {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc.next();
			// try 블록에서 오류가 발생하면
			// 발생한 오류 객체를 받을 수 있는 참조변수를 가진 catch문 영역이 실행된다
		}catch(NullPointerException e) {
			System.out.println("null이에요");
			System.out.println(e);
//			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println(e.getMessage());
		}catch(Exception e) {
			// 우리가 try에서 어떤 오류가 발생할지 전부 예상하기는 힘들다
			// 예상치 못한 오류가 발생할 수도 있다
			// 예상치 못한 오류를 잡기 위해 Exception 타입의 참조변수를 사용한다
			// 모든 예외의 조상은 Exception 클래스이다
			// 즉, 어떤 예외가 발생하더라도 Exception 타입의 참조변수에 저장가능하다(업캐스팅)
			System.out.println("예상치 못한 오류");
		}
	}
}
