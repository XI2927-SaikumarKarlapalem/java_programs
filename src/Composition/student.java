package Composition;

public class student {
	private String name;
	private String gender;
	private int rollnumber;
	private teacher teachername;
	public student(String name, String gender, int rollnumber, teacher teachername) {
		super();
		this.name = name;
		this.gender = gender;
		this.rollnumber = rollnumber;
		this.teachername = teachername;
	}
	
	public void get_teacher(String teacher)
	{
		System.out.println("teacher name is" +teacher);
	}
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public teacher getTeachername() {
		return teachername;
	}
	

}
