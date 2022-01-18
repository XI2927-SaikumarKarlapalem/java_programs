package Inheritance_ex;

public class Animal {
	protected String name;
	private int age;
	private int legs;
	private int teeth;
	public Animal(String name, int age, int legs, int teeth) {
		super();
		this.name = name;
		this.age = age;
		this.legs = legs;
		this.teeth = teeth;
	}
	
	public void sleep()
	{
		System.out.println(this.name+" is sleeping");
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getLegs() {
		return legs;
	}
	public int getTeeth() {
		return teeth;
	}
	

}
