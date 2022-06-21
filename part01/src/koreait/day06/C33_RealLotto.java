package koreait.day06;

import java.util.Arrays;
import java.util.Random;

public class C33_RealLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[45];
		Random r = new Random();
		int[] lotto = new int[6];
		//처음상태 : 값을 인덱스+1 -> 인덱스 난수를 뽑고 해당 값을 삭제하면 이 규칙은 적용이 안됩니다.
		for(int i=0;i<45;i++) {	//인덱스의 범위: 0~44 -> 난수로 뽑히는 값
			numbers[i]=i+1;	//값의 범위 :1~45 ->lotto배열에 저장되는 
		}
		
		System.out.println("numbers 배열 초기값----------------------");
		System.out.println(Arrays.toString(numbers));	//로또번호가 될수있는 번호 나
		System.out.println("--------------------------------------");
	
		int k;	//뽑힐값의 인덱스 - 난수로 정합니다
		for(int cnt=0;cnt<6;cnt++) {	//로또번호 6개를 구하기위한 for문
			
			k=r.nextInt(45-cnt);
			//cnt=0,1,2,3,4,5에 대해 난수의 bound값은 45,44,43,42,41,40 -> 중복방지(확률적인 범위를 줄이기)
			System.out.println("k="+k+",number = "+numbers[k]);	//뽑힌 숫자의 인덱스와 그 숫자의 값
			
			lotto[cnt]=numbers[k];	//numbers배열에서 난수로 뽑힌 인덱스 k의 값이 저장.
			
			//k위치의 값을 제거(삭제) : 인덱스k+1부터 마지막 요소까지 왼쪽으로 이
			
			for(int i=k;i<numbers.length-1;i++) { 	//선택된 로또 번호를 제외 -> 중복 방지
				numbers[i]=numbers[i+1];
				
			}
			System.out.println(Arrays.toString(numbers));//선택된 로또 번호 외 남은 숫자 출력
		}
		System.out.print("최종선택 숫자 : ");
		System.out.println(Arrays.toString(lotto));
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));

	}

}
