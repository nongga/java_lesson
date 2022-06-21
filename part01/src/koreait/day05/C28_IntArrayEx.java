package koreait.day05;

import java.util.Arrays;
import java.util.Scanner;
//사승철
public class C28_IntArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum =0;
		double avg;
		int number;
		int[] nums = new int[5];		//step 1
		
		for(int i = 0; i<nums.length;i++) {
			System.out.println("요소의 값을 입력하세요. >>");
			number = sc.nextInt();
			nums[i] = number;
			sum += nums[i];
		}
		
		avg = (double)sum / nums.length;
		System.out.println(Arrays.toString(nums));
		System.out.println("입력한 요소의 합 : " + sum);
		System.out.println("입력한 요소의 평균 : " + avg);
		System.out.println();
		
		System.out.println("최종 max : "+maxOfArray(nums));
		System.out.println("최종 min : "+minOfArray(nums));
		
		int max = maxOfArray(nums);
		System.out.println("배열 nums 최대값max = " + max);

	}
	
	public static int maxOfArray(int[] array) {
		
		int max=array[0];	//1.
		for(int i=1; i<array.length;i++) {
			if(max<array[i])	//비교값이 max보다 크다
				max = array[i];
		}
		return max;
	}
	public static int minOfArray(int[] array) {
		
		int min=array[0];
		for(int i=1;i>array.length;i--) {
			if(min>array[i])
				min = array[i];
		}
		return min;
			
	}
	

}
