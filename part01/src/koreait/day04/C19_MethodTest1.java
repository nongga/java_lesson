package koreait.day04;

public class C19_MethodTest1 {
	//main 메소드 : 실행의 시작점. 프로그램 실행을 위해서는 꼭 있어야할 메소드. static
	public static void main(String[] args) {
		System.out.println("메소드를 직접 정의해서 사용해봅니다.");
		System.out.println("프로그램은 main 메소드의 명령문을 순서대로 실행하고 중간에 메소드 호출을 만나면 메소드가 정의된 실행을 위해");
		System.out.println("제어를 이동합니다. 메소드 실행이 종료되면 다시 main 메소드로 제어가 돌아옵니다.");
		methodA(); //메소드호출(실행) . 필요할때 호출합니다.
		System.out.println("2.");
		methodB(11,33); // **11,33은 메소드 실행에 필요한 인자**
//		methodB(929,111); //오류 : 매개변수 형식 오류
		System.out.println("3");
		methodC(929,12.1);
		methodC(929,121); //오류아님 : 자동캐스팅(형변환)
		System.out.println("4.");
		methodD();		//반환값이 있는메소드이지만 main 메소드에서 반환값 저장을 안했습니다.
		System.out.println(("return = " + methodD());	//반환값을 받아서 출력하는 예시
		int temp = methodD();
		System.out.println("return = " + temp);
		System.out.println("5.");
		
		double result = methodE(314, 3.14);
		System.out.println("return = " + result);
		
		System.out.println("6 .");
		
		System.out.println(methodF('i',4));	//methodF정의하세
		
		char ch = 'a';
		int val = 3;
		ch = methodF(ch,val);
		System.out.println("return = " + ch);
	
		// TODO Auto-generated method stub
		/* String 클래스의 메소드를 이해.
		 *   ㄴ 메소드의 구조연습
		 *   
		 *   메소드의 주요 요소 : 반환값(형식), 인자(argument)또는 매개변수(parameter), 메소드 이름,public 또는 static 등의 설정
		 *     ㄴ 반환값: 메소드 실행 완료되면 얻어지는 결과값 - 반환형식은 모든타입입니다.
		 *     	ㄴ인자 : 메소드 실행을 위해서 필요한 데이터(형식과 변수명 선언필요) -인자의 갯수와 형식은 다양합니다.
		 *      ㄴ 메소드 이름 : 식별자
		 *      ㄴ public : 접근한정자, static : 정적요소
		 */

		
		//static 인 main에서 실행할 메소드는 동일하게 static이어야합니다.
		//메소드 선언(정의)
		public static Void methodA() {
			System.out.println("##첫번째 메소드 정의 연습입니다.##");
		}
		
		public static void methodB(int a , int b) {
			System.out.println("##두번째 메소드 정의 연습입니다.##");
			System.out.println("전달받은 값a = " +a + ",b = " +b);
		}
		public static void methodC(int a , double b) {
			System.out.println("##세번째 메소드 정의 연습입니다.##");
			System.out.println("전달받은 값a = " +a + ",b = " +b);
			
		public static int methodD() {		//환값이 있는 형식 : 반환값은 int데이터 , 반드시 return 이 필요합니다.
			System.out.println("##네번째 메소드 정의 연습입니다.##");
		return 999;
		
		}
		public static int methodE(int a, int b) {
		System.out.println("##다섯번째 메소드 정의 연습입니다.##");
		return a+b;		//인자로 전달받은 값으로 실행하고 처리결과 리턴
		}
		public static int methodF(char ch , int size) {
			System.out.println("##여섯번째 메소드 정의 연습입니다.");
			return (char)(ch+size);	//인자로 전달받은 값으로 실행하고 처리결과 리
		}
		
		}
		
		
	}
}

