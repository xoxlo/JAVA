package adapter;

public class BasicFan extends FanAdapter {

	@Override
	public void on() {
		System.out.println("버튼으로 전원을 킵니다");
	}

	@Override
	public void off() {
		System.out.println("버튼으로 전원을 끕니다");
	}
	
}
