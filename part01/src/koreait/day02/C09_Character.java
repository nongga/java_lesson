package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'a';
		char c2 = 97;		//문자코드는 정수값.
		
		//둘다 'a'출력
		System.out.printf("c1= %\n", c1);
		System.out.printf("c1= %\n", (int)c1);
		System.out.printf("c1= %\n", (int)c2);
		
		c1= (char)(c1 +1);	//덧셈 연산 가능. 연산결과 대입할때는 casting 필요.
		System.out.println("c1= " + c1);
		
		c1++;				//++ 연산은 c1=c1+1 , char형에서는 casting 도 합니다.
		System.out.println("c1 =" +c1);
		char h1='\uac00';
		char h2='\uac00';
		char h3='\uac00'; // \\u는 16진수 유니코드 ,ac00은 16진수 값
		
		char h1 = '가';
		char h2 = 44032;
		char h3 = '\uac00';
	
		System.out.println("h1 = " + h1);
		System.out.println("h2 = " + h2);
		System.out.println("h3 = " + h3);
		
		
		
		System.out.printf("h1= %d\n", (int)h1);
		System.out.printf("h1= %d\n", (int)h2);
		System.out.printf("h1= %d\n", (int)h3);
		
		h1++;
		System.out.println("h1 = " + h1);
		h1++;
		System.out.println("h1 = " + h1);
		

		System.out.println("h1=" +h1);
		System.out.println("h2=" +h2);
		System.out.println("h3=" +h3);
		//한글의 마지막 문
		char h4 = 55203;	//10진수표현
		char h5 = '\ud7a3'; //16진수 표현, 
		System.out.println("h4 = " + h4) ;
		System.out.println("h5 = " + h5) ;
		
		h4++;
		System.out.println("h4 = " + h4); // 해당되는 모양의 문자가 없음 ? 표시
		
		h5--;
		System.out.println("h5 = " + h5); //힢힣
		System.out.println('H'+'E'+'l'+'l'+'o'); //각 문자 코드값을 더한결과
		//hello 출력하려면 char의 배열로 처리해야 합니다.
				
	}

}

