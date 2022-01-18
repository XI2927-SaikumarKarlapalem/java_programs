package Inheritance_ex;

public class Lion extends Animal {

	private String food;

	public Lion(String name, int age, int legs, int teeth,String food) {
		super(name, age, legs, teeth);
		this.food=food;
		
	}
	
	public void snore()
	{
		System.out.println(this.name+" snoring");
		super.sleep();
	}

}
