package koreait.day05;

import java.util.Arrays;

public class C27_IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열선언
		int[] arr1 = {67,45,98,12,45,66,95};	//초기값 설정
		int[] arr2 = new int[7];				//배열의 크기만 설정. 기본초기값 있나요? 답:0
		
		System.out.println("\n배열이름(참조형변수)으로 출력");
		System.out.println(arr1);
		System.out.println(arr1.hashCode());
		
		//배열 요소값 1개 출력
		System.out.println("\n배열 요소값 1개 출력(인덱스 3번)");
		System.out.println("arr1[3] = ?" + arr1[3]);	//12
		System.out.println("arr2[3] = ?" + arr2[3]);	//0
		
		System.out.println("\n배열 요소값 1개 저장(인덱스3번)");
		arr1[3] = 999;
		arr2[3] = 999;
		
		//선언된 배열의 값을 모두 출력할수있는 문자열로 변환시키는 메소드
		String temp = Arrays.toString(arr1);	//toString	은 static 메소드, 메소드의 리턴형식
		System.out.println();
		System.out.println("arr1:" +temp);
		System.out.println("arr2:"+Arrays.toString(arr2));
		
		//출력예시 : arr1[0] = 67 형식으로 모든 값을 출력하고싶다. -> for 문
		for(int i=0;i<7;i++)
			System.out.println("arr1["+i+"] = " + arr1[i]);
		
		System.out.println("\nfor문으로 배열요소값 출력(arr2)");
		
		for(int i=0;i<arr2.length;i++)	{	//***배열은 배열요소의 갯수(크기)를 갖고있는 필드 length 가 있습니다.
			String t = String.format("arr2[%d] = %d/n",i,arr2[i]);	//format을 적용해서 문자열을 생
			System.out.println(t);
			
			//System.out.printf("arr2[%d] = %d\n",i,arr2[i]);
	}
			
	
		

	}


}
