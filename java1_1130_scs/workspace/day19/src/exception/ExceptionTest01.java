package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		try{
			sc.nextInt();	// 에외가 발생할 수 있는 문장;
		}catch(InputMismatchException e) {
			System.out.println("숫자를 입력해주세요");
		}
	}
}