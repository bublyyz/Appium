package com.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utiles {
	
	
	
	public Properties getPropertiesObj() throws IOException  {
		Properties pObj = null;
		try {
			FileInputStream fis = new FileInputStream(".//src//test//java//com//config//config.properties");
			 pObj = new Properties();
			pObj.load(fis);
			
		} catch (FileNotFoundException e) {

		}
		return pObj;
		
	}

}
