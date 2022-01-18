class animal
{
	String name;
	int age;
	animal(String name,int age)
	{
	 this.name=name;
	 this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}




public class main {
	public static void main(String[]args)
	{
		animal animal=new animal("lion",18);
		System.out.println(animal.name+"     "+animal.age);
		System.out.println(animal.getName());
		
	}

}
