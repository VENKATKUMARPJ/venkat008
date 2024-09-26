package assproject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;


public class CreatFile {

	public static void createFileUsingFileClass() throws IOException
	{
		//create file
	
		File file;
	
		file=new File("C:createFileUsingFileClass.txt");
		
		
        
		if(file.createNewFile()) {
			System.out.println("File is Created");
		}
		else {
			System.out.println("File  is already Exist");
		}

		//write data to that file
		FileWriter  writer= new  FileWriter(file);//overWrites file
		//FileWriter  writer= new  FileWriter(file,true);//appends File
		writer.write("Welcometo Simplilearn...!");
		writer.close();
	}


	public static void createFileUsingOutputStream()  throws IOException
	{
		FileOutputStream out= new FileOutputStream("C:createFileUsingOutputStream.txt");
		String input="Welcome to OutputStream";
		byte array[]=  input.getBytes();
		out.write(array);
		System.out.println("Data Written Successfully");
		out.close();
	}

	public static void createFileUsingNIO() throws IOException
	{

		Path path=Paths.get("C:createFileUsingNIO.txt");
		//write data using file class
		String input="Welcome  to NIO";
		byte array[]=input.getBytes();

		Files.write(path, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written Successfully");


		//if you want to write data of list to  files directly
		Path path1=Paths.get("C:createFileUsingNIO.txt");
		//write data  using Files class

		List<String> list=Arrays.asList("This  is my first line","This is my secondLine");
		Files.write(path1, list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Lines Written Successfully");

	}


	public static void main(String[] args) {
		try {
			 //createFileUsingFileClass();
			 createFileUsingOutputStream();
			 //createFileUsingNIO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}




