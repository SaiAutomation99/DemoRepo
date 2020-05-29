package Comparator_Practise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;


class MyComparator1 implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		
		return -o1.compareTo(o2);
	}	
}

public class Comparator_String {

	public static void main(String[] args) {
		
		
		
		
		TreeSet<String> h=new TreeSet<String>(new MyComparator1());
		h.add("sai");
		h.add("jai");
		h.add("mahesh");
		h.add("leela");
		System.out.println(h.size());
		System.out.println(h);
		
		
//		ArrayList<String> al=new ArrayList<String>(h);
//		for (int i = al.size()-1; i>=0; i--) {
//			
//			System.out.println(al.get(i));
//			
//		}
//		
		System.out.println("after comparator"+h);
		
		
		

	}

}
