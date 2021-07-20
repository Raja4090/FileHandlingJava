package com.phoenix.fileio;

import java.io.File;
import java.io.IOException;

//author:raja.kumar@stltech.in
public class FileUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try {
			File file=new File("hello.txt");
			System.out.println("File Created: "+file.createNewFile());
			
			File dir=new File("MyDir");
			System.out.println("Directory created: "+dir.mkdir());
			
			 File file1=new File(dir,"hello.txt");
			 System.out.println(file1.createNewFile());
			
			File file2 =new File(dir,"welcome.txt");
			System.out.println("Renaming file: "+file1.getName()+" "+file2.getName()
			+" "+file1.renameTo(file2));
		
			
			File file3= new File("welcome.txt");
			System.out.println(file3.delete());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
