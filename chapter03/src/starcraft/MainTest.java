package starcraft;

import java.util.Scanner;

public class MainTest {
	
	
	public static void main(String[] args) {
		Unit[] arraryUnit = new Unit[100];
		Scanner sc = new Scanner(System.in);

		final String END = "0";
		final String NEWUNIT = "1";
		final String ATTACK = "2";
		final int MARINE = 3;
		final int ZEALOT = 4;
		final int ZERGLING = 5;
		boolean flag = true;

	
		System.out.println("기능을 선택하세요!");
		System.out.println("1. 새로운 유닛 생성		2. 유닛을 공격하기		0. 종료");
		while (flag) {
			
			String selectNumber = sc.nextLine();
			if (selectNumber.equals(END)) {
				flag = false;
	
			} else if (selectNumber.equals(NEWUNIT)) {
			newUnit(sc);
			
			} else if (selectNumber.equals(ATTACK)) {
				System.out.println("유닛 공격");
			}
		} // end of while
		System.out.println("게임이 종료되었습니다.");

	} // end of main

	// 유닛 생성
	public static void newUnit(Scanner sc) {
		System.out.println("유닛 생성");
		System.out.println("1. 마린 2. 질럿 3. 저글링");
		int selectNewUnitNum = sc.nextInt();
		if(selectNewUnitNum == 1) {
			System.out.println("마린생성");
			Marine marine = new Marine("마린");
			
		} else if(selectNewUnitNum == 2) {
			System.out.println("질럿생성");
			Zealot zealot = new Zealot("질럿");
		} else if(selectNewUnitNum == 3) {
			System.out.println("저글링생성");
			Zergling zergling = new Zergling("저글링");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
	}

} // end of class
