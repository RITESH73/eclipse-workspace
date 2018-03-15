package javaPracticeDemo;

import java.io.File;

public class CreateFileClass {

	public static void main(String[] args) {
		

		//System.out.println(f.exists());
		
		try {
			File f = new File("Ritesh");
			File f1 = new File("Ritesh","abc.txt");
			f.mkdir();
			f1.createNewFile();
			System.out.println(f.exists());
			}catch(Exception e) {
			System.out.println("File doesn't exist : " + e);
		}
		

	}

}
