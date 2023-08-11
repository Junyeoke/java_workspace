package ch98;

public class Buyer {
	int money = 10_000_000;
	int bounsPoint = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족해 물건을 구매할 수 없습니다.");
			return;
		}

		money -= p.price;
		bounsPoint += p.bonusPoint;
		System.out.println(p + "을/를 구매하였습니다.");
	}
}
