package ch03;

public class Hero {
	String name;
	int hp;
	
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	protected void attack() {
		System.out.println("이(가) 공격을 합니다.");
		
	}
	public static void main(String[] args) {
		Warrior war1 = new Warrior("전사", 100);
		war1.attack();
		war1.comboAttack();
		
		Archer arc1 = new Archer("궁수", 80);
		arc1.attack();
		arc1.fireArrow();
		
		Wizard wiz1 = new Wizard("마법사", 60);
		wiz1.attack();
		wiz1.freeZing();
	}
}
