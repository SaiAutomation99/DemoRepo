package This_Keyword;

class Parent_1{
	public Parent_1() {

System.out.println("parent");	
}
	
}
class Child_2 extends Parent_1{
	public Child_2() {
		
		this(10);
		System.out.println("first call");
	}
	
	public Child_2(int i) {
		this(true);
		System.out.println(i);
		
	}
	public Child_2(boolean b) {
		System.out.println(b);
		
	}
	
	
	
}

public class ThisKeyword_Practise {

	public static void main(String[] args) {
		Child_2 k=new Child_2();
		

	}

}
