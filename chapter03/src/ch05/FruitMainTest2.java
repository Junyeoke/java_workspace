package ch05;

public class FruitMainTest2 {

	public static void main(String[] args) {

		Fruit[] fruits = new Fruit[5];
		fruits[0] = new Peach("복숭아1", 3_000);
		fruits[1] = new Banana("델몬트바나나", 2_000);
		fruits[2] = new Peach("복숭아2", 3_000);

		// 배열은 보통 반복문과 많이 사용
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] != null) {
				fruits[i].showInfo();
				// 만약 바나나라면 원산지 정보도 함께 출력하고 싶다면?
				if(fruits[i] instanceof Banana) {
					String checkOrigin = ((Banana)(fruits[i])).origin;
					System.out.println("원산지 : " + checkOrigin);
				}
			}

		}

	} // end of main

} // end of class
