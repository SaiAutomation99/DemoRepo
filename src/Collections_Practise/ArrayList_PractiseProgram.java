package Collections_Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayList_PractiseProgram {

	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		for(int i=0;i<=10;i++) {
			
			al.add(i);
			
			
		}
		
		System.out.println(al);
		al.set(1, 20);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		
		boolean n=al.contains(6);
		if(n) {
			
			System.out.println("contains");
		}
		
		TreeSet<Integer> tree=new TreeSet<Integer>(al);
		//System.out.println(tree);
		Collections.sort(al);
		System.out.println(al);
		
		int h=al.indexOf(4);
		System.out.println(h);
		
		
		ArrayList j=new ArrayList();
		j.add(1);
		j.add(2);
		
	
			Collections.swap(j, 0, 1);
			System.out.println(j);
			
			Object[] obj=al.toArray();
			
			for (int i = 0; i < obj.length; i++) {
				//System.out.println();
				
				Object k=obj[i];
				String f=k.toString();
				int s=Integer.parseInt(f);
				System.out.println(s);
				
			}
			
		
		
		

	}

}
