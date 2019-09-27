package mutationtesting;

public class Calculator {

	int valueDisplayed;

	public Calculator() {
		this.valueDisplayed = 0;
	}
	
	public Calculator(int initialValue) {
		this.valueDisplayed = initialValue;
	}

	public void add(int x) {
		this.valueDisplayed += x;
	}
	
	public void subtract(int x) {
		this.valueDisplayed -= x;
	}
	
	public void power(int x) {
		this.valueDisplayed = (int) Math.pow(this.valueDisplayed, x);
	}

	public int getResult() {
		return this.valueDisplayed;
	}
	
	public void set(int x) {
		this.valueDisplayed = x;
	}

	public boolean setConditional(int x, boolean yesOrNo) {
		if(yesOrNo) {
			set(x);
			return true;
		} else {
			return false;
		}
	}
}
