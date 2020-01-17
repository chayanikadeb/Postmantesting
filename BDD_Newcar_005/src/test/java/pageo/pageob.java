package pageo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageob {
	
	WebDriver driver; 
 By Make=By.id("qq_make_id");
 By Honda=By.xpath("//option[contains(text(),'Honda')]");
 By model=By.id("ajax_model_id");
 By option=By.xpath("//*[@id=\"qq_make_id\"]/option[15]");
 By Bodytype=By.id("landing_bodytype_select");
 By Body=By.xpath("//option[contains(text(),'Sedan')]");
 By Year=By.id("year_2019");
 By Zip=By.id("qq_zipcode");
 By Click=By.xpath("//form[@name='searchForm']//a[@class='NCI_link']");
 public pageob(WebDriver driver) {

	this.driver=driver;
	 
	 
 }
 
 public WebElement Make()
	{
		return driver.findElement(Make);
	}
	
	public WebElement Honda()
	{
		return driver.findElement(Honda);
	}
	
	public WebElement model()
	{
		return driver.findElement(model);
	}
	public WebElement Option()
	{
		return driver.findElement(option);
	}
	public WebElement bodytype()
	{
		return driver.findElement(Bodytype);
	}
	public WebElement Body()
	{
		return driver.findElement(Body);
	}
	public WebElement Year()
	{
		return driver.findElement(Year);
	}
	public WebElement Zip()
	{
		return driver.findElement(Zip);
	}
	public WebElement Click()
	{
		return driver.findElement(Click);
	}
}
