package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties
{
	private static final String FILE_CONFIG = "\\resource\\config.properties";
		
	//private static ReadProperties instance = null;
	
	private static Properties properties = new Properties();

	/**
	 * Use singleton pattern to create ReadConfig object one time and use anywhere
	 *
	 * @return instance of ReadConfig object
	 */
	/*
	 * public static ReadProperties getInstance() { if (instance == null) { instance
	 * = new ReadProperties(); instance.readConfig(); } return instance;
	 * 
	 * }
	 */

	/**
	 * get property with key
	 *
	 * @param key
	 * @return value of key
	 */
	public static String getProperty(String key)
	{
		readConfig();
		return properties.getProperty(key);
	}

	/**
	 * read file .properties
	 */
	private static void readConfig()
	{
		InputStream inputStream = null;
		try
		{
			String currentDir = System.getProperty("user.dir");
			inputStream = new FileInputStream(currentDir + FILE_CONFIG);
			properties.load(inputStream);
		} catch (IOException e)
		{
			e.printStackTrace();
		} finally
		{
			// close objects
			try
			{
				if (inputStream != null)
				{
					inputStream.close();
				}
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
