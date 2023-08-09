package ch03;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
		
	}
	
	@Override
	protected void attack() {
		System.out.println(super.name + "가 기본공격을 합니다.");
	}

	void fireArrow() {
		System.out.println("궁수가 불화살 공격을 합니다.");
	}
}
