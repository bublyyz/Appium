package samplePro;

import org.testng.annotations.Test;

import com.genericlib.Baseclass;

import io.appium.java_client.android.AndroidDriver;
import pom.CalciPage;

public class Calculator extends  Baseclass
{
	//AndroidDriver driver;
	
	@Test
	public void testOperations()
	{
		
		CalciPage cp=new CalciPage(ad);
		cp.subtract();
	}
}
