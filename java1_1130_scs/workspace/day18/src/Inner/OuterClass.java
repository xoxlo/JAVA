package Inner;

public class OuterClass {
	
//	필드
	int instanceVar; // 인스턴스 변수
	static int staticVar; // 스태틱 변수
	
//	인스턴스 내부 클래스
	class InstanceInner{	// OuterClass 내부에서 정의한 인스턴스 내부 클래스
		
	}
	
	static class StaticInner {	// OuterClass 내부에서 정의한 스태틱 내부 클래스
		
	}
	
	void instanceMethod() {
		
//		지역 변수
		int localVar;	// 지역 변수
		class LocalInner {	// 인스턴스 내부에서 정의한 로컬 내부 클래스
			
		}
		
//		로컬 내부 클래스 객체화
		LocalInner li = new LocalInner();
		InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
	}
	
	
	
//	스태틱 메소드
	static void staticMethod() {

//		지역 변수
		int localVar = 0;
//		instanceVar = 20;
		staticVar = 20;		// 스태틱 메소드에서는 스태틱 멤버만 사용 가능

		class LocalInner {	// 메소드 내부에서 정의한 로컬 내부 클래스. 메소드가 종료되면 사라진다
			
		}
		
		LocalInner li = new LocalInner();
//		InstanceInner ii = new InstanceInner();
		StaticInner si = new StaticInner();
		
	}
}
