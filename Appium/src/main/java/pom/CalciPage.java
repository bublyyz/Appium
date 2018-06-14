package pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalciPage
{
	
	//@FindBy(xpath="//android.widget.ImageButton[@text='8']")
	@FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'digit8')]")
	WebElement digit8;
	
	//@FindBy(id="com.android.calculator2:id/op_sub")
	@FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'minus')]")
	private WebElement sub;
	
	//@FindBy(id="com.android.calculator2:id/digit_5")
	@FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'digit5')]")
	private WebElement digit5;
	
	//@FindBy(id="com.android.calculator2:id/result")
	@FindBy(xpath="//android.widget.ImageButton[contains(@resource-id,'equal')]")
	private WebElement equal;
	
	@FindBy(xpath="//android.widget.EditText")
	private List<WebElement> result;
	
	public CalciPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void subtract()
	{
		digit8.click();
		sub.click();
		digit5.click();
		equal.click();
		
		System.out.println(result.get(1).getText());
		

	}
	

}
