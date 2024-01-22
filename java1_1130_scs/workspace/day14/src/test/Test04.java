package test;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
//		자료형[] 배열명 = new 자료형[칸];
//		자료형[] 배열명 = {값1, 값2, 값3, ...}
//		자료형[] 배열명 = null;
		
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("배열 안에 있는 " + arr.length + "개의 총합 : " + sum);
		
		
//		System.out.print("몇개를 넣을지 숫자 입력 : ");
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = sc.nextInt();
//			sum += arr[i];
//		}
	}
}
