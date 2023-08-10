package ch07;

// 추상 메서드를 상속받았다면
// 해결방법
// 1. 자식 클래스도 추상클래스로 만들어주면 된다.
// 2. 추상메서드를 구현메서드로 재정의 
public class Human extends Animal {

	@Override
	public void hunt() {
		System.out.println("돌도끼로 사냥을 합니다.");
		
	}
	
	
	
}
