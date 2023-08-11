package ch12;

// 인터페이스를 사용하는 방법
public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect {

	@Override
	public void turnOn() {
		System.out.println("냉장고의 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("냉장고의 전원을 끕니다.");
		
	}

	@Override
	public void notification() {
		System.out.println("띠리리링~");
		
	}


}
