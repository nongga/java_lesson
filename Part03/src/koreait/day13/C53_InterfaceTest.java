package koreait.day13;

public class C53_InterfaceTest {

	public static void main(String[] args) {
		
		MyClassX x1 = new MyClassX();
		MyClassY y1 = new MyClassY();
		MyClassZ z1 = new MyClassZ();
		
		InterfaceA x2 = new MyClassX();
		InterfaceB y2 = new MyClassY();
		InterfaceA z2 = new MyClassZ();
		InterfaceB z3 = new MyClassZ();
		
//참조타입에 따른 메소드 실행		: z1,z2,z3 이 어떤 메소드 실행 가능한지?
		z1.methodA();
		z1.methodB(23);
		z1.name("쯔위");
		
		z2.methodA();
		z2.methodB(23);
//		z2.name("쯔위");	//오류 : InterfaceB 의 추상메소드로 실행 못함.
		
//		z3.methodA();  //오류 : InterfaceA의 추상 메소드로 실행 못함.
//		z3.methodB(23);//오류 : InterfaceA의 추상 메소드로 실행 못함.
		z3.name("쯔위");
		
		
//캐스팅(변수 또는 값의 타입변환) : 다중 구현체의 인터페이스 타입 캐스팅
//			MyClassZ는 InterfaceA와 InterfaeB 타입으로 모두참
		InterfaceB ib = (InterfaceB)z2;
		ib.name("쯔위");
		InterfaceA ia = (InterfaceA)z3;
		ia.methodA();
		
		
//다형성 구현 예
		iAmethod(x2);
//		iAmethod(y2);	오루 : InterfaceA 구현체 아님
		iAmethod(z2);
		iAmethod(x1);
		iAmethod(z1);
		iAmethod(z2);
//		iAmethod(z3);	//오류 : 변수 참조타입이 InterfaceB
		
		iBmethod(y1);
		iBmethod(y2);
		iBmethod(z1);
//		iBmethod(z2);	//변수 참조타입이 InterfaceA이면 오류
		iBmethod(y1);
		iBmethod(z3);
		

	}
	//다형성 구현얘: 메소드 인자타입인 InterfaceA
	//		InterfaceA 구현체는 모두 인자로 전달가능.
	public static void iAmethod(InterfaceA ia) {
			ia.methodA();
	}
	
	public static void iBmethod(InterfaceB ib) {
		System.out.println(ib.name("momo"));
	
		
	}

}
