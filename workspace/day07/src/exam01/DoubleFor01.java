package exam01;

public class DoubleFor01 {
	public static void main(String[] args) {
		
//		이중 for문
//		for(int i = 0; i < 3; i++) {
//			for(int j = 0; j < 3; j++) {
//				System.out.println("i = " + i + " j = " + j);
//			} // 안쪽 for문
//		} // 바깥 for문
		
		
//		<실습1>
//		2~9단 구구단
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println(dan + "단");
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d \n", dan, i, dan*i);
			}
			System.out.println();
		}
		System.out.println("X  1  2  3  4  5  6  7  8  9");
		for(int i = 1; i <= 9; i++) {
			System.out.print(i + " ");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%2d" + " ", i*j);
			}
			System.out.println();
		}
	}
}
