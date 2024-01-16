package classPackage;

class Phone{
	
//	필드
	String brand;
	String series;
	String color;
	
//	생성자 단축키 : Alt + Shift + S , O
//	매개변수 3개 있는 생성자
	
	public Phone(String brand, String series, String color) {
		this(brand, series);	// this() 자기 생성자를 가져온다
		// this.brand = brand;
		// this.series = series;
		this.color = color; // 매개변수 3개 있는 생성자에 추가된 내용
	}
	
//	매개변수 2개 있는 생성자
	public Phone(String brand, String series) {
		this.brand = brand;
		this.series = series;
	}


	void printPhone() {
		System.out.println("브랜드명 : " + brand);
		System.out.println("시리즈명 : " + series);
		System.out.println("색상 : " + color);
	}
	
}
public class ClassTest03 {
	public static void main(String[] args) {
		Phone p1 = new Phone("Apple", "iPhone 20 Pro", "White");
		Phone p2 = new Phone("Samsung", "Galaxy S30 Ultra");
		Phone p3 = new Phone("LG", "Vega Racer S200", "Brown");
		p2.color = "Blue";

		p1.printPhone();
		System.out.println();
		p2.printPhone();
		System.out.println();
		p3.printPhone();
	}
}
