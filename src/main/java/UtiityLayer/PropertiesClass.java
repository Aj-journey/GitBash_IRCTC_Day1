package UtiityLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import BaseLayer.BaseClass;

public class PropertiesClass extends BaseClass{

	public static String getPropertyM(String Keyname) throws IOException
	{
		Properties prop = new Properties();
		
		String path=System.getProperty("user.dir")+"/src/main/java/ConfigurationLayer/config.properties";
	
		try {
			FileInputStream fis = new FileInputStream(path);
			
			prop.load(fis);
			
			return prop.getProperty(Keyname);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
