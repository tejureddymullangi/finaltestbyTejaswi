package TestCase;

import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PO.PO_Uploadimage;
import Utility.BrowserManager;

public class Uploadimage {
	WebDriver driver;
    JSONObject Image;
    
    @BeforeClass
    
    public void beforeClass() throws Exception{
        InputStream datais=null;        
        try {
            
            String filename = "Data/Image.json";
            datais = getClass().getClassLoader().getResourceAsStream(filename);
            JSONTokener Tokener= new JSONTokener(datais);
            Image = new JSONObject(Tokener);
                    
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    @BeforeMethod
    @Parameters({"Browser","url"})
    public void setUp(String Browser, String url) throws InterruptedException{
        driver = BrowserManager.getDriver(Browser);
        Thread.sleep(2000);
        driver.get(url);
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        
    }
 @Test (priority=1)
    
    public void ValidData() {
        try {
        	String Uemail=Image.getJSONObject("Valid").getString("Uemail");
            String Pw=Image.getJSONObject("Valid").getString("Pw");
            String AddCategoryName1=Image.getJSONObject("Valid").getString("CategoryName1");
            PO_Uploadimage obj=PageFactory.initElements(driver, PO_Uploadimage.class);
            obj.Valid_Login(Uemail, Pw,AddCategoryName1 );
        
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
 @Test (priority=2)
 
 public void InValidData() {
     try {
     	String Uemail=Image.getJSONObject("InValid").getString("Uemail");
         String Pw=Image.getJSONObject("InValid").getString("Pw");
         String AddCategoryName1=Image.getJSONObject("InValid").getString("CategoryName1");
         PO_Uploadimage obj=PageFactory.initElements(driver, PO_Uploadimage.class);
         obj.Valid_Login(Uemail, Pw,AddCategoryName1 );
     
         
     }catch(Exception e) {
         e.printStackTrace();
     }
 }


}
