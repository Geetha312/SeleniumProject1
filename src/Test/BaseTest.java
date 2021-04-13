package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Generics.LoginPOM;
import Generics.AutoConstant;
import Generics.CreateLeaveType2;

public class BaseTest implements AutoConstant
{

	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(Chrome_Key, Chrome_Value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	@BeforeMethod
	public void logintoapp() throws IOException
	{
		LoginPOM login=new LoginPOM(driver);
		login.loginMethod();
	}
	
	
	
/*	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}*/
	
}
