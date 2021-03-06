package koreait.day16;
import java.util.ArrayList;
import java.util.Comparator;
//사승철
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();
		
		String sel, eng, kor;
		int level;
		Word word;
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
