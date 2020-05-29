package Comparator_Practise;

import java.util.Comparator;
import java.util.TreeSet;


class MyComparator2 implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		
		String s=o1.toString();
		String s1=o2.toString();
		
		return -s.compareTo(s1);

	}
	
	
	
}

public class Comparator_StringBuff {

	public static void main(String[] args) {
		
		
		TreeSet<StringBuffer> k=new TreeSet<StringBuffer>(new MyComparator2());
		k.add(new StringBuffer("www1"));
		k.add(new StringBuffer("www2"));

		k.add(new StringBuffer("www3"));

		k.add(new StringBuffer("www4"));
		
		System.out.println(k);
		


	}

}
