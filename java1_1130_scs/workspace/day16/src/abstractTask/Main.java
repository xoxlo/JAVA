package abstractTask;

public class Main {
	public static void main(String[] args) {
		
//		추상클래스를 상속받은 자식 클래스 객체화
		IronMan im = new IronMan();
		Marvel im1 = new IronMan(); // up casting
		America ac = new America();
		Marvel ac1 = new America(); // up casting
		
		
//		추상메소드를 재정의한 power() 메소드 호출
		im.power();
		ac.power();
		im1.power();
		ac.power();
	}
}
