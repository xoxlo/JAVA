package set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
//		HashSet
		HashSet<String> animalSet = new HashSet<String>();
		
		animalSet.add("코알라");
		animalSet.add("돼지");
		animalSet.add("소");
		animalSet.add("호랑이");
		animalSet.add("사자");
		animalSet.add("기린");
//		set은 중복값을 허용하지 않음
		animalSet.add("기린");
		animalSet.add("기린");
		animalSet.add("기린");
		animalSet.add("기린");
		animalSet.add("기린");
		
		System.out.println(animalSet);
//		System.out.println(animalSet.get(0));
		
		Iterator<String> animalIter = animalSet.iterator();
		System.out.println(animalIter.hasNext());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		System.out.println(animalIter.next());
		System.out.println(animalIter.hasNext());
		System.out.println(animalIter.next());
	}
}
