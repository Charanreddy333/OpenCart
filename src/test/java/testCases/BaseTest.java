package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.Logger;


public class BaseTest {

	WebDriver driver;
    public Logger logger;
	@BeforeClass
	@Parameters("browser")//parallel testing
	public void SetUp(String br) throws IOException {
		
		//config.properies
		FileInputStream file = new FileInputStream("./src//test//resources//config.properties");
		Properties p = new Properties();
		p.load(file);
		
		//parallel
		switch (br) {
			case "chrome" : driver=new ChromeDriver();break;
			case "safari" : driver = new SafariDriver(); break;
			
		}
	    logger = LogManager.getLogger(this.getClass());
		driver = new ChromeDriver();
		driver.get(p.getProperty("url2"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public void Teardown() {
		driver.quit();
	}
	
	//random data
	public String RandomAlpha(int a) {
		
		String alpha = RandomStringUtils.randomAlphabetic(a);
		return alpha;
	}
	
	public String RandomNum(int n) {
		
		String nume  = RandomStringUtils.randomNumeric(n);
		return nume;
	}
	
	public String RandomAlphaNum(int a, int b) {
		
		String one = RandomStringUtils.randomAlphabetic(a);
		String two = RandomStringUtils.randomNumeric(b);
		
		return one+two;
		
	}
	
}
