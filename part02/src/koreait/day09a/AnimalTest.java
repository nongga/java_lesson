package koreait.day09a;

public class AnimalTest extends Animal {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		
		animal.act();
		animal.print();
		System.out.println("--------------------");
		
		Dog dog = new Dog();
		dog.run();
		//dog.print();	//상속 메소드
		System.out.println("------------------------");
		Crow crow = new Crow();
		crow.fly();
		crow.print();
		
		System.out.println("::::::::::::::::::");
		Animal temp = dog;		//자식 객체는 부모 클래스 타입으로 참조할수 있습니다.
		temp.print();
		//temp.run();				//((오류))부모타입 변수로는 자식 메소드 실행 못합니다.
		temp=crow;				//자식 객체는 부모 클래스 타입으로 참조할수 있습니다.
		temp.print();
		//temp.fly();				//((오류))부모타입 변수로는 자식 메소드 실행 못합니다.
		System.out.println("----------------");
		
		//Dog puddle =(Dog)puppy; //Animal 타입을 Dog 타입으로 casting.(자식클래스만 가능)
		//puddle.run();			//puppy 변수가 참조하는 객체가 Dog 타입일때만 가능
		//puddle.print();
		
		

	}



}
