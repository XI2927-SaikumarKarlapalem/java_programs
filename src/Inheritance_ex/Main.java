package Inheritance_ex;

public class Main {

	public static void main(String[] args) {
		Animal dog=new Animal("pinky",18,4,32);
		Animal cat=new Animal("rocky",8,4,22);
		Lion l1=new Lion("singham",19,4,38,"rabbit");
		dog.sleep();
		cat.sleep();
		l1.snore();
		

	}

}
