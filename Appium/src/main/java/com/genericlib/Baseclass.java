package com.genericlib;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.android.AndroidDriver;

public class Baseclass {
	Utiles uLib = new Utiles();
	public static AndroidDriver ad;
	
	@BeforeMethod
	public void configBm(Method m) throws IOException{
		String testName = m.getName();
		Properties pObj = uLib.getPropertiesObj();
		
		
		
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Gionee P4");
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "4.4.2");
		capabilities.setCapability("appPackage", "in.hopscotch.android");
		capabilities.setCapability("appActivity", "in.hopscotch.android.activity.SplashActivity");
		//capabilities.setCapability("appActivity", "com.gionee.gallery.sb.app.GnGallery");
		//capabilities.setCapability("appPackage", "com.gionee.gallery");
		//capabilities.setCapability("browserName", "chrome");
		
		//capabilities.setCapability("appActivity", pObj.getProperty(testName+";appActivity"));
		//capabilities.setCapability("appPackage", pObj.getProperty(testName+";appPackage"));
		ad= new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		ad.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//ad.unlockDevice();
		
		
		
		
	}

}
