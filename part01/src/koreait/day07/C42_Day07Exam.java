package koreait.day07;

import java.util.Random;
import java.util.Scanner;
//사승철
public class C42_Day07Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//koreait.sec2020@gmail.com 월요일까지
		
	
		
		
		int answer;
		
		int[] num = new int[5];
		int[] num1 = new int[5];
		Random r = new Random();
		
		System.out.println("--------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("--------------------");
		System.out.println("시작합니다.");
		for(int i=0;i<5;i++) {
			int inum = r.nextInt(100);
			int inum1 = r.nextInt(100);
		num[i] = inum;
		num1[i] = inum1;
		
		Scanner sc = new Scanner(System.in);
		
		
			System.out.print("문제 "+ num[i] + "+ "+num1[i] + " =" + " 답 입력 ->" );
			answer = sc.nextInt();
		}
		

	}

}
