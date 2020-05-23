import java.util.Arrays;

public class StringsPractise {

	public static void main(String[] args) {

		String name="stringename";



		char[] k=name.toCharArray();
		
		System.out.println(k.length);
		
		Arrays.sort(k);
		
		for (int i = 0; i < k.length-1; i++) {
			//System.out.println(k[i]);
			
			
			if(k[i]!=k[i+1]) {
				
				
				char c=k[i];
				System.out.println(c);
			}
		}
		
		char l=k[k.length-1];
		System.out.println(l);
		
	}

}
