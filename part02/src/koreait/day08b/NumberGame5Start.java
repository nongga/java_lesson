package koreait.day08b;

import java.util.Random;
import java.util.Scanner;

public class NumberGame5Start {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int max = 10;
		int[] triallst = new int[max];
		GameValue[] history = new GameValue[10];
		int k=0;
		
		System.out.println("숫자맞추기 게임 시작합니다.");
		System.out.println("게임을 시작하려면 너 휴먼의 이름을 쓰시오 >>> ");
		String gamer = sc.nextLine();
		int rmin = 11, rmax = 29;
		
		do {
			
			GameValue temp = new GameValue(gamer);
		}
	}

}
