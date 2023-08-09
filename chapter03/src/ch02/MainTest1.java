package ch02;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 접근제어 지시자 default : 같은 패키지 내에서 접근 가능
		Cal2 cal2 = new Cal2();
		cal2.sum(10, 20); // sum메서드는 부모
		cal2.minus(20, 10); // minus메서드는 this 자신에 있는 메서드
		
		// Cal 이란 부모 객체는 생성이 된 걸까?
		// 부모 클래스가 메모리에 먼저 생성이 되고
		// 자식 클래스가 메모리에 올라오게 된다.
		
		// muitply 메서드 재정의(오버라이드)
		cal2.mutiply(10, 0);
		
		// 메서드 오버로딩은 sysout 이다. 
		System.out.println("안녕");
		System.out.println('A');
		System.out.println(100);
		System.out.println(0.5);
		System.out.println(true);
		
		

	} // end of main

} // end of class
