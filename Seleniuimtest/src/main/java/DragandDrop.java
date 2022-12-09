

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			WebElement Droppablebutton=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]"));
			Droppablebutton.click();
			WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
			driver.switchTo().frame(frame);
			WebElement Drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
			Thread.sleep(1000);
			System.out.println("Drag");
			WebElement Drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
			Thread.sleep(1000);
			System.out.println("Drop");
			Thread.sleep(1000);
			Actions action =new Actions(driver);
			action.dragAndDrop(Drag,Drop).build().perform();
		}
		catch(Exception ex)
		{
	ex.printStackTrace();
        }
		}
	}


