package koreait.day08;

public class Score {
	private int korean;
	private int english;
	private int science;
	private String grade; //getter,setter 작성해보기
	//값 예시 ㅣ A+,A,B+,B.....
	
	//기본생성자 숨어있습니다. 어떤 코드일까요? 접근한정자는 public
	public Score() {
		
	}
	
	void setScience(int science) {
		this.science = science;
	}
	int getscience()	{
		return science;
		
	}
	
	void setKorean(int korean) {
		this.korean=korean;
		//메소드 인자로 전달받은 값을 클래스 전역변수 korean에 저장.(대입)
		//this 는 setKorean메소드를 실행시키는 객체
	}
	int getkorean() {
		return korean;
	}
	void setEnglish(int english) {
		this.english = english;
	}
	int getEnglish() {
		return english;
	
	
	}
	void setGrade(String grade) {
		this.grade = grade;
		
	}
	String getGrade() {
		return grade;
	}

}
