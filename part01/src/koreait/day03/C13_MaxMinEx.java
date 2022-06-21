package koreait.day03;

import java.util.Scanner;

public class C13_MaxMinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n1;
		int n2;
		int n3;
		int max;
		int min;
		
		System.out.println("n1 = ");
		n1 = sc.nextInt();
		System.out.println("n2 = ");
		n2 = sc.nextInt();
		System.out.println("n3 = ");
		n3 = sc.nextInt();
		
		System.out.printf("n1=%d\t n2=%d\t n3=%d\n" , n1 ,n2 ,n3); //입력한 값 확인시켜주기
		
		//n1,n2,n3 중에최대값 구하기
		if(n1>n2) {
			max = n1;
			min = n2;
		}
		else {
			max= n2;
			min= n1;
		}
		if(max<n3) max = n3; //임시 max 값보다 남은 1개 n3 이 더 클때
		if(min>n3) min =n3; //임시 min값보다 	남은 1개 n3 이 더 작을	
		System.out.println("max =" + max);
		System.out.println("min =" + min);
		
		
		
		
	}
		
	
}
