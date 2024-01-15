package exam01;

public class Array02 {
	public static void main(String[] args) {
		
//		<2차원 배열>
//		2차원 배열 선언
		int[][] arr1 = new int[2][3]; // 2행 열의 배열 생성
		
		int[][] arr2 = {{1, 2, 3},
						{4, 5, 6}};
		
		int[] arr3 = arr2[0];
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
//		2차원 배열 요소 접근 : 배열명[행][열]
		System.out.println("arr2의 1행 3열의 값 : " + arr2[0][2]);
		
//		2차원 배열 요소 전체 확인 : 이중 for문
		
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println(); // 줄바꿔라이~
		}
	}
}
