package Composition;

public class Main {

	public static void main(String[] args) {
	
		teacher t1=new teacher("roja");
		student s1=new student("kumar","male" , 66, new teacher("rojakumari"));
		System.out.println(s1.getGender());
		System.out.println(s1.getTeachername().getName());

	}

}
