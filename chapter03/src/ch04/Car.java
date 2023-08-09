package ch04;

// 자동차와 엔진에 관계에 있어서
// 절대 상속을 사용하지 말자. (문법적인 의미가 맞다고 해도.)
// 차와 엔진의 관계는 포함관계로 설계해주어야 한다.

public class Car {

	private String name;
	private int price;
	private Engine engine; // 포함관계

	public Car(String name, int price, Engine engine) {
		this.name = name;
		this.price = price;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public Engine getEngine() {
		return engine;
	}

}
