package koreait.day12;
//사승철
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class C48_MathList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int size=5;
		ArrayList<MathProblem> problems = new ArrayList<>();
		int ans; int cnt=0;
		System.out.println("-----------------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("-----------------------------");
		System.out.println("시작합니다.");
		for(int i=0;i<size;i++) {
			MathProblem temp = new MathProblem('+');
			temp.makeProb();
			
			System.out.println("문제" +(i+1)+ ".   " + temp.problem()+"답입력 ->");
			ans = sc.nextInt();
			
				if(ans == temp.showAnswer()) {	
				
					cnt++;		
					temp.setCorrect(true);
			}
				 problems.add(temp);
		}
		System.out.println("---------------------------------");
		System.out.println("채점합니다. 맞은갯수 " + cnt + "("+ (cnt*100/size) + "점)");
		System.out.println(":::::틀린문제 정답 보기:::::");
		
		for(int i=0;i<problems.size();i++)
//			if(problems[i].isCorrect()==false)//틀렸을때
			if(!problems.get(i).isCorrect()) //problems[i].isCorrect()이 거짓이면 !연산으로 참으로 바뀝니다.
			System.out.println("문제 " +(i+1)+".  " + problems.get(i).problem()+problems.get(i).showAnswer());
		
		for(MathProblem temp : problems)
			if(!temp.isCorrect())
				System.out.println(temp.problem() + temp.showAnswer());
		
		
			
			
		
		
		
		sc.close();
			
		
	

	}
}

