package casting01;

public class Tv {

//	필드
	int vol; 	// 볼륨
	int ch;		// 채널
	boolean power;	// 전원

//	메소드
	void chUp() {
		System.out.println("채널 올립니다");
	}
	void chDown() {
		System.out.println("채널 내립니다");
	}
	
	void volUp() {
		System.out.println("볼륨 올립니다");
	}
	void volDown() {
		System.out.println("볼륨 내립니다");
	}
	
	void powerOnOff() {
		System.out.println("전원을 켜고 끕니다");
	}
}
