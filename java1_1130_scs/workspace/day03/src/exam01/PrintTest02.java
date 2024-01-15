package exam01;

public class PrintTest02 {
	public static void main(String[] args) {
		System.out.printf("내 수학 점수는 %10d점 입니다\n", 100);		// 10칸 오른쪽 정렬
		System.out.printf("내 평균 점수는 %10.2f점 입니다\n", 88.125);	// 10칸 오른쪽 정렬, 소수점 2자리까지 출력
		System.out.printf("나의 학점은 %c 입니다\n", 'A');
		System.out.printf("나의 이름은 %s 입니다\n", "송창석");
		System.out.println("------------------------------");
		System.out.printf("%10s%d\n", "안녕하세요", 500);
		System.out.printf("%-10s%d\n", "안녕하세요", 500);			// 10칸 왼쪽 정렬
		System.out.printf("%-10s%010d\n","안녕하세요귀뤼튀",500);	// 10칸 왼쪽 정렬, 10칸 오른쪽 정렬 & 빈자리 0
	}
}

