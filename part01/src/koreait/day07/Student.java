package koreait.day07;
//C39번호생략
public class Student {

	int no;
	String name;
	int greade;
	Score score;		//다른 클래스 객체를 필드(구성요소)로 갖게 됩니다.
	
	//인자로 전달받은 값을 전역변수(필드-객체의 특성을 나타내는 구성요소)에 대입
	void setData(String name, int grade) {
		this.name=name;
		this.greade=grade;
	}
	
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", greade=" + greade +
				", score=" + score + "]";	//score는 score.toString() 입니다
	}
	
	
}
