package koreait.day10;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

class Product{
	int price;
	
	//디폴트 생성자는 동작을 안합니다.
	
	public Product(int price) {
		this.price=price;
	
	}
}

class Food extends Product{		//Product()디폴트 생성자 실행하므로 없으면 오류 -> Food() 디폴트 생성자 실행
	public Food(int price) {
		super(price);
	}
	
}

class Electronics extends Product{ //Product() 디폴트 생성자 실행
	public Electronics(int price) {
		super(price);		//Product()	디폴트 생성자 대신에 커스텀 생성자 호출
	}
	
}