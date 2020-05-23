package Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConertingAsynchronseCollection {

	public static void main(String[] args) {


		ArrayList al=new ArrayList();

		for (int i = 0; i <=10; i++) {

			al.add(i);

		}
		List a=Collections.synchronizedList(al);

		System.out.println(a);

		Object i=a.get(3);
		
		//Integer k=new Integer(i);
		Integer l=Integer.parseInt(i.toString());
		
		int b=10;
		
		byte k=(byte)b;
		System.out.println(l);
		
		
	}

}
