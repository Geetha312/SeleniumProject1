package Generics;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM extends ExcelLibrary
{

	public WebDriver driver;
	
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keeplogcheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password']")
	private WebElement forgotpasswordlink;
	
	
	@FindBy(xpath="//a[.='actiTIME Inc.d']")
	private WebElement actitimelink;
	
	@FindBy(xpath="	//a[.='Logout']")
	private WebElement Logout;
	
	
	public LoginPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		
	}
	
	
	public void loginMethod() throws IOException
	{
	
		
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(Excel_Path,Sheet_Name,11,0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(Excel_Path,Sheet_Name,12,0));
		
		/*usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");*/
		
	    keeplogcheckbox.click();
		loginButton.click();
		
	}

	
	public void forgotpassword()
	{
		forgotpasswordlink.click();
	}
	
	public void actitimelink()
	{
		actitimelink.click();
	}


	
}

