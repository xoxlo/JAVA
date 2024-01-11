package exam01;

public class ForTask01 {
	public static void main(String[] args) {
		
//		for문
//		1~10까지 출력
//		for(초기식; 조건식; 증감식)
//		1) 초기식 i = 0;
//		2) 조건식 i(0) < 10 판별
//		3) 조건식이 참이라면 for문 영역안에 문장 실행
//		4) 증감식 i++
//		5) 조건식 i(1) < 10 판별
		

//		for(int i = 0; i < 10; i++) {
//			System.out.println(i+1);
//		}
		
//		10 ~ 1 역순으로 출력
		
/*
		for(int i = 10 ; i>0 ; i--){
			System.out.println(i);
		}
		for(int i = 0; i < 10; i++) {
			System.out.println(10-i);
		}
*/
		
//		<실습>
//		이름 10번 출력
//		for문 출력
//		1번째 송창석
//		2번째 송창석
//		...
//		10번째 송창석
		
/*
		String name = "송창석";
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1 + "번째 " + name);
		}
		System.out.println();
*/

/*
		<실습2>
		1 ~ 10 숫자중 for문 사용
		짝수만 출력하기
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0)
				System.out.print(i+" ");
		}
		
		for(int i = 2; i < 11 ; i+=2) {
			System.out.print(i + " ");
		}
		
		for(int i = 1; i < 6; i++) {
			System.out.print(2 * i + " ");
		}
*/
		
//		<구구단 3단 만들기>
/*
		int dan = 3;
		for(int j = 1 ; j <= 9; j++) {
			System.out.println(dan + " x " + j + " = " + (dan*j));
			System.out.printf("%d x %d = %d\n", dan, j, dan*j);
		}
*/

//		<실습>
//		1 ~ 10까지의 숫자 더하기
//		변수명 total : 더한 숫자 저장 int
		
//		총합을 저장할 변수 선언
		int total = 0;
//		for문 : total에 1~10까지 숫자를 차례로 더하기
		for(int i = 1; i <= 10; i++) {
//			total에 i를 더해줘야함
			total += i; // total = total + i;
//			System.out.printf("+ %2d , total = %2d\n",i,total);
		}
//		반복문을 나오면 total 1 ~ 10까지 다 더해진 상태
		System.out.println("1 ~ 10까지의 합 : " + total);
		

	}
}
