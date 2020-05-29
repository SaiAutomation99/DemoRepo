package Interfaces;

interface InterfaceDemo1{
	
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();

	
}
abstract class Demo implements InterfaceDemo1{
	
	Demo(){
	System.out.println("we can create a constructor for abstract class");	
		
	}
	
	public void m1() {
		
		System.out.println("abstract class method ");
	}
	public abstract void m2();

	public abstract void m3();

	
}
class NonAbstract extends Demo{

	@Override
	public void m2() {
		System.out.println("abstract method");
	}

	@Override
	public void m3() {
		System.out.println("abstarct method");
		
	}
	
	
	
}


public class Interface_Practise {

	public static void main(String[] args) {
		NonAbstract j=new NonAbstract();
		j.m1();
		j.m2();
		j.m3();
		
		

	}

}
