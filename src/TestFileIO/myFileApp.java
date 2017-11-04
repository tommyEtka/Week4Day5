//this is how you write data to a file

package TestFileIO;

//import java.io.File;
import java.io.*;

//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.nio.file.*;

public class myFileApp {

	public static void main(String[] args) // throws FileNotFoundException
	// - this is one solution for the exception
	
	{
		// first I need to know where this file will go
		Path filePath = Paths.get("config.txt");
		File myConfigFile = filePath.toFile();
		writeToFile(myConfigFile);
		
		
		
		
		
	}

	public static void writeToFile(File myConfigFile) {
		PrintWriter wrt = null;
		
		// another way is a try and catch
		try { //try and catch is preferred way to do exceptions

			wrt = new PrintWriter(myConfigFile); // this is a checked exception
			//PrintWriter should be defined outside your try and catch
			wrt.println("Hello World!");
			//wrt.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//wrt.close();
		} finally {
			wrt.close();
		}
	}

}
