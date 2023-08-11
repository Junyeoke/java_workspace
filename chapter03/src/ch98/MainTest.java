package ch98;

public class MainTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv1());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "원 입니다.");
		System.out.println("현재 보너스 점수는 " + b.bounsPoint + "점 입니다.");

	}

}
