package ch03_1;

public class Archer extends Hero {

	public Archer (String name, int hp) {
		super(name, hp);
	}
	
	// 메서드 오버라이드
	@Override
	protected void attack() {
//		super.attack();
		System.out.println(super.name + "가 기본 공격을 합니다.");
	}

	void fireArrow() {
		System.out.println("불화살 공격을 합니다.");
	}
}
