package framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProp {
	
	public static String readData(String filename,String propertyName) {
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Config\\"+filename);
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(propertyName);
	}

}
