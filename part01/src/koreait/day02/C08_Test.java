package koreait.day02;

public class C08_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 23;
		int b = 19;
		
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("가로 : " + a +"cm");
		System.out.println("세로 : " + b +"cm");
		System.out.println("넓이를 구했습니다. ->" +a*b + "cm²" );
		
		double c = 23.230;
		double d = 3.14;
		
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.println("반지름 : " + c +"cm");
		System.out.println("둘레를 구했습니다. ->" + 2*c*d + "cm" );
		System.out.println("넓이를 구했습니다. ->" +c*c*d + "cm²" );

		
		double half = 23.23;
		double round = 2 * 3.14 * half; //둘레
		double circle_area = 3.14 * half * half; //넓이
		System.out.printf("반지름 : %.3f cm\n", half);
		System.out.printf("둘레를 구했습니다 : %.3f cm\n" , round);
		System.out.printf("넓이를 구했습니다 : %.3f cm²\n" , circle_area);
		
		//final 테스트
		//		변수선언앞에 final 키워드를 붙이면 값을 변경하지 못합니다.
		
		final int test = 123; //값을 변경 못하는 상수입니다.
		System.out.println("test = " + test);
		
		//test = 456;		//오류 : final로인식됨
	}

}
