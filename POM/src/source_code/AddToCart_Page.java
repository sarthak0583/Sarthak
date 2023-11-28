package source_code;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Page
{
	WebDriver driver;
@FindBy(id="submit.add-to-cart")
WebElement addtocart_button;
public void addtocart()
{
	addtocart_button.click();
}
public AddToCart_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
