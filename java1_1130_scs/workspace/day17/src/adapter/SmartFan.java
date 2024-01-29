package adapter;

public class SmartFan extends FanAdapter{
	@Override
	public void on() {
		System.out.println("음성인식으로 전원을 킵니다");
	}

	@Override
	public void off() {
		System.out.println("음성인식으로 전원을 끕니다");
	}
	
	@Override
	public void turbo() {
		System.out.println("터보 작동");
	}
}