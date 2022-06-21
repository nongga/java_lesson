package koreait.day05;

import java.util.Scanner;

public class C25_WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while문 형식
		//loop counter 변수 선언&초기값
		int j = 0;
		while(j<5) {//조건식
			System.out.println("hello!(" +(j+1)+")");
			j++;	//증감식
		}
		
		int k=0,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("입력한 정수를 모두 더하는 계산기 입니다.(종료:-1)");
		while(k!=-1) {	//k가 -1이 아닌동안 반복실
			System.out.print("정수입력 >>>");
			k=sc.nextInt();
			sum +=k; //sum=sum+k;
		}
		
		System.out.println("sum =" + sum);
		sum=0;
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다[ver2](종료:-1)");
		
		do {
			sum+=k;
			System.out.print("정수입력>>>");
			k = sc.nextInt();
			
		}while(k!=-1);
		System.out.println("sum =" +sum);
		
		sum=0;
		
		System.out.println("\n\n입력한 정수를 모두 더하는 계산기 입니다[ver3](종료:-1)");
		
		while(true) {
			
			if(k==-1) break;		//항상 참일때, 탈출(종료) 조건과 break 문 사용합니다.
		}
		
		
		sc.close();

	}

}
