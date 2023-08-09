package ch05;

import starcraft.Marine;
import starcraft.Unit;
import starcraft.Zealot;
import starcraft.Zergling;

public class MainTest2 {

	public static void main(String[] args) {
		// Unit 이라는 배열에 저글링, 질럿, 마린을 담아보세요
		// 실행도 시켜봅시다.
		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Zergling zergling1 = new Zergling("저글링1");
		
		Unit zealot2 = new Zealot("질럿2");
		Unit zergling2 = new Zergling("저글링2");
		Unit marine2 = new Marine("마린2");
		
		Unit[] arrayUnits = new Unit[10];
		arrayUnits[0] = zealot1;
		arrayUnits[1] = marine1;
		arrayUnits[2] = zergling1;
		
		
		
		zealot2.attack(marine1);
		marine2.attack(zergling1);
		zergling2.attack(zealot1);
		

	} // end of main

} // end of class
