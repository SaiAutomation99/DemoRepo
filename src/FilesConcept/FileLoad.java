package FilesConcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileLoad {

	public static void main(String[] args) {
		
		try {
			
		
		FileOutputStream f=new FileOutputStream("D:\\Study\\ExtentReport\\fileloader.txt");
		f.write(8);
		f.flush();
		f.close();
		
		
		
		File f1=new File("D:\\Study\\ExtentReport\\Extentreporta.txt");
		
System.out.println("file no created we need to create using create new file");
			System.out.println("file no created we need to create using create new file");

		
		f1.createNewFile();
		}catch(Exception e) {
			
			
		}
		


	}

}
