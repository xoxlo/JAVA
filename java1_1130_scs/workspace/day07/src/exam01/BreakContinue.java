package exam01;

public class BreakContinue {
	public static void main(String[] args) {
	
/*
//		1 ~ 10중에서 5까지만 출력하고 반복문 종료하기
		
		for(int i = 1; i < 11; i++) {
			if(i == 5){
				System.out.println("종료");
				break;
			}
			System.out.println(i + " 출력");
		}	
*/
		
/*
//			1 ~ 10중에 5만 제외하고 출력하기(continue)
		
		for(int i = 1; i < 11; i++) {
			if( i == 5) {
				continue;
			} // 조건문 영역
			System.out.println(i + " 출력");
		} // for문 영역
*/

/*
		for(int i = 1; i < 100; i++) {
			if(i % 3 == 0) {
				System.out.println("짝");
				continue;
			}
			System.out.println(i + " ");
		}
*/
		
//		<실습>
//		1 ~ 20중에 짝수를 제외하고 출력(for, continue)
		for(int i = 1; i <= 20; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i + "-> 홀수");
		}
		
		
	}
}
