package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.Country;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CountryStepDefinition {
	public WebDriver driver;
	public Country lp;
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    
		try {
			WebDriverManager.chromedriver().setup();
			//System.setProperty("Web.driver.chromedriver", "C:\\Users\\TM69989\\eclipse-workspace5\\Ecommerce\\chromedriver.exe");
			Thread.sleep(2000);
			driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
		     
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		lp = new Country(driver);
	}
	
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User  enters Emails as {string} and password as {string}")
	public void user_enters_emails_as_and_password_as(String uname1, String password1) {
	    
		lp.enterEmailAndPassword(uname1, password1);
        
	}

	@When("click on Login")
	public void click_on_login() {
	   
		lp.ClickLogin();
		
	}
	@Then("click on Locations")
	public void click_on_locations() {
	    lp.ClickLocations();
	}

	@Then("click on country")
	public void click_on_country() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		lp.Click_country();
	}

	@Then("click on add country")
	public void click_on_add_country() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		lp.Click_addcountry();
	}

	@Then("user enters country as {string}")
	public void user_enters_country_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		lp.Enter_country(string);
	}
	@Then("clicks on add")
	public void clicks_on_add() {
	    lp.Click_addbuttons();
	}


	@Then("close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		driver.close();
	}


}
