package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PO.City;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CityStepDefinition {
	public WebDriver driver;
	public City lp;
	
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
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
		lp = new City(driver);
	}
	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("User  enters Emails as {string} and password as {string}")
	public void user_enters_emails_as_and_password_as(String uname, String password) {
	    
		lp.enterEmailAndPassword(uname, password);
        
	}

	@When("click on Login")
	public void click_on_login() {
	   
		lp.ClickLogin();
		
	}
	@Then("click on Locations")
	public void click_on_locations() {
	    lp.ClickLocations();
	}

	@Then("click on city")
	public void click_on_city() {
	   lp.Click_city();
	}

	@Then("click on add city")
	public void click_on_add_city() {
	    lp.Click_addcity();
	}

	@Then("user enters city as {string}")
	public void user_enters_city_as(String City) {
	    lp.Enter_city(City);
	}

	@Then("clicks on add")
	public void clicks_on_add() {
	    lp.Click_addbuttons();
	}

}
