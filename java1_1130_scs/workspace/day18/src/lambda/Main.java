package lambda;

public class Main {
	public static void main(String[] args) {
		
//		함수형 인터페이스 객체 선언 람다식을 이용해 함수 구현 (매개변수 2개)
//		(매개변수, ...) -> {};
		AddNum a = (num1, num2) -> {return num1 + num2;};
//		AddNum a = num1, num2 -> {return num1 + num2;};	// 매개변수가 2개일 경우 소괄호 생략 불가
		
//		람다식을 이용해 함수 인터페이스 구현 (매개변수 1개)
		AddTen t = num1 -> {return num1 + 10;};	// 매개변수가 1개일 경우 소괄호 생략 가능
		
//		람다식을 이용해 함수 인터페이스 구현 (매개변수 1개)
		Print p = name -> System.out.println(name);
		
		int num1 = 10;
		int num2 = 20;
		String name = "송창석";
		
		int result1 = t.addTen(num1);
		int result2 = a.add(num1, num2);
		int result3 = t.addTen(num1) + a.add(num1, num2);
		
		System.out.println(a.add(num1, num2));
		System.out.println(t.addTen(num1));
		p.printName(name);
	}
}
