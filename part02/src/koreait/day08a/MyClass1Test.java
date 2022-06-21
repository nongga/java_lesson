package koreait.day08a;

import koreait.day08.MyClass1;
import koreait.day08.Score;

public class MyClass1Test {

	public static void main(String[] args) {
		//MyClass1 객체생성
		MyClass1 my= new MyClass1();	//public 클래스이지만 import필요
		
		//패키지가 다른 MyClass1클래스의 필드중 사용할수 있는것은? : point
		//					default(package) 한정자 필드 name, 메소드geaAe,setAge 사용못함.
		//Score 클래스필드,메소드의 한정자가 모두 default 입니다.
		//		ㄴnew 객체생성은 될까요? 답 : class는 Public 한정자이므로 생성 됩니다.
		Score score = new Score();
		//my.name="momo";
		my.point =1.234;
		//my.age=23;		//오류:private 한정자 필드
		//my.setAge(23);	
		//System.out.println("age = " + my.age); //오류 : private한정자 필드
		//System.out.println("age = " + my.getAge()); 	
		//my.setAge(-100);
		//System.out.println("age = " + my.getAge()); 	
		System.out.println("point = " + my.point); 		
		//System.out.println("name = " + my.name);		
		
	}
	//접근 한정자 테스트는 자바에서 제공되는 클래스들을 이해하고 우리가 만들 클래스에도 사용.
}
