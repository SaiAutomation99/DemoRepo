import java.util.ArrayList;
import java.util.LinkedHashSet;

public class PractiseCollections {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		
		for(int i=0;i<=10;i++) {
			
			al.add(i);
			
		}
		
	//	HashSet<Integer> hash=new HashSet<Integer>(al);
		
		LinkedHashSet<Integer> link=new LinkedHashSet<Integer>(al);
		System.out.println(link);
		
		
		
		
		
		

		
		
		
		
		


	}

}
