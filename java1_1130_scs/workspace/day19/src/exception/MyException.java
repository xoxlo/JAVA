package exception;

// 사용자 정의 예외
// 음수 들어오면 예외 발생
public class MyException extends Exception {
	
	public MyException() {
		super("음수 입력 다매요");
	}
}
