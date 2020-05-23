interface A{
	
	public abstract void m1();
}
public class InterfaceReference implements A{
	
	public void m1() {
		
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		
		A a=new InterfaceReference();
		a.m1();

	}
}
