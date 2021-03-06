package koreait.test;

public class Bike extends Product {
	
	private int speed;
	
	public Bike(int price,String prdName, int speed) {
		this.price = price;
		this.prdName = prdName;
		this.speed = speed;
	}
	
	@Override
	public String sell(Object obj) {

		return String.format("추가 할인 행사 -%d %%인하"	, obj);
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Bike [speed=" + speed + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	
}
