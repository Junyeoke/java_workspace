package ch12;

public interface RemoteController {
	
	// 인터페이스란
	// 구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도
	// 즉, 추상 메서드나 static 상수만을 기본적으로 가진다.
	
//	public abstract void turnOn();
//	public abstract void turnOff();
	
	// public abstract는 생략이 가능하다. - 컴파일러가 넣어줌
	void turnOn();
	void turnOff();
	
	
}
