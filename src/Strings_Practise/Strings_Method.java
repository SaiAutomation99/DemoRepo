package Strings_Practise;

public class Strings_Method {
	
	static String name="";

	public static void main(String[] args) {
		if(name.isEmpty()) {
		name="sai";
		System.out.println(name);
		
		boolean b=name.startsWith("s");
		System.out.println(b);
		
		}else {
			
			System.out.println("no");
		}

	}

}
