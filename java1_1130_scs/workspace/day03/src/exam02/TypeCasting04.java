package exam02;

public class TypeCasting04 {
	public static void main(String[] args) {
		
//		<실습>
//		이름을 저장하는 변수(name) : 성함
//		나이를 저장하는 변수(int age) : 나이
//		제 이름은 "송창석"이고 나이는 '24살'입니다
		
		String name = "송창석";
		int age = 24;
		System.out.print("제 이름은 \"송창석\"이고 나이는 '24살'입니다\n");					// print 기본 출력문
		System.out.printf("제 이름은 \"%s\"이고 나이는 '%d살'입니다\n", name, age);		// printf 형식지정자 사용 가능
		System.out.println("제 이름은 \"" + name + "\"이고 나이는 '" + age + "살'입니다"); // println 줄바꿈 있음
	}
}
