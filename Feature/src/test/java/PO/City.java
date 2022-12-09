package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class City {
public WebDriver ldriver;
    
    public City(WebDriver ldriver) {
        PageFactory.initElements(ldriver,this);
    }
    
@FindBy(xpath = "/html/body/div/div/div/div/div/div[2]/form/div[1]/input")
@CacheLookup
WebElement txtEmail;



@FindBy(xpath = "/html/body/div/div/div/div/div/div[2]/form/div[2]/input")
@CacheLookup
WebElement txtPassword;



@FindBy(xpath = "//*[@id=\"LoginForm\"]/button")
@CacheLookup
WebElement btnLogin;
@FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/a")
@CacheLookup
WebElement Location;

@FindBy(xpath = "/html/body/div[1]/div/div[1]/ul/li[2]/ul/li[3]/a")
@CacheLookup
WebElement city;


@FindBy(xpath = "/html/body/div[3]/div/div/div[2]/div[2]/div/div/div[1]/a")
@CacheLookup
WebElement addcity;

@FindBy(xpath = "//*[@id=\"city\"]")
@CacheLookup
WebElement enter_city;

@FindBy(xpath = "//*[@id=\"addCity\"]/div/div[2]/div/div/button")
@CacheLookup
WebElement add_button;





public void enterEmailAndPassword(String str1, String str2) {
	txtEmail.sendKeys(str1);
	txtPassword.sendKeys(str2);
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
public void Click_city()
{
	city.click();
}
public void Click_addcity()
{
	addcity.click();
}
public void Enter_city(String city)
{
	enter_city.sendKeys(city);
}
public void Click_addbuttons()
{
	add_button.click();
}



}
