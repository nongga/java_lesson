package koreait.test;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] cart = new Product[5];
		cart[0] = new Bike(123000, "MBT", 25);
		cart[3] = new Bike(99000,"삼천리", 15);
		
		for(Product temp : cart)
			if(temp!=null && temp.price>=100000)
				System.out.println(temp);
		
		//for(int i=0;i<cart.length;i++)
		//	if(cart[i]!=null &&cart[i].price>=100000)
		//		System.out.println(cart[i]);
	}

}
