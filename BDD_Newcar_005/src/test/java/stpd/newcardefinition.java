package stpd;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Base.base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageo.pageob;

public class newcardefinition extends base {
	WebDriver driver;
	@Given("^Initialize the browser with chrome$")
	public void initialize_the_browser_with_chrome() throws Throwable {
		
		driver=initializeDriver();
		
		driver.manage().window().maximize();   
	}

	@When("^User navigate to Newcar website$")
	public void user_navigate_to_Newcar_website() throws Throwable {
		driver.get("https://www.newcars.com/");
		
		driver.findElement(By.id("qq_make_id")).click();
	}

	@Then("^User should be able to see all car in mention location$")
	public void user_should_be_able_to_see_all_car_in_mention_location() throws Throwable {
		
		pageob Po=new pageob(driver);
		Po.Make().click();
		Po.Honda().click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Po.model().click();
		Po.Option().click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Po.bodytype().click();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Po.Body().click();
		Po.Year().click();
		Po.Zip().sendKeys("30004");
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Po.Click().click();
		
		
		
	}

	@Then("^close browsers$")
	public void close_browsers() throws Throwable {
		
		driver.quit();
	    
	}


}
