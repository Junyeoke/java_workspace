package ch10;

public interface RemoteController {

	// 인터페이스란?
	// 구현된 것이 아무것도 없는 밑그림만 있는 기본 설계도이다.
	
	// 특징
	// 멤버변수, 일반 구현메서드를 가질 수 없다.
	// 오직 추상메서드와 상수만을 멤버로 가질 수 있다.
	// 인터페이스는 표준, 약속(강제성있는 규칙), 규약을 의미한다.
	// 추상클래스보다 추상화가 더 높다. - 기능적인 측면으로 많이 활용한다.
	
	public static final int SERIAL_NUMBER = 100; // 상수만을 가질 수 있다.
//	public int number;  >> 멤버변수 사용불가
	
	public abstract void trunOn(); // 추상메서드만 가질 수 있다.
//	public void trunOff() {}; >> 인스턴스 메서드를 가질 수 없다.
	
	// 인터페이스 안에 선언하는 기능은 전부 public abstract 이다.
	// public abstract 생략가능하다.
	void turnOff();
	
} // end of interface
