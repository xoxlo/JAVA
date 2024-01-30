package wrapper;

import java.util.Arrays;

public class WrapperTest02 {
	public static void main(String[] args) {
		
//		하나의 배열에 1, 3.14, 'A', "Dog", true
		
//		배열 선언
		Object[] arObj = {1, 3.14, 'A', "Dog", true};	// auto boxing
		
		System.out.println(Arrays.toString(arObj));
	}
}