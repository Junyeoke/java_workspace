package ch03_1;

public class MainTest1 {

	public static void main(String[] args) {
		
		Warrior warrior1 = new Warrior("전사1", 100); // 워리어는 히어로에 상속
		// 오버라이딩 메서드
		// 1. 자기 자신의 메서드를 확인 (자식클래스 warrior를 말함)
		// 2. attack() 이란 메서드를 자식클래스에서 재정의 하지 않았다면, 부모 클래스를 확인한다.
		warrior1.attack();
		
	} // end of main

} // end of class
