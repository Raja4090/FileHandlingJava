package com.phoenix.fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("hello.txt");
			int data=0;
			while((data=fis.read())!=-1)
				  System.out.print((char)data);
		}
		catch(Exception e)
		{
			
		}
		finally {
			if(fis!=null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			
		
		
	}

}
