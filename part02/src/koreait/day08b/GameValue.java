package koreait.day08b;

import java.util.Random;

public class GameValue {	//게임기록 데이터를 저장하기 위한 클래스
	
	private String gamer;	//게임참가자 이름
	private int count;		//게이머 시도 횟수, 초기값 0
	private boolean Success;	// 맞추기 성공 여부, 초기값 false
	
	//커스텀 생성자 : gamer 초기값 설정
	public GameValue(String gamer) {
		this.gamer=gamer;
	}
	//인스턴스 메소드
	public void print() {
		System.out.println("gamer : " + gamer + ",시도횟수 :" + count + ",성공 : " + Success);
	}
	//static - 개게의 인스턴스 필드값을 사용하지 않는경우. 즉, 객체와 상관없는 메소드 동작.
	public static int makeNumber(int min, int max) {	//min이 101, max이 299 : 난수의 최소값,최대값,인자로 받고
		Random r = new Random();
		return r.nextInt(max-min+1)+min; //r.nextInt(199)+101; ->0~198 +101
		}// 참고 : r.nextInt(100) 은 0~99범위의 난수
	
	//getter 와 setter : boolean타입은 메소드 이름이 isxxx()입니다.
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setGamer(String gamer) {
		this.gamer = gamer;
	}
	public String getGamer() {
		return gamer;
	}
	public void setSuccess(boolean Success) {
		this.Success = Success;
	}
	public boolean isSuccess() {
		return Success;
	}
	
	

}
