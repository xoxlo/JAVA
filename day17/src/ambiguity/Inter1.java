package ambiguity;

interface Inter1 {
	
	default void printText() {
		System.out.println("Inter1 in printText()");
	}
}
