package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	//when we create object for this class this constructor invoke automatically(then we need to provide driver).
	public HomePage(WebDriver driver){
		super(driver);
	
	}
	
	
	@FindBy(xpath="//span[@class='caret']") WebElement MyAccount;
	@FindBy(xpath="//a[normalize-space()=\"Register\"]") WebElement register;
	
	
	@FindBy(xpath="(//a[normalize-space()='Login'])[1]") WebElement login;
	
	
	
	public void clkMyAccount() {
		MyAccount.click();
	}
	
	public void register() {
		register.click();
	}
	
	
	
	
	public void login_link() {
		login.click();
	}
	
}
