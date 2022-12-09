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

import PO.PO_Addcoupon;
import Utility.BrowserManager;

public class Coupon {
	WebDriver driver;
    JSONObject Coupon;
    
    @BeforeClass
    
    public void beforeClass() throws Exception{
        InputStream datais=null;        
        try {
            
            String filename = "Data/Coupon.json";
            datais = getClass().getClassLoader().getResourceAsStream(filename);
            JSONTokener Tokener= new JSONTokener(datais);
            Coupon = new JSONObject(Tokener);
                    
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
        	String Uemail=Coupon.getJSONObject("Valid").getString("Uemail");
            String Pw=Coupon.getJSONObject("Valid").getString("Pw");
            String Addco1=Coupon.getJSONObject("Valid").getString("Addco1");
            PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
            obj.Valid_Login(Uemail, Pw,Addco1 );
        
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
 @Test (priority=2)
 
 public void InValidData() {
     try {
     	String Uemail=Coupon.getJSONObject("InValidData").getString("Uemail");
         String Pw=Coupon.getJSONObject("InValidData").getString("Pw");
         String Addco1=Coupon.getJSONObject("InValidData").getString("Addco1");
         PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
         obj.Valid_Login(Uemail, Pw,Addco1 );
     
         
     }catch(Exception e) {
         e.printStackTrace();
     }
 }
@Test (priority=3)

public void InValidAllCapitalData() {
  try {
  	String Uemail=Coupon.getJSONObject("InValidAllCapital").getString("Uemail");
      String Pw=Coupon.getJSONObject("InValidAllCapital").getString("Pw");
      String Addco1=Coupon.getJSONObject("InValidAllCapital").getString("Addco1");
      PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
      obj.Valid_Login(Uemail, Pw,Addco1 );
  
      
  }catch(Exception e) {
      e.printStackTrace();
  }
}
@Test (priority=4)

public void InValidBlankData() {
  try {
  	String Uemail=Coupon.getJSONObject("InValidBlank").getString("Uemail");
      String Pw=Coupon.getJSONObject("InValidBlank").getString("Pw");
      String Addco1=Coupon.getJSONObject("InValidBlank").getString("Addco1");
      PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
      obj.Valid_Login(Uemail, Pw,Addco1 );
  
      
  }catch(Exception e) {
      e.printStackTrace();
  }
}
@Test (priority=5)

public void InValidLowercaseData() {
  try {
  	String Uemail=Coupon.getJSONObject("InValidLowercase").getString("Uemail");
      String Pw=Coupon.getJSONObject("InValidLowercase").getString("Pw");
      String Addco1=Coupon.getJSONObject("InValidLowercase").getString("Addco1");
      PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
      obj.Valid_Login(Uemail, Pw,Addco1 );
  
      
  }catch(Exception e) {
      e.printStackTrace();
  }
}
@Test (priority=6)

public void InValidSpecialcharData() {
  try {
  	String Uemail=Coupon.getJSONObject("InValidSpecialchar").getString("Uemail");
      String Pw=Coupon.getJSONObject("InValidSpecialchar").getString("Pw");
      String Addco1=Coupon.getJSONObject("InValidSpecialchar").getString("Addco1");
      PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
      obj.Valid_Login(Uemail, Pw,Addco1 );
  
      
  }catch(Exception e) {
      e.printStackTrace();
  }
}
@Test (priority=7)

public void InValidSymbolsData() {
  try {
  	String Uemail=Coupon.getJSONObject("InValidSymbols").getString("Uemail");
      String Pw=Coupon.getJSONObject("InValidSymbols").getString("Pw");
      String Addco1=Coupon.getJSONObject("InValidSymbols").getString("Addco1");
      PO_Addcoupon obj=PageFactory.initElements(driver, PO_Addcoupon.class);
      obj.Valid_Login(Uemail, Pw,Addco1 );
  
      
  }catch(Exception e) {
      e.printStackTrace();
  }
}

}
