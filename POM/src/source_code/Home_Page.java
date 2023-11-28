package source_code;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import datasheet.Data;
public class Home_Page extends Data
{
WebDriver driver;
@FindBy(id="twotabsearchtextbox")
WebElement searchbox;
@FindBy(id="nav-search-submit-button")
WebElement searchbutton;
@FindBy(xpath="(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")
WebElement mobile;
public void search() throws EncryptedDocumentException, IOException
{
	searchbox.sendKeys(value1);
}
public void searchclick()
{
	searchbutton.click();
}
public void mobile()
{
	mobile.click();
}
public Home_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
