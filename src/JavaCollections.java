import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class JavaCollections {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for (int i = 0; i <=10; i++) {
			
			al.add(i);
			
		}
		//System.out.println(al);
		
		LinkedHashMap<Integer, Integer> link=new LinkedHashMap<Integer, Integer>();
		
		for (int i = 0; i < al.size(); i++) {
			
			link.put(i, i+1);
			
		}
		
		//System.out.println(link);
		
		Set<Entry<Integer, Integer>> lis=link.entrySet();
		
		for (int i = 0; i < lis.size(); i++) {
			
			
			
		}
		
	
		
		
		Iterator<Entry<Integer, Integer>> it=lis.iterator();
		
		while(it.hasNext()) {
			
			
			Entry<Integer, Integer> entry=	it.next();
			
			//System.out.println(entry.getKey()+"               "   +    "      "   + entry.getValue());
			
			
		}
		int[] k=new int[4];
		
		int[] mm=new int[1];
		
		System.out.println("length"+k.length);
		
		
		
		for(int i=0;i<k.length;i++) {
			
			k[i]=10;
			//System.out.println(k[i]);
			
		}
		
		for (int i = 0; i < k.length-1; i++) {
			
			
			if(k[i]==k[i+1]) {
				
				mm[i]=k[i];
				break;
			}
			
		}
		
		for (int i = 0; i < mm.length; i++) {
			System.out.println(mm[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
