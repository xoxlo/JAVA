package inter02;

public class Rock implements Music {

	@Override
	public void mode() {
		System.out.println("Rock모드 실행 !");
	}
	
//	구현 클래스에서 추가할 메소드 
	void onlyRock() {
		System.out.println("onlyRock 실행 !");
	}
}
