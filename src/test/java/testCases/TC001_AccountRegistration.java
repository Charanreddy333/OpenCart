package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class TC001_AccountRegistration extends BaseTest{
	
	@Test
	public void Accountregistration() {
		
		logger.info("******** TC001_Account registration test*******");
		
		HomePage hp = new HomePage(driver);
		hp.clkMyAccount();
		hp.register();
		
		logger.info("******** staring testcase*******");
		
		RegisterPage rp = new RegisterPage(driver);
		BaseTest bt = new BaseTest();
		rp.SetFirstName(bt.RandomAlpha(5));
		rp.SetLastName(bt.RandomAlpha(3));
		rp.Setemail(bt.RandomAlphaNum(3, 2)+"@gmail.com");
		rp.Settel_no(bt.RandomNum(10));
		String pwd = bt.RandomAlphaNum(3, 3);
		rp.SetPassword(pwd);
		rp.SetPasswordagain(pwd);
		rp.SetSub_YN();
		rp.Setagree_con();
		rp.Clickcontinu();
		
		//success page
		String sms = rp.TxtConMessage();
		AssertJUnit.assertEquals(sms, "Your Account Has Been Created!");
		
		logger.info("******** ending testcase*******");
		
		rp.continue2();
	}
}
