package koreait.test999;
//사승철
public class Bike extends Product{
	
	private int speed;
	
	public Bike(int price, String prdName, int speed) {
		this.price = price;
		this.prdName = prdName;
		this.speed = speed;
		// TODO Auto-generated constructor stub
		
	
	}
	
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sell(Object obj) {
		// TODO Auto-generated method stub
		return String.format("추가 할인 행사 -%d %%인하", obj);
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
	
	public String ride(Object speed) {
		// TODO Auto-generated method stub
		return String.format("당신은 이것을 시속 %d km속도로 탈수있습니다.", speed);
	

	}
}
