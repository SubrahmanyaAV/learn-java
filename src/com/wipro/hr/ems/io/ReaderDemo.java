package com.wipro.hr.ems.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDemo {

	public static void main(String[] args) {
		
		File f = new File("names.txt");
		
		if(f.exists() && f.canRead())
		{
			try(BufferedReader br = new BufferedReader(new FileReader(f)))
			{
				String line = null;
				
				while((line = br.readLine()) != null)
				{
					System.out.println(line);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
