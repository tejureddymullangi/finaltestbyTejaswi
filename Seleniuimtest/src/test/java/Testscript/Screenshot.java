package Testscript;
import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
   public static void main(String[] args) {
        // TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
        try {
        	System.setProperty("webdriver.chrome.driver","C:\\Users\\TM69989\\eclipse-workspace\\Selenium_Sample\\chromedriver.exe");    
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.nopcommerce.com/en");
            driver.manage().window().maximize();
          
            
            WebElement usericon=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li)[3]"));
            WebElement registerlink=driver.findElement(By.xpath("((//ul[@class='navigation-top-menu-sublist'])[6]/li)[2]"));
            Actions action=new Actions(driver);
            
            action.moveToElement(usericon);
        
            action.click(registerlink).build().perform();
       
            WebElement Fn=driver.findElement(By.xpath("//input[@id='FirstName']"));
            WebElement Lastname=driver.findElement(By.id("LastName"));
            Fn.sendKeys("Tejaswi");
       
            Lastname.sendKeys("Mullangi");
       
          
	        
        File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(screenShotFile, new File(".//Screenshots/screen.png"));
        //driver.quit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}