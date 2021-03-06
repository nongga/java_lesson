package koreait.day12;
//사승철
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class C52_MyDictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//HashMap<String,String> mydic = new HashMap<>();
		TreeMap<String, String>mydic = new TreeMap<String, String>();//이진 검색이 가능한 구조로 Map을 생성 : 정렬이 되는 Map
		String sel, eng, kor;
				
		System.out.println("선택기능 👉 ,1. 단어저장 , 2.단어검색 , 3.단어장보기 , 4.프로그램 끝내기");
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
			mydic.put(eng, kor);	//저장
			break;
		case"2":
			System.out.println("검색단어 English->");
			eng = sc.nextLine();
			System.out.println("단어장 검색했습니다. 결과 =>");
			break;
		case"3":
			System.out.println("단어장 전체보기 : " + mydic);
			break;
			
		case"4":
			run=false;
			break;
			default:
				System.out.println("잘못입력된 선택입니다. 1~4입력입니다.");
				break;
		}
		}		
	}//참고: 정수 데이터 입력을 받아야 한다면 문자열 nextLine() 받아서 정수로 변환합니다. 
	//int score = Integer.parseInt(sc.nextLine())
	//이유: nextInt()는 엔터 처리 하지 않아서 다음에 나오는 nextLine()에게 전달되어 입력 흐름에 방해가 됩니다.
	//결론 : 한 소스 파일에서 nextInt()만 사용 또는 nextLine()만 사용하거나 합니다.

}
