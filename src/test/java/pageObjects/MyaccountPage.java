package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends BasePage{

	 MyaccountPage(WebDriver driver){
		super(driver);
	}
	
@FindBy(xpath=("//*[@id='input-email']")) WebElement email;
@FindBy(xpath=("//input[@id=\"input-password\"]")) WebElement pass;
@FindBy(xpath=("//input[@value=\"Login\"]")) WebElement login;
	
	public void setemail(String emai) {
		email.sendKeys(emai);
	}
	
	public void setpassword(String paswo) {
		pass.sendKeys(paswo);
	}
	
	public void login_butt() {
		login.click();
	}
}
