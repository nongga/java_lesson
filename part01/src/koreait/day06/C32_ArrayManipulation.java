package koreait.day06;

public class C32_ArrayManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열요소의 삽임/삭제
		int[] test = {11,22,33,44,55,66,77};
		
		for(int i=0;i<test.length;i++)
			System.out.print(test[i]+"\t");
		System.out.println();
		
		//인덱스 2에 삽입할때 - 오른쪽 인덱스 증가 방향으로 이동
		//for(int i=test.length-2;i>=10;i++)
		for(int i=test.length-2;i>=2;i--) {
			test[i+1]=test[i];
		}
		
		test[2]=23;
		for(int i=0;i<test.length;i++)
			System.out.print(test[i]+"\t");
		//데이터 삭제
		int[] test2 = {11,22,33,44,55,66,77};
		System.out.println("\n------------------------------------");
		for(int i=0;i<test2.length;i++)
			System.out.print(test2[i]+"\t");
		
		//인덱스 2를 삭제할때 - 왼쪽 인덱스 감소방향으로 이동
		for(int i=3; i<test2.length;i++)
			test[i-1]=test[i];
			
			for(int i=0;i<test2.length-1;i++)
					System.out.println();
	}

}
