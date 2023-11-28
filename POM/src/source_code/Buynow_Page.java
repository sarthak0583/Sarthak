package source_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Buynow_Page 
{
	WebDriver driver;
    @FindBy(id="buy-now-button")
    WebElement buynow_button;
    public void buynow()
    {
    	buynow_button.click();
    }
    public Buynow_Page(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
}
