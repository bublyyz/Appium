package samplePro;

import java.util.Set;

import org.testng.annotations.Test;

import com.genericlib.Baseclass;

public class HopScotchClass extends Baseclass {
	
	@Test
	public void sampleHop() throws Exception{
		try{
			
			//Set<String> contextset=ad.getContextHandles();
			String cs=ad.getContext();
			System.out.println(cs);
			//for(String cs:contextset){
				if(cs.contains("WEBVIEW")){
					//ad.context("WEBVIEW");
					System.out.println("Its webview");
				}
				else
				{
					System.out.println("Its native");
				}
			//}
			
			
			
		}catch(Exception e){
			
		}
	
	}
}
