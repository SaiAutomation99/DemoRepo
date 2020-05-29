package Variables;

class A{
	
	
	public static void m3() {
		
		System.out.println("override a static method");
	}
	public void m1() {
		
		System.out.println("a Class");
	}
	public void m4() {
		
		System.out.println("m4");
	}
	
}
class B extends A{
	public static void m3() {
		
		System.out.println("override a static method in B class");
	}
public void m1() {
		
		System.out.println("B class");
	}
	
}

public class Variables_Practise extends B{
	
	
	static int k=20;
	public void m5() {
		System.out.println("m5 ");
		int kk=10;
		
		if((kk>=10 && kk<=10) && (kk<10 && kk>10)) {
			
			System.out.println("correct");
		}else {
			
			System.out.println("not correct");
		}
	}
	
	

	public static void main(String[] args) {
		
//		System.out.println("static variable"+Variables_Practise.k);
//		
//		A k=new B();
//		k.m3();
//		k.m1();
		
		
		A j=new Variables_Practise();
		j.m3();
		j.m1();
		j.m4();
		Variables_Practise m=new Variables_Practise();
		m.m5();


	}

}
