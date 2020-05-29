package UserEntering;

import java.io.InputStream;
import java.util.Scanner;

public class User_Scanner {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int k=sc.nextInt();
		System.out.println(k+"value u entered");
		sc.close();
		

	}

}
