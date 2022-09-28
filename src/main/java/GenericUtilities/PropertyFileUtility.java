package GenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
/**
 * This class will read data from property file and return the value to user
 * @author Asus
 *
 */
public class PropertyFileUtility {
	
	/**
	 * This class will read data from property file for the key and return the value
	 * @param key
	 * @return
	 * @throws Throwable
	 */
	
	public String readDataFromPropertyFile(String key) throws Throwable
	{
		FileInputStream fis=new FileInputStream(IpathInstance.FilePath);
		Properties pLib=new Properties();
		pLib.load(fis);
		String value = pLib.getProperty(key);
		return value;
	}

}
