package exam01;

public class Operator06 {
	public static void main(String[] args) {
		
//		비트 연산자
		System.out.println(10 & 11);
		System.out.println(10 | 11);
		System.out.println(10 ^ 11);
		System.out.println(10);
		System.out.println(~10); // -10-1 -> 10의 not ? 1010 -> 0101(-11) (부호비트 0 -> 1)
								 // 컴퓨터의 음수표현 ! 2의 보수 이용
								 // 1011(11)을 2의 보수 취해주면 0101(-11), 여기서 1010의 ~과 같음 그래서 ~10 -> -11
		
//		쉬프트 연산자
		System.out.println(10 >> 1);
		System.out.println(10 << 2);
		
	}
}
