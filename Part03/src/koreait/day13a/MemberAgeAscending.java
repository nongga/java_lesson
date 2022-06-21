package koreait.day13a;

import java.util.Comparator;

import koreait.day12.Member;

public class MemberAgeAscending implements Comparator<Member>{
	
	@Override
	public int compare(Member o1, Member o2) {
		Integer age1 = o1.getAge();
		Integer age2 = o2.getAge();
		
		//age필드(1차 기준)값이 같을때 name필드(2차기준) 오름차순으로 정렬.
		if(age1==age2)
			return o1.getName().compareTo(o2.getName());
		else
			return age1.compareTo(age2);	//오름차순 : age1<age2일때 -1을 리턴
	}
	
	/* 리턴식은 음수값이 나오는 경우를 씁니다. 교환하지 않는 경우를 -1(음수)로 리턴되게 합니다.
	 * 각각 교환하지 않는 경우는 
	 *오름차순 : o1 < o2    	//내림차순 : o1 > o2 
	*/
	

}
