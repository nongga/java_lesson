package koreait.day06;

import java.util.Random;

public class C30_RandomTest {
	public static void main(String[] args) {
		
		Random r = new Random(); //Random 클래스의 객체 생성(new연산)
		
		System.out.println("1. 정수형 랜덤값 10개 출력");
		for(int i=0;i<10;i++) {
			
			int inum =r.nextInt();	//int범위내에서 랜덤값(난수) 만듭니다.
			System.out.println(inum);
		}
		System.out.println("1.정수형 랜덤값 10개");
		for(int i=0;i<10;i++) {
			int inum = r.nextInt(100);	//0<=난수<100 범위의 랜덤값 만듭니다.	
			System.out.println(inum);
		}//경계값은 양수값만 사용합니다.
		//1<= 난수 < 101 범위의 랜덤값 만들어야 한다면?
		
		System.out.println("3. 특정 범위의 랜덤값 10갸 출력 - bound를 이용한 수식");
		for(int i=0;i<10;i++) {
			int inum = r.nextInt(100)+1;	//0<=난수<100 범위의 랜덤값 만듭니다.	
			System.out.println(inum);
	}
		//n	보다 크거나 같고 m 보다 작은 범위 난수 : r.nextIng(m-1)+n
		
		System.out.println("4. 2~46범위의 값으로 난수 10개");
		for(int i=0;i<10;i++) {
			int inum =r.nextInt(45)+2;
			System.out.println(inum);
		}
	}

}
