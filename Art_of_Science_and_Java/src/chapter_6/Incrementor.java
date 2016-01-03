package chapter_6;

public class Incrementor {
	public Incrementor(int startValue) {
		counter = startValue;
	}
	
	/* Create Incrementor  */
	public Incrementor() {
		counter = 1;
	}
	
	public int nextValue() {
		int temp = counter;
		counter++;
		return (temp);
	}
	
	private int counter;
}
