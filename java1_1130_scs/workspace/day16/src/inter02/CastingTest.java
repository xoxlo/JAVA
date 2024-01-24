package inter02;

public class CastingTest {
	
	public static void main(String[] args) {
		
		Music music1 = new HipHop();	// 업캐스팅
		Music music2 = new Ballad();	// 업캐스팅
		Music music3 = new Rock();		// 업캐스팅
		
		check(music1);
		check(music2);
		check(new Rock());		// Music music = new Rock();
		
	}
	
	static void check(Music music) {
		if(music instanceof Ballad) {
			((Ballad)music).onlyBallad(); 	// 다운캐스팅
		}else if(music instanceof HipHop) {
			((HipHop)music).onlyHipHop();	// 다운캐스팅
		}else if(music instanceof Rock) {
			((Rock)music).onlyRock();		// 다운캐스팅
		}
	}
	
}
