package Interfaces;



interface interfaceDermo {
	
	abstract public  void m1();
	
}

abstract class AbstractDemo{
	
	abstract public void m2();
	
}

 
	
	


public class InterfaceDemo extends AbstractDemo implements interfaceDermo {
	
	public void m2() {
		
		System.out.println("m2 method");
	}
	
	public void m1() {
		
		System.out.println("interface demo");
	}

	public static void main(String[] args) {
		
		InterfaceDemo demo=new InterfaceDemo();
		
		demo.m1();

	}

}
