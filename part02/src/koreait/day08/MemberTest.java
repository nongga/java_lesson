package koreait.day08;

public class MemberTest {
		public static void main(String[] args) {
			Member momo = new Member();
			
			Member nana = new Member("최나나","nana@gmail.com");
			System.out.println("nana name = " + nana.getname());
			nana.setAge(26);
			System.out.println("nana age = " + nana.getAge());
		}
}
