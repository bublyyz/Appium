package samplePro;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.genericlib.Baseclass;

public class HopScotchScenarios extends Baseclass{
	 
		
		//@Test
		public void searchTest() throws Exception{
			
			try{
				Thread.sleep(3000);
					ad.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'in.hopscotch.android:id/sortingTileImage')]")).click();
					Thread.sleep(3000);
					ad.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'in.hopscotch.android:id/itcAgeGroupName')]")).click();
					Thread.sleep(5000);
					//ad.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'in.hopscotch.android:id/bottom_navigation_item_icon') and @instance='2']")).click();
					//ad.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'Close sort view')]")).click();
					List<WebElement> sbtn=ad.findElements(By.xpath("//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
					sbtn.get(1).click();
					Thread.sleep(3000);
					WebElement sbox = ad.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'in.hopscotch.android:id/search_btn_tv')]"));
					Thread.sleep(3000);
					sbox.click();
					Thread.sleep(3000);
					/*Robot r=new Robot();
					r.keyPress(KeyEvent.VK_SHIFT);
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_SHIFT);
					r.keyRelease(KeyEvent.VK_ENTER);*/
					sbox.sendKeys("dress");
					Thread.sleep(10000);
					//r.keyPress(KeyEvent.VK_ENTER);
					sbox.sendKeys(Keys.ENTER);
					Thread.sleep(5000);
					System.out.println("hiij");
				
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
			
			@Test
			public void LoginTest() throws Exception{
				
				try{
					Thread.sleep(3000);
						ad.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'in.hopscotch.android:id/sortingTileImage')]")).click();
						Thread.sleep(3000);
						ad.findElement(By.xpath("//android.widget.TextView[contains(@resource-id,'in.hopscotch.android:id/itcAgeGroupName')]")).click();
						Thread.sleep(5000);
						//ad.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'in.hopscotch.android:id/bottom_navigation_item_icon') and @instance='2']")).click();
						//ad.findElement(By.xpath("//android.widget.ImageView[contains(@content-desc,'Close sort view')]")).click();
						List<WebElement> sbtn=ad.findElements(By.xpath("//android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView"));
						sbtn.get(3).click();
						Thread.sleep(3000);
						
				}catch(Exception e){
					e.printStackTrace();
					
				}
		
		}
			
}
