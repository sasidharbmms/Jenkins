package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static Properties readProperties() {
		String fileName = "src\\test\\resources\\config\\config.properties";
		FileInputStream fis; 
		Properties prop = null;
		
		try {
			fis = new FileInputStream(fileName);
			prop = new Properties();
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			System.out.println("The file path or file name is not correct, please check it");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prop;
	
	}
}

