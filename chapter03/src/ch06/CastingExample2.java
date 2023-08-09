package ch06;

public class CastingExample2 {

	public static void main(String[] args) {

		// 배열을 활용
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Brid();
		animals[2] = new Animal();
		// 0 -- Animal
		// 1 -- Brid -> if -> true
		// 2 -- Animal -> if -> false

		System.out.println("==========================");

		// 초기화 for문
		// 처음부터 끝까지 반복해야할때
		for (Animal a : animals) {
			a.makeSound();
			// a.fly(); << 호출못함 : 데이터 타입 확인하고 싶다면 instanceof 연산자 사용
			if (a instanceof Brid) {
				Brid targetBird = (Brid)a;
				targetBird.fly();
			}
			System.out.println("-----------------------");

		}

		// index for문
		// 인덱스 연산이 가능
//		for (int i = 0; i < animals.length; i++) {
//			
//		}
//		

	} // end of main

} // end of class
