package javaPracticeDemo;

import java.io.File;

public class checkTotalFilesInFolder {

	public static void main(String[] args) {
		
		// to count files and directives..
		/*int count = 0;
		File f = new File("C:\\SeleniumDrivers"); 
		String[] s = f.list();
		for(String s1 : s) {
			count++;
			System.out.println("List of file are : " + s1);
			System.out.println("The total number of files and folders are : " + s1.length());
		}*/
		// to check for only files..
		int count = 0;
		File f = new File("C:\\SeleniumDrivers"); 
		String[] s = f.list();
		for(String s1 : s) {
			
		File f1 = new File(f,s1);
		
		//	if(f1.isDirectory()) {   for dir
			if(f1.isFile()) {      // file files
				count++;
				System.out.println("List of files are : " + f1 );
			}
	}
		System.out.println("Total list number is : " + count);
	}

}
