package Generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeaveType
{

	public WebDriver driver;
	
	@FindBy(xpath="//div[@class='popup_menu_button popup_menu_button_settings ']")
	private WebElement settings;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetype;
	
	public CreateLeaveType(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
	public void settingsclick()
	{
		settings.click();
	}
	
	
	public void typeofleave()
	{
		leavetype.click();
	}
	
	
	
}
