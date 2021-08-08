package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.Base;

public class Rediff extends Base
	{
	
	static String SelectedCountry;
	public void openUrl() 
	{
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	public void newAccount() 
	{
		driver.findElement(By.xpath("//u[contains(text(),'Create a new account')]")).click();
	}
	public void countryDetail() 
	{	
		List<WebElement> lst=new Select(driver.findElement(By.id("country"))).getOptions();
		for(int i=0;i<lst.size();i++) 
		{
			System.out.println(lst.get(i).getText());			
		}
		System.out.println("Number of countries in the list box:"+lst.size());
	}
	public void selectCountry() 
	{
		new Select(driver.findElement(By.id("country"))).selectByVisibleText("India");
		List<WebElement> wb=new Select(driver.findElement(By.id("country"))).getAllSelectedOptions();
		SelectedCountry=wb.get(0).getText();
		System.out.println("Selected Country:"+SelectedCountry);
	}
	public void verifySelection() 
	{
		if(SelectedCountry.equals("India"))
		{
			System.out.println("Country Selected is India");
			
		}else 
		{
			System.out.println("Selected country is not india");
		}
	}
}
