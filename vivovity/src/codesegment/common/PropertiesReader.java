package codesegment.common;

import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

	public static void main(String[] args) {
		 Properties prop = new Properties();
		 try {
			String path1 = Thread.currentThread().getContextClassLoader().getResource(".").getPath();
		    String path2 = PropertiesReader.class.getClassLoader().getResource(".").getPath();
		    String path3 = PropertiesReader.class.getResource(".").getPath();
		    System.out.println(path1);  
		    System.out.println(path2);  
		    System.out.println(path3);  
			prop.load(PropertiesReader.class.getClassLoader().getResourceAsStream("config.properties"));
			System.out.println(prop.getProperty("user"));  
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
