package ch05;

public class FruitMainTest {

	public static void main(String[] args) {
	
		// 다형성 적용
		// 업캐스팅 - 부모 데이터 타입의 형변환
		Fruit fruit1 = new Banana("델몬트바나나", 2_000);
		Fruit fruit2 = new Peach("청도복숭아", 3_000);
		
		fruit1.showInfo();
		fruit2.showInfo();
		// 바나나 객체에 origin 변수값을 출력
		// 업캐스팅된 상태에서는 컴파일 시점만 확인을 한다.
		
		// System.out.println(fruit1.origin); >> 오류확인
		// 컴파일 시점에 어떻게 origin 이라는 변수를 출력할까?
		// 1단계 - 다운 캐스팅
		Banana banana1 = ((Banana)(fruit1));
		System.out.println(banana1.origin);
		// 2단계 - 다운 캐스팅
		String checkOrigin = ((Banana)(fruit1)).origin;
		

	} // end of main

} // end of class
