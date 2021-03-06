package koreait.day15;

import java.io.File;		//io:input,output 입출력 관련된 기능들의 클래스
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class C66_FileReadTest {

	public static void main(String[] args) {

		String filename = "/Users/a/Desktop/iclass05/자바테스트.txt";
				
				File file = new File(filename);
				
				//Scanner : 입력기능을 갖는 클래스
				//Unhandled exception type FileNotFoundException : 오류의 가능성이 있으므로 try ~ catch 필요하다.
				Scanner sc = null;
				try {
					sc = new Scanner(file); //system.in : 표준 입력(콘솔 입력)
			/*
					System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
					System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
					System.out.println("파일에서 읽은 내용 : " + sc.nextLine());
					*/
					while(sc.hasNext()) {	//구분자 엔터를 기준으로 다음 데이터가 있으면 true
						System.out.println(sc.nextLine());
					}
					System.out.println("파일 읽기가 완료되었습니다.");
					
//					System.out.println("파일출력이 완료되었습니다.");	
				} catch (FileNotFoundException e) {
					//출력 기능에는 파일이 없으면 자동으로 파일이 만들어집니다.
					System.out.println("오류 발생 : " + e.getMessage());
					// TODO Auto-generated catch block
				}finally {
					if(sc!=null) sc.close();
				}

	}

}
//try~catch 자원해제 방법을 finally 안쓰고 java7 버전부터 다른 구문 형식이 가능합니다.