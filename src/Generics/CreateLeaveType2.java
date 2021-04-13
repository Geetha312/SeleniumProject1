package Generics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeaveType2 
{

	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
	private WebElement LeaveTy;
	
	
	@FindBy(xpath="//div[@class='buttonIcon']")
	private WebElement Leavesubmit;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logout;
	
	public CreateLeaveType2(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void enterleave()
	{
		LeaveTy.sendKeys("XYZ");
	}

	
	public void Leavesub()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",Leavesubmit);
	}
	

	public void logout()
	{
		logout.click();	
	}
	
}
