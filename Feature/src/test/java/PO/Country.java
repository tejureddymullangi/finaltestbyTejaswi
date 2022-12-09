package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Country {
public WebDriver ldriver;
    
    public Country(WebDriver ldriver) {
        PageFactory.initElements(ldriver,this);
    }
    
@FindBy(xpath = "//*[@id=\"useremail\"]")
@CacheLookup
WebElement txtEmail;



@FindBy(xpath = "//*[@id=\"password\"]")
@CacheLookup
WebElement txtPassword;



@FindBy(xpath = "//*[@id=\"LoginForm\"]/button")
@CacheLookup
WebElement btnLogin;

@FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/a")
@CacheLookup
WebElement Location;

@FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[1]/a")
@CacheLookup
WebElement country;


@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
@CacheLookup
WebElement addcountry;

@FindBy(xpath = "//*[@id=\"Country\"]")
@CacheLookup
WebElement enter_country;

@FindBy(xpath = "//*[@id=\"addCountry\"]/div/div[2]/div/div/button")
@CacheLookup
WebElement add_button;


public void enterEmailAndPassword(String str3, String str4) {
	txtEmail.sendKeys(str3);
	txtPassword.sendKeys(str4);
	//btnLogin.click();
}
public void ClickLogin()
{
	btnLogin.click();
}
public void ClickLocations()
{
	Location.click();
}
public void Click_country()
{
	country.click();
}
public void Click_addcountry()
{
	addcountry.click();
}
public void Enter_country(String city)
{
	enter_country.sendKeys(city);
}
public void Click_addbuttons()
{
	add_button.click();
}



}



