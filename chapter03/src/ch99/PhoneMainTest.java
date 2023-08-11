package ch99;

public class PhoneMainTest {

	public static void main(String[] args) {
		
		IPhone i = new IPhone();
		
//		Phone p = (Phone)i;					// ok. 조상인 Phone 타입으로 자동형변환(생략가능)
//		IPhone i2 = (IPhone)p;				// ok. 자손인 IPhone 타입으로 형변환(생략불가)
		//AndroidPhone a = (AndroidPhone)i;	// no. 상속관계가 아닌 클래스 간에는 형변환 불가, IPhone과 AndroidPhone은 상속관계가 아님.
		
		
		Phone p = (Phone)i;  // i의 값(객체의 주소)을 p에 저장
							// 타입을 일치시키기 위해 형변환 필요(생략가능함)
		i = (IPhone)p; // 조상타입을 자손타입으로 형변환하는 경우 생략불가함
		
	

	}

}
