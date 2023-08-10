package ch09;

public class StringTest1 {

	public static void main(String[] args) {
		
		// String
		// 문자열이라는 데이터를 보관이나 연산할때 사용
		// static 영역, 데이터 영역, --> 상수 풀 영역
		
		String str1 = "반가워";
		String str2 = new String("반가워");
		String str3 = "반가워";
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		// 시나리오 1
		if(str1 == str2) { // str1은 상수풀 영역에, str2는 힙메모리 영역에 있어 주소값이 다름
			System.out.println("주소가 같아요");
		} else {
			System.out.println("주소값이 달라요");
		}
		
		// 시나리오 2
		// 리터럴 방식으로 생성한 문자열은 이미 생성한 값이 똑같다면 새로 만들지 않고 재활용한다.
		if(str1 == str3) {
			System.out.println("주소 같음");
		} else {
			System.out.println("주소 다름");
		}
		System.out.println("=============================");
		// 시나리오 3
		str3 = "반갑습니다"; // 값을 변경
		if(str1 == str3) {		//str3의 값을 변경하여 상수 풀 메모리에 새로 생성됨
			System.out.println("주소 같음");
		} else {
			System.out.println("주소 다름");
		}
		System.out.println("=============================");
		// 시나리오 4
		// 문자열에 값을 비교하려면 equals를 반드시 사용
		if(str1.equals(str2)) {	// str1과 str2의 주소값을 비교하는 것이 아닌 문자열을 비교하므로 값은 "반가워"로 같으므로 같은 값입니다가 출력
			System.out.println("같은 값입니다.");
		} else {
			System.out.println("다른 값입니다.");
		}
		
		
		
		
		
	}

}
