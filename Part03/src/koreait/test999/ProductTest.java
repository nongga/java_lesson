package koreait.test999;
//사승철
public class ProductTest {

	public static void main(String[] args) {
		
	Product[] cart = new Product[10];
		
		cart[0] = new Bike(123000, "MTB", 25);
		cart[3] = new Bike(99000, "삼천리", 15);
		cart[1] = new Electronics(35000,"USB");
		cart[5] = new Electronics(117000, "ipad");
		cart[7] = new Electronics(2250000, "lg냉장고");
		
				
		for(Product temp : cart)
			if(temp != null && temp.price>=100000 )
				System.out.println(temp);
		
		
			
	}

		
		
	
	
}

class Electronics extends Product{
	
	private double kwh;
	
	public Electronics(int price,String prdName) {
		this.price =  price;
		this.prdName = prdName;
		// TODO Auto-generated constructor stub
	}
	public Electronics() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String sell(Object obj) {
		// TODO Auto-generated method stub
		return String.format("묶음 상품 -%s(1set)", obj);
	}
	public double getKwh() {
		return kwh;
	}
	public void setKwh(double kwh) {
		this.kwh = kwh;
	}
	
	@Override
	public String toString() {
		return "Electronics [kwh=" + kwh + ", price=" + price + ", prdName=" + prdName + "]";
	}
	
	public void power(double kwh) {
		System.out.println(24*kwh);
		
	}
	
	
	
	
}