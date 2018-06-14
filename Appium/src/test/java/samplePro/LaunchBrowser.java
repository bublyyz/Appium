package samplePro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericlib.Baseclass;

import io.appium.java_client.MobileElement;

public class LaunchBrowser extends Baseclass{

	@Test
	public void lauchChrome() throws Exception{
		try{
		//UiSelector ui=new UiSelector();
		//String search="android.widget.Spinner";
		ad.get("https://www.google.com");
		Thread.sleep(15000);
		//ad.findElementByAndroidUIAutomator("new UiSelector().index(0)");
		//ad.findElementByAndroidUIAutomator("new UiSelector().className("+search+")");
		//ad.findElementByAndroidUIAutomator("new UiSelector().description("+"Search"+")");
		//ad.findElement(By.xpath("//android.widget.Spinner")).sendKeys("nature images");
		//ad.findElement(By.xpath("//android.widget.Spinner[@content-desc='Search']")).sendKeys("nature images");
		//ad.findElement(By.xpath("//android.widget.Spinner[@index='0']")).sendKeys("nature images");
		//ad.findElementByClassName("android.widget.Spinner").sendKeys("nature images");
		//ad.findElement(By.className("android.widget.Spinner")).sendKeys("nature images");
		//ad.findElement(By.xpath("//View[@id='n0tgWb']//Spinner[1]")).sendKeys("nature images");
		//ad.findElement(By.xpath("//Spinner{Search}")).sendKeys("nature images");
		//WebElement searchbox=ad.findElementByClassName("android.widget.EditText");
		//WebElement searchbox=ad.findElementByXPath("//android.support.v7.widget.RecyclerView[@content-desc="+"New tab"+"]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText");
		//WebElement searchbox=ad.findElementById("com.android.chrome:id/search_box_text");
		System.out.println("waited for 15 seconds");
		//MobileElement els1 = (MobileElement) ad.findElementByAccessibilityId("com.android.chrome:id/search_box_text");
		////*[@id="sourceContainer"]/ul/li/ul/li[1]/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li[3]/ul/li[2]/ul/li/ul/li[1]/ul/li[2]/ul/li[1]/span[2]/span/span/b
		//<b class="Inspector__sourceTag___2A6C8">android.widget.EditText</b>
		//#sourceContainer > ul > li > ul > li:nth-child(1) > ul > li > ul > li > ul > li > ul > li > ul > li > ul > li:nth-child(3) > ul > li:nth-child(2) > ul > li > ul > li:nth-child(1) > ul > li:nth-child(2) > ul > li:nth-child(1) > span.ant-tree-node-content-wrapper.ant-tree-node-content-wrapper-normal.ant-tree-node-selected > span > span > b
		//<b class="Inspector__sourceTag___2A6C8">android.widget.EditText</b>
		//MobileElement els1 = (MobileElement) ad.findElementByClassName("Inspector__sourceTag___2A6C8");
		//List<MobileElement> els1 = (List<MobileElement>) ad.findElementsById("com.android.chrome:id/search_box_text");
		//MobileElement els1 = (MobileElement) ad.findElementById("com.android.chrome:id/search_box_text");
		//System.out.println(els1.size());
		//WebElement els1=ad.findElement(By.xpath("//input[@title='Search']"));
		//WebElement els1=ad.findElement(By.xpath("//textarea[@name='csi']"));
		//WebElement els1 = ad.findElement(By.xpath("//android.widget.EditText[contains(@resource-id='com.android.chrome:id/search_box_text')]"));
		WebElement els1 = ad.findElement(By.xpath("//android.widget.EditText[contains(@text,'Search']"));
		Thread.sleep(10000);
		System.out.println("found element");
		els1.sendKeys("nature images");
		Thread.sleep(5000);
		els1.sendKeys(Keys.ENTER);
		//ad.findElement(By.className("android.widget.Button")).click();
		//ad.findElement(By.className("android.widget.Button")).click();
		Thread.sleep(2000);
		ad.swipe(500, 1500, 500, 500, 3);
		}catch(Exception e)
		{
			e.printStackTrace();
			//List<MobileElement> els1 = (MobileElement) driver.findElementsById("com.android.chrome:id/search_box_text");
			//(new TouchAction(driver)).tap(540, 1597).perform()
			//com.android.chrome:id/search_box_text
			//android.support.v7.widget.RecyclerView[@content-desc="New tab"]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.EditText
		}//android.widget.EditText
		//List<MobileElement> els1 = (List<MobileElement>) ad.findElementsById("com.android.chrome:id/search_box_text");
	}
}
