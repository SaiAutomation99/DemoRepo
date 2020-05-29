package Collections_Practise;

import java.util.HashSet;
import java.util.Set;

public class Set_Practise {

	public static void main(String[] args) {
		
		Set<String> set=new HashSet<String>();
		for(int i=0;i<=10;i++) {
			
			set.add(Integer.toString(i));
		}
		
		
		System.out.println(set);
		
		if(set.contains("2")) {
			
			System.out.println("contains");
		}else {
			System.out.println("not contains");
		}
		
		
		
	}

}
