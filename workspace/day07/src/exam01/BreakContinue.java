package exam01;

public class BreakContinue {
	public static void main(String[] args) {
		
//		1 ~ 10중에서 5까지만 출력하고 반복문 종료하기
		
		for(int i = 1; i < 11; i++) {
			if(i == 5){
				System.out.println("종료");
				break;
			}
			System.out.println(i + " 출력");
		}	
//			1 ~ 10중에 5만 제외하고 출력하기(continue)
		for(int i = 1; i < 11; i++) {
			if( i == 5) {
				continue;
			} // 조건문 영역
			System.out.println(i + " 출력");
		} // for문 영역
	}
}
