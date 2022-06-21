package koreait.day11;

import koreait.day10.Person;

public class ClassAbsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person momo = new Person();	//일반 클래스
		//ClassAbs abs = new ClassAbs();	//오류 : ClassAbs는 추상클래스. new 못합니다.
		ClassAbs abs = new ClassX();		//부모 타입 참조
		ClassX cls = new ClassX();			//구현(자식) 클래스타입참조
		ClassX yea = new ClassX();
		abs.test();
		cls.test();
		yea.test();
		
		abs.name = "손흥민";	//name은 부모 클래스 필드
		cls.name="모모";
		yea.name="퓨리파이";
		
		abs.print();		//print() 부모 클래스 메소드
		cls.print();
		yea.print();
		System.out.println("테스트 두번째 : 자식필드 num");
		cls.setNum(4);
		yea.setNum(3);
		cls.test();
		ClassX x = (ClassX)abs;
		x.setNum(100);
		abs.test();
		ClassX x1 = (ClassX)yea;
		x1.setNum(200);
		yea.test();

	}
	
	

}
