package koreait.day09a;
//day09에서 day11test까지 시험


public class Animal {
	private String name;
	private String color;
	
	public Animal() {
		System.out.println("새로운 Animal가족이 생겼습니다.");
	}
	public void act() {
		System.out.println("Animal 행동 : 아직 모름(unknown)");
	}
	public void print() {
		System.out.println("name:" +name + ",color"+color);
	}
	public static boolean isDog(Object object) {
		return object instanceof Dog;
	}
	public static boolean isCrow(Object object) {
		return object instanceof Crow;
	}
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}