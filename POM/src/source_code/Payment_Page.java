package source_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page 
{
	WebDriver driver;
@FindBy(id="pp-ECE9an-96")
WebElement creditanddebit;
@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")
WebElement netbanking;
@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[3]")
WebElement upi;
@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")
WebElement emi;
public void creditdebit()
{
	creditanddebit.click();
}
public void netbanking()
{
	netbanking.click();
}
public void upi()
{
	upi.click();
}
public void emi()
{
	emi.click();
}
public Payment_Page(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
