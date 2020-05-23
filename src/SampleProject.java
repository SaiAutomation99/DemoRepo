import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;


public class SampleProject {

	public static void main(String[] args) {
		
		String name2="";
		
		System.out.println("hello");
		HashMap<String, String> hash=new HashMap<String, String>();
		hash.put("sai1", "1");
		hash.put("sai2", "1");
		hash.put("sai3", "1");
		hash.put("sai4", "1");
		System.out.println(hash);
		
		Collection<String> h=hash.values();
	Iterator<String> it=	h.iterator();
     while(it.hasNext()) {
	
	String name=it.next();
	System.out.println(name);
	name2=name2+name;
	
    }
      System.out.println(name2);
      
	}

}
