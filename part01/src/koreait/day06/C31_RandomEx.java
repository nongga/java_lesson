package koreait.day06;

import java.util.Random;

public class C31_RandomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] koreans = new int[10];
		int[] counts = new int[5];
		Random r = new Random();
		
		for(int i=0;i<koreans.length;i++) {
			koreans[i] = r.nextInt(101);
			
			
		}//국어점수 저장
		//점수분포 count하기
		for(int i=0;i<koreans.length;i++) {
			
		}
		//점수 분포 결과 출력하기
		System.out.println("90~100\t 80~89\t 70~79\t 60~69\t 60미만");
		System.out.printf("%8s %8s %8s %8s %8s\n","90~100","80~89","70~79","60~69","60미만");
		System.out.println("----------------------------------------------------------");
		for(int i=0;i<counts.length;i++) {
			if(koreans[i]>=90) counts[0]++;
			else if(koreans[i]>= 80) counts[1]++;
			else if(koreans[i]>= 70) counts[2]++;
			else if(koreans[i]>= 60) counts[3]++;
			else counts[4]++;
			
			//counts배열값 출력
			System.out.printf("%8d ",counts[i]);
			
			System.out.println();
			for(int i=0;i<counts.length;i++) 
			//counts배열값으로 백분율 구하고 출력하기
		}

	}

}
