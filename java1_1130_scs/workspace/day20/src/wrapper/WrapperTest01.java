package wrapper;

public class WrapperTest01 {
	public static void main(String[] args) {
		
//		boxing : 기본 타입의 값을 wrapper 클래스의 객체로 변환
		
		Integer num1 = new Integer(3);	// 3을 Integer클래스의 객체로 변환
		Integer num2 = Integer.valueOf(3);
		
		System.out.println(num1);
		
		Double num3 = new Double(1.5);	// 1.5를 Double클래스의 객체로 변환
		Double num4 = Double.valueOf(1.5);
		
//		unboxing = wrapper 클래스 객체에서 기본 타입의 값으로 변환
		int num5 = num1.intValue();	// num1을 기본타입으로 변환
		System.out.println(num5);
		
		double num6 = num4.doubleValue();
		System.out.println(num6);
		
//		auto boxing, auto unboxing
		Integer numInt1 = 5;
		System.out.println(numInt1);
		
		int num7 = numInt1;
		System.out.println(num7);
	}
}
