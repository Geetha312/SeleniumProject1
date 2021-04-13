package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeaveType1 
{

	public WebDriver driver;
	
	@FindBy(xpath="//span[.='Create Leave Type']")
	private WebElement createleavetype;
	
	
	public CreateLeaveType1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	public void CreateLeaveTy()
	{
		createleavetype.click();
	}
	
	
}
