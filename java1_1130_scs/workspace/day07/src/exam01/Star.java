package exam01;

public class Star {
	public static void main(String[] args) {
		int num = 5;
		for(int s = 0; s < 5; s++) {
			for(int i = 0; i < num - s; i++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2*s)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int s = 5; s >= 0; s--) {
			for(int i = 0; i < num - s; i++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (2*s)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
