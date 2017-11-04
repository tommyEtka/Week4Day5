package labNumber15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CountriesList {


	public static void writeToFile(File myCountriesFile) {
		PrintWriter wrt = null;

		try { 

			wrt = new PrintWriter(myCountriesFile); 

			wrt.println("India");
			wrt.println("The United States");
			wrt.println("China");
			wrt.println("Rwanda");
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		
		} finally {
			wrt.close();
		}
	

}}
