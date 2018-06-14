package samplePro;

import org.testng.annotations.Test;

import com.genericlib.Baseclass;

public class PopupHandling extends Baseclass{

	@Test
	public void popup() throws Exception{
		try{
			Thread.sleep(2000);
			ad.get("https://www.hobbyrani");
			Thread.sleep(15000);
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	
	

}
