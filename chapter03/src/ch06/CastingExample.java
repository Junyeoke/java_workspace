package ch06;

public class CastingExample {

	public static void main(String[] args) {
		
		// 다형성 개념과 업캐스팅(Upcasting)
		// 업캐스팅 : 하위 클래스의 객체를 상위 클래스 타입으로 변환하는 것
		// 이 경우에는 데이터 손실이 없습니다.
		// 업캐스팅은 자동적으로 이루어지므로 별도의 형변환 연산자가 필요없습니다.
		Animal animal = new Brid();
		// animal.fly(); << 상위클래스에서 하위클래스 속성인 fly를 불러오지 못함
		
		// 다운 캐스팅이란
		// 업캐스팅된 객체를 다시 원래의 하위 클래스의 타입으로 변환하는 것을 말한다.
		// 다운캐스팅은 수동적으로 형변환 연산자를 사용하여 이루어집니다.
		// 다운캐스팅이 왜 필요한가? : 업캐스팅된 객체를 하위 클래스의 메서드나 속성을 사용하기 위해 필요하다.
		Brid bird = (Brid)animal;
		bird.fly();
		
		
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
			if(a instanceof Brid) {
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
