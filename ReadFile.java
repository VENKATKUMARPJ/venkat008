package assproject;
import java.util.*; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.*; 
import java.io.*; 

public class ReadFile {
	public static void readFileReaderClass() throws IOException
	{ 
		FileReader reader= new FileReader("C:\\operation\\read.txt");

		int data;

		while((data=reader.read())!=-1){

			System.out.print((char)data);
		}

	}

	public static  void readFileFileInputStream() throws IOException
	{

		FileInputStream stream= new FileInputStream("C:\\operation\\read.txt");
		int data;

		while((data=stream.read())!=-1){

			System.out.print((char)data);
		}

	}

	public static void readDataUsingNIO()  throws IOException
	{
		List<String> list=Collections.emptyList();
		Path path=  Paths.get("C:\\operation\\read.txt");
		list= Files.readAllLines(path,StandardCharsets.UTF_8);

		Iterator<String> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {


		try {
			readFileReaderClass();
			readFileFileInputStream();
			readDataUsingNIO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("File not available");
		}
	}

}

