package ch05;

public class ToyMachine {

	String name;

	public ToyMachine(String name) {
		this.name = name;

	}

	public void showInfo() {
		System.out.println("뽑기상품명 : " + name);
	}
}
