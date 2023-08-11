package ch12;

public class MainTest {

	public static void main(String[] args) {
		
		// 결론
		// 코드를 좀 더 유연하고 확장성 있게 설계할 때
		// 표준, 규약, 규칙을 지켜서 설계하고 싶다면
		// 인터페이스를 활용하자.
		
		HomeAppliances appliances1 = new Television(); // 업케스팅
		HomeAppliances appliances2 = new Refrigerator();
		// HomeAppliances appliances3 = new ToyRobot(); // ToyRobot은 상속받지 않아서 불가
		
		RemoteController controller1 = new Television();
		RemoteController controller2 = new Refrigerator();
		RemoteController controller3 = new ToyRobot();
		
		RemoteController[] remoteControllers = new RemoteController[3];
		
		remoteControllers[0] = new Television();
		remoteControllers[1] = new Refrigerator();
		remoteControllers[2] = new ToyRobot();
		
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOn();
		}
		System.out.println("---------------------------------------");
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOff();
		}
		
		
		
		
		
		
	} // end of main

} // end of class
