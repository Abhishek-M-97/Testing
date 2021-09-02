package genericLibrary;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertyFileUtil implements IAutoConstants {
	/**
	 * pass the property name as an argument in string format to get property value
	 * @param propertyName
	 * @return String
	 * @throws IOException
	 */

	public static String PropertyFile(String propertyName) throws IOException {

		FileReader fr= new FileReader(PROPERTIES_PATH);
		Properties read = new Properties();
		read.load(fr);
		String propertyValue="";
		boolean flag=false;

		Set<String> allProperties = read.stringPropertyNames();
		for(String property:allProperties) {
			if(propertyName.equals(property)) {
				flag=true;
				break;
			}	
		}

		if(flag) {
			propertyValue=read.getProperty(propertyName);
		} else {
			System.err.println("No Property Value Found");
		}

		return propertyValue;
	}

}
