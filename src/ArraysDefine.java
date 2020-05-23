import java.util.Arrays;

public class ArraysDefine {

	public static void main(String[] args) {
		
		
		
		int[] k= {10,20,10,50};
		
		Arrays.sort(k);
		for (int i : k) {
			System.out.println(i);
		}
		int[] m=new int[3];
		int i;
		for(i=0;i<k.length-1;i++) {
			
			
			if(k[i]!=k[i+1]) {
				m[i]=k[i+1];
				
			}
		}
		
		m[3]=k[k.length-1];
		
		for(int j=0;j<m.length;j++) {
			
			System.out.println(m[j]);
		}
		
		
	}

}
