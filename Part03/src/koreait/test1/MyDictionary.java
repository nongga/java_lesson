package koreait.test1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MyDictionary {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Word> mywords = new ArrayList<>();
		
		String sel, eng, kor;
		int level;
		Word word;
		System.out.println("μ νκΈ°λ₯ π ,1. λ¨μ΄μ μ₯ , 2.λ¨μ΄κ²μ , 3.λ¨μ΄μ₯λ³΄κΈ° ,4.λ λ²¨λ‘ κ²μ, 5.νλ‘κ·Έλ¨ λλ΄κΈ°");
		boolean run =true;
		while(run) {
			System.out.println("μ ν ->");
			sel = sc.nextLine();
			switch(sel)	{
				case"1":
					System.out.println("English ->");
					eng = sc.nextLine();
					System.out.println("νκΈ λ» ->");
					kor = sc.nextLine();
					System.out.println("λ λ²¨ ->");
					level = Integer.parseInt(sc.nextLine());
					mywords.add(new Word(eng,kor,level));
					break;
				case"2":
					System.out.println("κ²μλ¨μ΄ English->");
					eng = sc.nextLine();
					for(Word w : mywords)
						if(w.getEnglish().contentEquals(eng))
							System.out.println("λ¨μ΄μ₯ κ²μνμ΅λλ€." +w);
					break;
				case"3":
					all(mywords);
					break;
				case"4":
					System.out.println("κ²μν  λ λ²¨ μλ ₯(1~3 ->");
					int no = Integer.parseInt(sc.nextLine());
					level(mywords,no);
					
					break;
				case"5" :
					run=false;
					break;
					default:
						System.out.println("μλͺ»μλ ₯λ μ νμλλ€.1~5μλ ₯μλλ€." );
						break;
			}
		}
	}

	private static void level(List<Word> mywords, int no) {
			for(Word w : mywords)
				if(w.getLevel()==no)
					System.out.println(w);
	}

	private static void all(List<Word> mywords) {
			mywords.sort(new Comparator<Word>() {
				@Override
				public int compare(Word o1, Word o2) {
					return o1.getEnglish().compareTo(o2.getEnglish());
				}
			});
			System.out.println(String.format("%-20s %-20s\t %10s","English","Korean","Level"));
			System.out.println("---------------------------------------------------");
			for(Word w : mywords) {
				System.out.println(String.format("%-20s %-20s\t %10d",w.getEnglish(),w.getKorean(),w.getLevel()));
			}
	}
}