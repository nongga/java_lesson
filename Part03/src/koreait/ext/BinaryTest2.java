package koreait.ext;

import java.util.Scanner;

public class BinaryTest2 {

	public static void main(String[] args) {

		int n10 = 123;
		int n16 = 0xa41c;				//16진수 표기 0x로 시작합니다.
		int n2 = 0b1010010000011100;	//2진수 표기 0b로 시작합니다
		
		System.out.println("1. 변수를 그대로 출력");
		System.out.println("10진수 리터럴 123 : " +n10);
		System.out.println("16진수 리터럴 0xa41c : " +n16);	//	정수값 출력은 format 지정안하면 10진수출력
		System.out.println("2진수 리터럴 0b1010010000011100 : " +n2);
		
		
		System.out.println("2. foramt 지정하여 16진수 출력");
		System.out.println(String.format("16진수 리터럴 0xa41c : %x", n16));		//16진수 형식 %x
		System.out.println(String.format("2진수 리터럴 0b1010010000011100 : %x", n2));		//16진수 형식 %x
		System.out.println(String.format("10진수 리터럴 42012 : %x", 42012));		
		//결론 : 10진수 42012, n16과 n2변수값이 메모리에 저장될때는 모두 동일한 0,1표현값입니다.
		
		System.out.printf("%x\n", -1);
		System.out.println("2진수 : " + Integer.toBinaryString(-1) );
		
		System.out.println("3. 입력한 2진수 또는 16진수값을 10 진수로 바꾸어 드립니다.");
		Scanner sc= new Scanner(System.in);
		System.out.println("2진수 값 입력>>>");
		String t2 = sc.nextLine();
		System.out.println("16진수 값 입력>>> ");
		String t16 = sc.nextLine();
		
		System.out.println(String.format("2진수 %s 는 10진수 %d 입니다.",
				t2,Integer.parseInt(t2, 2)));	//t2는 2진수이다. -> 메소드 결과 정수값
		System.out.println(String.format("16진수 %s 는 10진수 %d 입니다.",
				t16,Integer.parseInt(t16, 16)));	//t16은 16진수이다. -> 메소드 결과 정수값
							//음수는 -기호써서 절대값 넘지 않는 범위에서 문자열 입력
		
	}

}
