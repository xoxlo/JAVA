package marker;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();	
//		m.checkA(new Eagle());
//		m.checkA(new Tiger());
//		m.checkA(new Horse());
//		m.checkA(new Dolphin());
		
//		배열 만들기
//		자료형[] 배열명 = {값1, 값2, ...};
		Animal[] animals = {new Eagle(), new Tiger(), new Horse(), new Dolphin()};

		m.checkB(animals);
		
		
	}
//	Sky, Land 
	void checkB(Animal[] animals) {
		for(int i=0; i<animals.length; i++) {
			if(animals[i] instanceof Sky)
				System.out.println( animals[i] + " 날아 다닌다잉 ~");
			else if(animals[i] instanceof Land)
				System.out.println( animals[i] + " 뛰어 댕긴다잉 ~");
			else if(animals[i] instanceof Ocean)
				System.out.println( animals[i] + " 헤엄 친다잉 ~");
		}
	}
	
////	육식, 초식 구분 !
//	void checkA(Animal animal) {
//		if(animal instanceof Carnivore) {
//			System.out.println("육식동물 !");
//		}else if(animal instanceof Herbivore) {
//			System.out.println("초식동물 !");
//		}
//	}
}
