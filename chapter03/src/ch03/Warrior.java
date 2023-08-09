package ch03;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);

	}

	@Override
	protected void attack() {

		System.out.println(super.name + "가 기본공격을 합니다.");
	}

	void comboAttack() {
		System.out.println("전사가 2단 공격을 합니다.");
	}
}
