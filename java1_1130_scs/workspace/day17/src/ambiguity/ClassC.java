package ambiguity;

public class ClassC implements Inter1, Inter2, Inter3{

	@Override
	public void printText() {
		// TODO Auto-generated method stub
		Inter1.super.printText();
	}

}
