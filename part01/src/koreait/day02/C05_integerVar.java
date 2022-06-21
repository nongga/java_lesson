package koreait.day02;

//변수: variable
public class C05_integerVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1. main 메소드 안에서만 사용하는 지역변수를 선언합니다.
	       * 2. 기본형 (primitive) 데이터 타입 : 정수형식
	        *       byte, short, int, long 키워드(역할이 정해진 단어)
	       */
		byte n1;
		short n2;
		int n3;
		long n4;
		
		byte m1=100;
		short m2=100;
		int m3=100;
		long m4=100;
		
	int currentNO;
		//System.out.println(n1);  //오류:값이없는 변수. 초기값이 없습니다.
		System.out.println(m1);
		
		//값의 대입(=)
		n1=123;
		n1=99;
		n1=999; //오류 +127보다 큰
		n2=29999;
		n2=-40000;//오류 -32768 보다 작은값
		n3=123456789;
		n3=1234567890123; //오류 2147483674보다 큰
		n4=1234567890123; //오류 1234567890123 리터럴은 int 리터럴이므로 표현오류
		n4=123;			  //오류아님 123 리터럴은 int리터럴 표현범위
		n4=123456789012L; //long 리터럴 표시는 : L 또는 l 을 마지막에 씁니다
		
		System.out.println("변수 n1 = " + n1);
		System.out.println("변수 n2 = " + n2);
		System.out.printf("변수 %s = %d \n" , "n3", n3);
		System.out.printf("변수 %s = %d \n" , "n4", n4);
		
		n4 = 1234567890123L;
	} //main 메소드 끝 
	

}
/*변수 : 메모리에 저장된 값 중에서 변경할 수 있는 데이터를 말합니다.
 *    변수는 프로그램이 실행되는 동안에 임시로 사용하는 메모리 공간입니다.
 *       데이터가 저장된 메모리에 접근하기 위해서 변수명(식별자)을 부여합니다.
 *    변수 선언한다 -> 변수명과 데이터 형식을 지정하는 것.-> 메모리에 공간 할당 됩니다.
 */