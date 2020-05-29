package Collections_Practise;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class List_Practise {

	public static void main(String[] args) {
		
		
		
		
		List<String> al=new ArrayList<String>();
		al.add("hello");
		al.add("kk");
		al.add("hh");
		al.add("ii");
		
		
		
		
		
	al.iterator();
	
	TreeSet<String> tree=new TreeSet<String>(al);
	System.out.println(al);
		
		
		System.out.println(al);
		
		if(al.contains("hello")) {
			
			System.out.println("it contains");
		}else {
			
			System.out.println("does not");
		}
		
		for (int i = 0; i <al.size(); i++) {
		
			if(al.get(i).equals("hello")){
				System.out.println("equals");
				
			}else {
				System.out.println("not equals");
			}
		}

	}

}
