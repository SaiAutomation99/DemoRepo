class Heritage{
	
	public void m1() {
		
		System.out.println("parent class");
		
	}
	
	
}
public class Inheritance extends Heritage {
	
	
	public void m1() {
		
		System.out.println("child class");
		
	}

	public static void main(String[] args) {
		
		
		//Inheritance j=new Inheritance();    //child class
		
		//Heritage j=new Heritage();    //parent class
		
	//	Inheritance j=new Heritage();   //compile time error
		
		Heritage j=new Inheritance();   //child class
		
		j.m1();
		
		
	}

}
