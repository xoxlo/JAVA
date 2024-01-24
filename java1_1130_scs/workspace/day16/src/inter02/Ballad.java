package inter02;

public class Ballad implements Music {

	@Override
	public void mode() {
		System.out.println("Ballad모드 실행 !");
	}
	
//	추가할 메소드
	void onlyBallad() {
		System.out.println("onlyBallad 실행 !");
	}
}
