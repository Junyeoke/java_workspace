package ch01;

public class Hero {

	String name;
	int hp;
	int mp;
	int height;
	int age;

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		w1.age = 100;
		w1.power = 500;
		System.out.println(w1.age);
		System.out.println(w1.power);
	}

}

class Warrior extends Hero {

	int power;
	
	

}
