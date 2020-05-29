package SuperKeyword;




class Parent{
	
	Parent(){
		
		System.out.println("parent");
	}
	
	//overridden
	public void m1() {
		
		System.out.println("m1 in parent");
	}
	
	
}
class Child extends Parent{
	
	Child(){
		
		
		super();
	}
	//overriding
	
	public void m1() {
		System.out.println("child m1");
		//super.m1();
	}
	
}

public class Super_Practise {

	public static void main(String[] args) {
		
		//object creation plays a main role
		Parent j=new Child();
		j.m1();
	

	}

}
