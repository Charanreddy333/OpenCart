package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//input[@id=\"input-firstname\"]") WebElement fname;
	@FindBy(xpath="//input[@id=\"input-lastname\"]") WebElement lname;
	@FindBy(xpath="//input[@id=\"input-email\"]") WebElement email;
	@FindBy(xpath="//input[@id=\"input-telephone\"]") WebElement tele;
	@FindBy(xpath="//input[@id=\"input-password\"]") WebElement pwd;
	@FindBy(xpath="//input[@id=\"input-confirm\"]") WebElement pwdcon;
	@FindBy(xpath="//input[@value=\"0\"]") WebElement no;
	@FindBy(xpath="//input[@name=\"agree\"]") WebElement agree;
	@FindBy(xpath="//input[@value=\"Continue\"]") WebElement con;
	@FindBy(xpath=("//*[@id=\"content\"]//h1")) WebElement txtconsms;
	@FindBy(xpath=("//a[normalize-space()=\"Continue\"]")) WebElement conti2;

	
			public void SetFirstName(String name) {
				fname.sendKeys(name);
			}
			public void SetLastName(String name) {
				lname.sendKeys(name);
			}
			public void Setemail(String eml) {
				email.sendKeys(eml);
			}
			public void Settel_no(String telno) {
				tele.sendKeys(telno);
			}
			public void SetPassword(String pwds) {
				pwd.sendKeys(pwds);
			}
			public void SetPasswordagain(String pwd) {
				pwdcon.sendKeys(pwd);
			}
			public void SetSub_YN() {
			    no.click();
			}
			public void Setagree_con() {
				agree.click();
			}
			public void Clickcontinu() {
				con.click();
			}
  
			
public String TxtConMessage() {
	   try {
		   
	       return txtconsms.getText();
	       
	       
	       }catch(Exception e)
	         {
		        return e.getMessage();
	         }
   }
			
	public void continue2() {
		conti2.click();
	}
}
