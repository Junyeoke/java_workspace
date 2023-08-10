package ch07_1;

public class DeskTop extends Computer {

	
	// 추상메서드 -> 구현메서드로 오버라이드
	@Override
	public void display() {
		System.out.println("모니터로 화면을 보여줍니다.");
		
	}

	@Override
	public void typing() {
		System.out.println("키보드로 타이핑을 합니다.");
		
	}
	
}
