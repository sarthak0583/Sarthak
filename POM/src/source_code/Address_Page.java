package source_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page 
{
WebDriver driver;
@FindBy(id="shipToThisAddressButton")
WebElement selectaddress;
public void address()
{
	selectaddress.click();
}
public Address_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
