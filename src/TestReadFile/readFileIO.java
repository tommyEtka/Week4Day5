package TestReadFile;

//import java.io.File;
import java.io.*;

//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.nio.file.*;

public class readFileIO {

	public static void main(String[] args)

	{
		Path filePath = Paths.get("config.txt");
		//if this file does exist it doesn't write over the file
		File myConfigFile = filePath.toFile();
		// writeToFile(myConfigFile);

		readToFile(myConfigFile);
		
	}
	public static void readToFile(File myConfigFile) {
		try{
			FileReader reader = new FileReader(myConfigFile); 
			BufferedReader bReader = new BufferedReader(reader); //this is a has-a relationship
			//no inheritance this is composition
			
			String newLine = bReader.readLine();
			
			while(newLine !=null){
				System.out.println(newLine);
				newLine = bReader.readLine();
			}
			
		} catch (FileNotFoundException e)
		{
			e.printStackTrace();
			} catch (IOException e){
				
			}
	}
	public static void writeToFile(File myConfigFile) {
		PrintWriter wrt = null;
		try {
			wrt = new PrintWriter(myConfigFile);
			wrt.println("Hello World!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			wrt.close();
		}
	}

}
