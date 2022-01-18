package oop;

public class Grandfather {
	String Name;
	int age;
	String Location;
	
	Grandfather(String Name,int age,String Location)
	{
		this.Name=Name;
		this.age=age;
		this.Location=Location;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

}
