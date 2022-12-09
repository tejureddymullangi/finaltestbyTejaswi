package Testscript;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HometoUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.nopcommerce.com/en");
			driver.manage().window().maximize();
			WebElement usericon=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li)[3]"));
	        WebElement registerlink=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
	        Actions action=new Actions(driver);
	        
	        action.moveToElement(usericon);
	        Thread.sleep(3000);
	        action.click(registerlink).build().perform();
	        Thread.sleep(5000);
	        
		}
	
	catch(Exception ex)
	{
ex.printStackTrace();
    }

	}
}

