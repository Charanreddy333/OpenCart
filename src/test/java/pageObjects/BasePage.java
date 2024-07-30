package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


//constructor
//locators
//actions

public class BasePage {

	 WebDriver driver;
	
	BasePage(WebDriver driver){
		this.driver=driver;
	             					//writing locators in pagafactory way....	
		PageFactory.initElements(driver, this);
		
	}

}
