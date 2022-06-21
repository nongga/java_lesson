package koreait.day04;

import java.util.Scanner;

public class C18_ReviewEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String best;  //특기 과목명 참조할 변수
		
		int korean, english, science;
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println("성적 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 ->");
		korean = sc.nextInt();
		System.out.print("영어 ->");
		english = sc.nextInt();
		System.out.print("과학 ->");
		science = sc.nextInt();
		
		int total = (korean+english+science);
		double everage = ((korean+english+science)/3);
		//int subject = 
		
		//System.out.println(" ");
		System.out.println(">>처리되었습니다");
		System.out.println("총점 : " + (total));
		System.out.print("평균 : "+ ((korean+english+science)/3)+ " "+"("+everage+")");
		//System.out.print(" , 과목수 : " + subject );
		
		
		
		

	}

}
