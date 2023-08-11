package ch13;

import java.util.List;

public class MainTest1 {

	public static void main(String[] args) {
		
		//List list;
		
		// 자바에서 상속은 단일 상속만을 지원합니다.
		// 단, Object 클래스를 제외하고
		
		Book book1 = new Book(1, "홍길동전", "허균");
		Book book2 = new Book(2, "홍길동전", "허균");
		Book book3 = new Book(3, "흐르는강물처럼", "파울로코엘료");
	
		if(book1 == book2) {
			System.out.println("물리적으로 같아요");
		} else {
			System.out.println("물리적으로 달라요");
		}
		System.out.println("---------------------------------");
		
		if(book1.equals(book2)) {
			System.out.println("같은책입니다.");
		} else {
			System.out.println("다른책입니다.");
		}
		

	}

}
