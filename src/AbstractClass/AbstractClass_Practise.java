package AbstractClass;


abstract class AbstractClasses{
	
	
	public void m1() {
		
		System.out.println("in the abstarct class");
		
	}
	public abstract void m2();
	
}

class AbstractImplementation extends AbstractClasses{

	public void m2() {

		System.out.println("abstractImplemenation");
	}
}

public class AbstractClass_Practise {

	public static void main(String[] args) {
		
		AbstractImplementation k=new AbstractImplementation();
		k.m1();
		k.m2();
		

	}

}
