package source_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whistlist_Page 
{
	WebDriver driver;
@FindBy(id="add-to-wishlist-button-submit")
WebElement whislist;
@FindBy(xpath="(//input[@class='a-button-input a-declarative'])[4]")
WebElement creat;
@FindBy(xpath="(//button[@class='a-button-text'])[1]")
WebElement countinueshopping;
public void whislist()
{
	whislist.click();
}
public void creatlist()
{
	creat.click();
}
public void countinueshopping()
{
	countinueshopping.click();
}

public Whistlist_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
