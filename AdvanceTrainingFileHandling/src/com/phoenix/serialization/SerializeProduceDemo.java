package com.phoenix.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.phoenix.models.Product;

public class SerializeProduceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(ObjectOutputStream out=new ObjectOutputStream
				(new FileOutputStream("produceData.txt") );)
		{
		
			Product product=new Product(1001,"Laptop","HP",450000.0f);
			out.writeObject(product);
			System.out.println("Done successfully!");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
