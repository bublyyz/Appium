package samplePro;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.genericlib.Baseclass;

import io.appium.java_client.android.AndroidDriver;

public class Camara extends Baseclass
{
	@Test
	public void operations()
	{

//
//			ad.findElement(By.id("com.android.calculator2:id/digit_2")).click();
//		  ad.findElement(By.id("com.android.calculator2:id/op_sub")).click();			
//		  ad.findElement(By.id("com.android.calculator2:id/digit_9")).click();
			ad.findElement(By.className("android.widget.RelativeLayout")).click();

	
	}
	
	
}
