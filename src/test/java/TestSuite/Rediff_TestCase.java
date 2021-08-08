package TestSuite;

import org.testng.annotations.Test;

import Pages.Rediff;

public class Rediff_TestCase 
{
	@Test
	public void testing()
	{
		Rediff obj=new Rediff();
		obj.driverSetup();
		obj.openUrl();
		obj.newAccount();
		obj.countryDetail();
		obj.selectCountry();
		obj.verifySelection();	
		obj.closeBrowser();
	}
}
