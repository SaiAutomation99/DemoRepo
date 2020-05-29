package Comparator_Practise;
import java.util.Comparator;
import java.util.TreeSet;




class MyComparator implements Comparator<Integer>{
	
	

	public int compare(Integer o1, Integer o2) {
		
		Integer s1=(Integer)o1;
		Integer s2=(Integer)o2;
		
		return -s1.compareTo(s2);

	}
}
public class Comparator_Practise {

	public static void main(String[] args) {
		
		TreeSet<Integer> tr=new TreeSet<Integer>(new MyComparator());
		for(int i=0;i<=10;i++) {
			
			
			tr.add(i);
		}
		
		System.out.println(tr);

	}

}
