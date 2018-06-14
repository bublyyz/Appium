package samplePro;

//import java.awt.Dimension;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.genericlib.Baseclass;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;

public class GallerySwipe extends Baseclass{
	
	@Test
	public void sampleSwipe() throws Exception{
		try{
			Thread.sleep(2000);
			//WebElement els1 = ad.findElement(By.xpath("//android.view.View[contains(@text,'common_cover and @index='0']"));
			List<WebElement> els1 = ad.findElements(By.xpath("//android.view.View"));
			Thread.sleep(2000);
			els1.get(4).click();
			Thread.sleep(2000);
			//WebElement els2 = ad.findElement(By.xpath("//android.view.View[contains(@text,'file_thumb' and @index='2']"));
			els1.get(2).click();
			Thread.sleep(2000);
			//els1.click();
			Thread.sleep(3000);
			//code for swipe
			(new TouchAction(ad)).press(233, 723).moveTo(10,-538).release().perform();
			Thread.sleep(3000);
			WebElement el4 = ad.findElementById("com.gionee.gallery:id/gl_root_view");
			el4.click();
			Thread.sleep(3000);
			/*touchAction = new TouchAction((PerformsTouchActions) driver);
			touchAction.longPress(200 ,750).moveTo(200,50).release().perform();*/
			
			/*Dimension size =ad.manage().window().getSize();
			int x0 = (int) (size.getWidth());
		    int y0 = (int) (size.getHeight());
	        int x1 = (int) (size.getWidth()*0.2);
	        int y1 = (int) (size.getHeight()*0.2);
	        System.out.println(x0+" "+y0);
	        System.out.println(x1+" "+y1);
	        Thread.sleep(2000);
	        ad.zoom(x1,y1);*/
	       // ad.zoom(100, 500);
	        //reportStep("The Application is zoomed.", "PASS");
	   /* } catch (Exception e) {
	        e.printStackTrace();
	        reportStep("The Application could not be zoomed.", "FAIL");
	    }*/
			
			//TouchAction t1= new TouchAction(ad).press(271,368).waitAction(2000).moveTo(-2,-80).release();
			TouchAction t1= new TouchAction(ad).longPress(271,368).moveTo(-2,-80).release();
			/*TouchAction t2= new TouchAction(ad).press(295,392).waitAction(2000).moveTo(0,100).release();
			MultiTouchAction mt1= new MultiTouchAction(ad);
			  mt1.add(new TouchAction(ad).press(271,368)).add(new TouchAction(ad).press(295,392).moveTo(2,100)).perform();
			  Thread.sleep(10000);
			  */

		}catch(Exception e){
			e.printStackTrace();
			
		}
	
	}

}
