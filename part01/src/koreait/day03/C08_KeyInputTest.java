package koreait.day03;

import java.util.Scanner;

public class C08_KeyInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int width;
		int height;
		int box_area;
		double half,round,circle_area;
		final double PI = 3.14;
		
		System.out.println("사각형 도형의 넓이 구하기");
		System.out.println("사각형 너비 입력 ");
		width = sc.nextInt();
		System.out.println("사각형 높이 입");
		height = sc.nextInt();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("가로 : " + width +"cm");
		System.out.println("세로 : " + height +"cm");
		System.out.println("넓이를 구했습니다. ->" + box_area + "cm²" );
	
		
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.println("반지름 : " + round +"cm");
		System.out.println("둘레를 구했습니다. ->" + 2*round*PI + "cm" );
		System.out.println("넓이를 구했습니다. ->" +round*round*PI + "cm²" );

		
		
		
		//final 테스트
		//		변수선언앞에 final 키워드를 붙이면 값을 변경하지 못합니다.
		
		final int test = 123; //값을 변경 못하는 상수입니다.
		System.out.println("test = " + test);
		
		//test = 456;		//오류 : final로인식됨
	}

}
