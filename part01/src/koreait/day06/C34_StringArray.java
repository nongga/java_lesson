package koreait.day06;

import java.util.Scanner;

public class C34_StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message = "hi java!"; //message는 참조형 변수
		
		String[] engKey = {"contunue","break","public","static","dynamic"};
		
		
		
		for(int i=0;i<engKey.length;i++)
			System.out.println(engKey[i]);	//engKey[i]는 String 참조형
		String[] koreans = new String[5];	//배열요소의 값이 기본형데이터 저장X, 참조값 저장
		
		for(int i=0;i<koreans.length;i++)
		System.out.println(koreans[i]);
		
		System.out.println("1. engKey 배열요소값이 참조하는 문자열의 길이");
		for(int i=0;i<engKey.length;i++)
		System.out.println(engKey[i]+":"+engKey[i].length());
		
		koreans[0]="계속하다.";
		koreans[1]="멈춘다.";
		koreans[2]="공용의.";
		
		System.out.println("2. koreans 배열요소값이 참조하는 문자열의 길이");
		for(int i=0;i<koreans.length;i++)
			if(koreans[i] !=null) //**
			System.out.println(koreans[i] + ":" + koreans[i].length());
		//참조하고있는 객체가 없을때 메소드/필드 참조하면 오류 : koreans[3],koreans[4]은 null 참조
		
		//String temp = null;
		//System.out.println(temp.length());;	//오류
		
		Scanner sc = new Scanner(System.in);
		System.out.print("static 뜻? >>>");
		koreans[3] =sc.nextLine();
		System.out.println("dynamic 뜻? >>>");
		koreans[4] = sc.nextLine();
		
		System.out.println("3. 모두 입력된 koreans 배열확인");
		for(int i=0;i<koreans.length;i++)
			System.out.println(koreans[i]);
			
		//사용자가 입력한 영어단어가 engKey 배열 인덱스 몇번인지?
		System.out.print("찾을 단어는>>>");
		String find = sc.nextLine();
		int index=-1;
	
		
		for(int i=0;i<engKey.length;i++) {
			if(find.equals(engKey[i])){
				index = i;
				break;
				
			}
			System.out.println("찾은 단어 위치 : " + index);
			if(index==-1)
			System.out.println("찾는 단어가 engKey 에 없습니다.!");
			else
				System.out.println("한글뜻 : " + koreans[index]);
		}
		
		
	

	}

}
