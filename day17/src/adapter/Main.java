package adapter;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
//		m.method(new BasicFan());
//		m.method(new BasicFan2());
		m.method(new SmartFan());
	}
	
//	메소드
	void method(Fan fan) {
		fan.on();
		fan.off();
		fan.turbo();
	}
}
