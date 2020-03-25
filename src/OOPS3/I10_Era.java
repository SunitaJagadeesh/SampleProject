package OOPS3;

public abstract class I10_Era implements I10 {   //need to mention abstract since we are using an abstract method i.e " public abstract void airbags "

	public void body() {
		System.out.println("body-from interface class ");	
	}

	public void engine() {
		System.out.println("engine-from interface class ");	
	}

	public void seats() {
		System.out.println("seats-from interface class ");
	}

	public void gears() {
		System.out.println("gears-from interface class");
	}

	public void breaks() {
		System.out.println("breaks-from interface class ");
	}

	public void audio() {
		System.out.println("audio-from interface class ");
	}
	
	public abstract void airbags();// need to mention abstract since we just defined but not implemented i.e we just defined but not declared method
	
	// public void seatcovers();     since its an abstract method
	
}
