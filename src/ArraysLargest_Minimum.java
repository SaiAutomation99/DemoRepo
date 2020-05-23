import java.util.Arrays;

public class ArraysLargest_Minimum {

	public static void main(String[] args) {
		
		int[] k= {10,20,70,90,20};
		
		Arrays.sort(k);
		
		for(int i=k.length-1;i>=0;i--) {
			
			System.out.println(k[i]);
			break;
		}
		
		System.out.println(k[0]);
		
		
		int[] l= {10,70,20,40};
		
		int max=l[0];
		
		int min=0;
		
		for(int i=1;i<l.length;i++) {
			
			
			
			if(max<l[i]) {
				min=max;
				
			}
		}
		
		System.out.println(min);
	}
}
