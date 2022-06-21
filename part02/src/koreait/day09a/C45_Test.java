package koreait.day09a;

import koreait.day09b.ClassAB;

public class C45_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassAA test1 = new ClassAA();
		test1.ab =123;		//test1이 참조하는 객체가 상속받은 필드
		test1.name="hong";	//상속받은 필드
		
		test1.print();

		ClassAB test2 = new ClassAB();
		test2.test();
		
	}

}
//new 연산으로객체가 만들어질때 실행되는 메소드-> 생성자
