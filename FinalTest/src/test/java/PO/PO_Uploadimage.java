package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Uploadimage {
	WebDriver driver;
    public PO_Uploadimage(WebDriver driver) {
        this.driver=driver;
    }
    
    @FindBy(how = How.XPATH, using="//*[@id=\"useremail\"]")
    WebElement UserEmail;
    
    @FindBy(how = How.XPATH, using="//*[@id=\"password\"]")
    WebElement Password;
    
    @FindBy(how = How.XPATH, using="//button[@class='btn btn-primary btn-flat m-b-30 m-t-30']")
    WebElement Signin;
    
    @FindBy(how = How.XPATH, using="/html/body/div[1]/div/div[1]/ul/li[3]/a")
    WebElement Product;
    
    @FindBy(how = How.XPATH, using="/html/body/div[1]/div/div[1]/ul/li[3]/ul/li[1]/a")
    WebElement Category;
    
    @FindBy(how = How.XPATH, using="/html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
    WebElement AddCategory;
    
    @FindBy(how = How.XPATH, using="//*[@id=\"category_name\"]")
    WebElement CategoryName;
    
    @FindBy(how = How.XPATH, using="//*[@id=\"addcategory\"]/div/div[2]/div/div/div/input")
    WebElement Broswer;
    
    @FindBy(how = How.XPATH, using="//*[@id=\"bootstrap-data-table-export\"]/tbody/tr[1]/td[6]/a[1]")
    WebElement Action;
    
    @FindBy(how = How.XPATH, using="//*[@id=\"editCategory\"]/div[2]/div/button")
    WebElement Update;
    
   
    public void Enter_Uemail(String Uemail) {
        UserEmail.sendKeys(Uemail);
    }
    
    public void Enter_Password(String Pw) {
        Password.sendKeys(Pw);
    }
    
    public void Click_Signin() {
        Signin.click();
    }
    
    public void Click_Product() {
    	Product.click();
    }
    
    public void Click_Category() {
    	Category.click();
    }
    public void Enter_CategoryName1(String CategoryName1) {
    	CategoryName.sendKeys( CategoryName1);
    }
    
    public void Click_Broswer() {
    	Broswer.click();
    }
    public void Click_Action() {
    	Action.click();
}
	public void Click_Update() {
    	Update.click();
	}
   
   



   public void Valid_Login(String Uemail, String Pw, String CategoryName) {
        try {
            
            Enter_Uemail(Uemail);
            Enter_Password(Pw);
            Click_Signin();
            Click_Product();
            Click_Category();
            Enter_CategoryName1(CategoryName);    
            Click_Broswer();
            Click_Action();
            Click_Update();
                    }catch(Exception e) {
            e.printStackTrace();
        }
    }
   public void InValid_Login(String Uemail, String Pw, String CategoryName) {
       try {
           
           Enter_Uemail(Uemail);
           Enter_Password(Pw);
           Click_Signin();
           Click_Product();
           Click_Category();
           Enter_CategoryName1(CategoryName);    
           Click_Broswer();
           Click_Action();
           Click_Update();
                   }catch(Exception e) {
           e.printStackTrace();
       }
   }
}


