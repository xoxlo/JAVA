package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest01 {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
//		리스트 요소 추가
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);	// 리스트는 중복값을 허용, 순서를 보장
		al.add(20);
		
		System.out.println(al);
		
//		배열에서 배열 요소 접근
//		배열명[인덱스번호]
		
//		System.out.println(al[0]);
		System.out.println(al.get(0));	// 리스트 요소에 접근 get(인덱스번호)
		
		ArrayList li = new ArrayList();
		li.add(1);
		li.add(0.1);
		li.add('a');
		li.add("java");
		
		System.out.println(li);
		
//		System.out.println(li.get(0)+10);
		Integer num1 = (Integer)li.get(0) + 1;	// 값으로 활용하기 위해서는 강제 형변환을 해야하는
												// 불편함이 있다
		
//		int[] arr1 = {1, 2, 3};
////		배열의 요소는 값처럼 사용 가능
//		System.out.println(arr1[0] + 10);
		
//		<E> <Element> : 제네릭(Generic)
		ArrayList<Integer> li2 = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++)
			li2.add(i);
		
		System.out.println(li2);
		System.out.println(li2.get(0) + 10);	// 제네릭을 설정하면 리스트 요소 값처럼 사용 가능
		
//		리스트 길이 확인
		System.out.println(li2.size());
		
//		리스트안에 리스트
		ArrayList<List> li3 = new ArrayList<List>();
//		li3.add(li3);
		li3.add(li2);
		System.out.println(li3);
	}
}
