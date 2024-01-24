package inter;

public interface Inter {

//	필드
	public static final int VAR1 = 10;
	int VAR2 = 20; // public static final 생략해도 자동으로 붙는다
	
//	메소드
	public abstract void method1();
	
	void method2(); // public abstract 생략해도 자동으로 붙는다
	
}
