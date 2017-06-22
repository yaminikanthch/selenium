package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;
public class Home_Page extends BaseClass{
	private static WebElement element = null;

	public Home_Page(WebDriver driver){
		super(driver);
	}    
	public static WebElement lnk_MyAccount() throws Exception{
		try{ 
			element = driver.findElement(By.xpath("/html/body/div[1]/div/header/a[3]"));
			element.click();			
			Log.info("My Account link is found on the Home Page");
		}catch (Exception e){
			Log.error("My Acocunt link is not found on the Home Page");
			throw(e);
		}
		return element;
	}
	public static WebElement lnk_LogOut() throws Exception{
		try{
			element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/ul/div[2]/button"));
			element.click();
			Log.info("Log Out link is found on the Home Page");
//			driver.close();
		}catch (Exception e){
			Log.error("Log Out link is not found on the Home Page");
			throw(e);
		}
		return element;
	}

}

