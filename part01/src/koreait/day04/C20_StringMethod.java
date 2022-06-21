package koreait.day04;

public class C20_StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message = "hello~";	//java.lang.String (기본패키지 클래스)
		

		
		int len = message.length();
		char temp = message.charAt(3); //0부터 시작해서 3번문자가 무엇인지 리턴.
		boolean isState = message.equals("Hello~"); //문자열이 같은
		
		System.out.println("length() = " + len);	//6
		System.out.println("charAt(3) = " + temp); //1
		System.out.println("equals(\"Hello\") = " + isState);//false
		
		System.out.println("indexOf('e');" + message.indexOf('e'));	//1번위치
		System.out.println("indexOf(\"lo\");" + message.indexOf("lo")); //3번위치
		System.out.println("indexOf(\"lo\");" + message.indexOf("ol"));// -1 : 찾는 문자열이 없을때
		String test = "hello~hello~";
		System.out.println("test.indexOf(\"lo\") =" + test.indexOf("lo"));
		System.out.println("substring(2);" + message.substring(2));	//부분추출 : llo~
		System.out.println("substring(2,4);" + message.substring(2,4));	//ll, 2번부터 2개(4-2)
		System.out.println("replace(\"11\", \"*@\") =" + message.replace("11", "*@")); //치환 : he*@o~
		System.out.println("startsWith(\"H\") =" + message.startsWith("H")); //false
		System.out.println("endWith(\"~\") = " +message.endsWith("~")); //true
		
		
		
	}
//	message.length();	//public int length()
//	message.charAt(0);	//public char charAt(int index)
	
//	message.equals("Hello~");	//public boolean equals(Object anObject) , Object 는 모든 타입
								//message 가 String 타입이므로 Object 는 String으로 해석합니다.
	//리턴값 형식은?
//	message.indexOf('e');	//int
//	message.indexOf('e');	
//	message.substring(2);	//string
//	message.substring(2,4);
//	message.replace("11", "*@");	//string

}
