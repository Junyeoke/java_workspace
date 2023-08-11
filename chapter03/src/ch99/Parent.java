package ch99;

public class Parent {
	void parentMethod() {}
}

class Child extends Parent{
	
	void parentMethod() { // 오버라이딩
		// .....
	} 
	void parentMenthod(int i) {} // 오버로딩
	
	void childMethod() {} 
	void childMethod(int i) {} // 오버로딩
	//void childMethod() {} // 에러, 중복정의 됨
 	
}
