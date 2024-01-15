package com.edu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingConcept {

	public static void main(String[] args) throws IOException {
		
	// Create a file
		   File myfile=new File("fil.txt");
		   myfile.createNewFile();
		
    // writing a File
		/*  FileWriter f=new FileWriter("kaleem.txt");
		     f.write("It is a 4 Month bootcamp\n after this course you are an expert of java full stack ");
		      f.close();
		      
	// Reading a file
		File myfile=new File("kaleem.txt");
		Scanner sc=new Scanner(myfile);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();  */
		
		
		// delete file
		//File f2=new File("kaleem.txt");
		//f2.delete();
		 //  System.out.println("File Deleted: "+f2.getName());
		
		      
	
		      

	}

}
