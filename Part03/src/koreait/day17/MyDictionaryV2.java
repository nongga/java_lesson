package koreait.day17;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
//사승철
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import koreait.day16.Word;

public class MyDictionaryV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();
		try {
			System.out.println("파일에서 읽어올까요? (y or n)>>>");
			if(ssc.nextLine().equals("y"))
			read(mywords,"/Users/a/Desktop/iclass05/단어저장.txt");
			else
				System.out.println("파일을 새로 만듭니다.");

		} catch (FileNotFoundException e1) {
			System.out.println("파일 읽는중에 오류 발생" +e1.getMessage());
			
		
		} //파일에서 기존 내용읽어오고 그 내용을 mywords리스트에 저장
		
		String sel, eng, kor;
		int level;
		System.out.println("선택기능 👉 ,1. 단어저장 , 2.단어검색 , 3.단어장보기 ,4.레벨로 검색, 5.프로그램 끝내기");
		boolean run =true;
		while(run) {
		System.out.println("선택 ✏️ ->");
		sel =sc.nextLine();
		switch(sel) {
		case "1":
			System.out.print("English -> ");
			eng = sc.nextLine(); //sc.nextInt();
			System.out.print("한글 뜻 -> ");
			kor = sc.nextLine();
			System.out.println("레벨 -> ");
			level = Integer.parseInt(sc.nextLine());
			//Word temp = new Word(eng,kor);
			//temp.setLevel(level);
			//mywords.add(temp);
			mywords.add(new Word(eng,kor,level)); 	//저장
			break;
		case"2":
			System.out.println("검색단어 English->");
			eng = sc.nextLine();
			for(Word w : mywords)
				if(w.getEnglish().contentEquals(eng))
					System.out.println("단어장 검색했습니다. 결과 =>" + w);
			break;
		case"3":
//			System.out.println("단어장 전체보기 : " + mywords);
			all(mywords);		//정렬하고 출력
			break;
			
		case"4":
			System.out.println("검색할 레벨 입력(1~3) ->");
			int no = Integer.parseInt(sc.nextLine());
			level(mywords, no);
			
			break;
				
			
		case"5":
			run=false;
			break;
			default:
				System.out.println("잘못입력된 선택입니다. 1~4입력입니다.");
				break;
		}
		}		
		try {
			Scanner ssc1 = new Scanner(System.in);
			System.out.println("파일에 저장할까요?(y or n)>>>");
			if(ssc.nextLine().equals("y"))
				
			save(mywords,"/Users/a/Desktop/iclass05/단어저장.txt");
			else
				System.out.println("파일이 저장되지 않았습니다.");
		} catch (FileNotFoundException e) {
			System.out.println("파일저장중에 오류가 생겼습니다." + e.getMessage());
		} //mywords리스트의 내용을 파일에 저장하기
		System.out.println("::::단어장 종료합니다::::");
	}
	private static void save(List<Word> mywords, String filename) throws FileNotFoundException {
		File file = new File(filename);
		PrintWriter pw = new PrintWriter(file);
		for(Word w : mywords)
			pw.println(w);
		
		pw.close();
		System.out.println("파일저장이 완료되었습니다.");
		
	}
	
	private static void read(List<Word> mywords, String filename) throws FileNotFoundException {
				File file = new File(filename);
				Scanner sc = new Scanner(file);
				StringTokenizer stk=null;
				while(sc.hasNext()) {
					String temp = sc.nextLine();
					System.out.println(temp.substring(0,temp.indexOf("(")));	//객체만들때 필요한 값만 가져오기 테스트
					//위의 결과를 참고로 StringTokenizer로 Word객체 만들고 mywords 리스트에 추가하기
					stk = new StringTokenizer(temp.substring(0,temp.indexOf("(")));
					while(stk.hasMoreTokens()) {
						mywords.add(new Word(stk.nextToken(),	//english 필드값
											stk.nextToken(),	//korean 필드값
											Integer.parseInt(stk.nextToken())));	//level 필드
					}
					
				}
				sc.close();
				System.out.println("파일 읽어오기 완료되었습니다.");
		// TODO Auto-generated method stub
		
	}



	private static void level(List<Word> mywords, int no) {
		for(Word w : mywords)
			if(w.getLevel()==no)
				System.out.println(w);
	}
		//참고: 정수 데이터 입력을 받아야 한다면 문자열 nextLine() 받아서 정수로 변환합니다. 
	//int score = Integer.parseInt(sc.nextLine())
	//이유: nextInt()는 엔터 처리 하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
	//결론 : 한 소스 파일에서 nextInt()만 사용 또는 nextLine()만 사용하거나 합니다.
		


	private static void all(List<Word> mywords) { //mywords 의 참조값 전달받아 동일한 객체를 가리킵니다.
			mywords.sort(new Comparator<Word>() {
				@Override
				public int compare(Word o1, Word o2) {
					return o1.getEnglish().compareTo(o2.getEnglish());
				}
			});
			
			System.out.println(String.format("%-20s %-20s\t %10s", "English","Korean","Level"));
			System.out.println("-------------------------------------------------------------");
			for(Word w : mywords) {
				System.out.println(String.format("%-20s %-20s\t %10d", w.getEnglish(),w.getKorean(),w.getLevel()));
			}
	}

}
//6/23 평가 프로그래밍 언어 응용
//1.OX : 틀린설명찾아 바르게 고쳐서 설명하기	배열,클래스,상속,추상클래스,인터페이스
//		23개의 설명이 있습니다 그중에서 틀린것 10개 찾아서 바르게 고쳐쓰기
//2.자바관련 주제 조사 설명하기(서술)	추상화,캡슐화,상속,다형성
//3.코딩문제		Word, MyDictionary와 유사한 구조의 문제	실행화면만 보고 코딩하기
//
