package ch03;

public class Wizard extends Hero{

	public Wizard(String name, int hp) {
		super(name, hp);
	
	}
	
	@Override
	protected void attack() {
		System.out.println(super.name + "가 기본공격을 합니다.");
	}

	void freeZing() {
		System.out.println("마법사가 얼음공격을 합니다.");
	}
}
