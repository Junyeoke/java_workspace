package ch03_1;

public class Wizard extends Hero{

	public Wizard (String name, int hp) {
		super(name, hp);
	}
	
	// 메서드 오버라이드
	@Override
	protected void attack() {
//		super.attack();
		System.out.println(super.name + "가 기본공격을 합니다.");
	}
	
	
	void freezing() {
		System.out.println("얼음공격을 합니다.");
	}
}
