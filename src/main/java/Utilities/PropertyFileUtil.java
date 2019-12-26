package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
	public static String getValueForkey(String key)throws Throwable
	{
		Properties configProperties=new Properties();
		FileInputStream fi=new FileInputStream("D:\\Selenium_Frameworks\\ERP_Maven\\PropertyFile\\Environment.properties");
		configProperties.load(fi);
		return configProperties.getProperty(key);
	}

}
