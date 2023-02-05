package com.wipro.hr.ems.io;

import java.io.File;

public class DirListDemo {

	public static void main(String[] args) {
		
		File f1 = new File("C:/Program Files/Java/jdk1.8.0_331");
		
		if(f1.isDirectory())
		{
			String[] fileNames = f1.list(new HtmlFileFilter());
			
			for(String fname : fileNames)
			{
				System.out.println(fname);
			}
		}
	}

}
