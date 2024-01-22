package access01;

public class A {

//	필드
	public int publicVar;
	int defaultVar; // default는 명시하지 않는다
	protected int protectedVar;
	private int privateVar;
	
	
//	getter, setter : Shift + Alt + S , R
	public int getPrivateVar() {
		return privateVar;
	}
	public void setPrivateVar(int privateVar) {
		this.privateVar = privateVar;
	}
	

	
	
}
