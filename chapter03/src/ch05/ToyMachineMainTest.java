package ch05;

import java.util.Random;

public class ToyMachineMainTest {

	public static void main(String[] args) {

		Random random = new Random();
		int selected = random.nextInt(3);
		ToyMachine[] toys = new ToyMachine[3];
		toys[0] = new ToyBear("곰인형");
		toys[1] = new ToyPhone("장난감 폰");
		toys[2] = new ToyCar("장난감 자동차");
		if(toys[selected] instanceof ToyCar) {
			String checkReal = ((ToyCar)(toys[selected])).realCar;
			System.out.println("이벤트 당첨 여부 : " + checkReal);
		}
		toys[selected].showInfo();
		
	
	

	}

}
