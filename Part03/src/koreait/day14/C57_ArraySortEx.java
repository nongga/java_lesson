package koreait.day14;

public class C57_ArraySortEx {

	//배열에 저장된 값을 직접 정렬 구현해보기.
	public static void main(String[] args) {
		
		int[] nums = {34,77,19,56,45,9}; 
		
		for(int i=0;i<nums.length-2;i++) {
			for(int k=i+1;k<nums.length;k++) {
				if(nums[i]>nums[k]) {
					int temp = nums[i];
					nums[i] = nums[k];
					nums[k] = temp;
				}
				
			}
		}
			for(int i=0; i<nums.length; i++) {
				System.out.printf("%5d",nums[i]);
			
		}
		
	}

}
