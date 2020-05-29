package This_Keyword;

public class This_Methods {
	
	
	public int j=210;
	
	public void m1() {
		j=1000;

		this.m2(j);
		
	}
	
	public void m2(int h) {
		System.out.println("m2 method"+h);
	}

	public static void main(String[] args) {
		This_Methods j=new This_Methods();
		j.m1();
		System.out.println(j.j);
		


	}

}
