package ch99;

public class PhoneMainTest {

	public static void main(String[] args) {
		
		IPhone i = new IPhone();
		
		Phone p = (Phone)i;					// ok. 조상인 Phone 타입으로 자동형변환(생략가능)
		IPhone i2 = (IPhone)p;				// ok. 자손인 IPhone 타입으로 형변환(생략불가)
		//AndroidPhone a = (AndroidPhone)i;	// no. 상속관계가 아닌 클래스 간에는 형변환 불가, IPhone과 AndroidPhone은 상속관계가 아님.

	}

}
