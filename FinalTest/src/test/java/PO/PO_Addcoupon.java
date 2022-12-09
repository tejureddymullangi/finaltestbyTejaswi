package PO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PO_Addcoupon {
	WebDriver driver;
	public PO_Addcoupon(WebDriver driver) {
		this.driver=driver;
		
	}
	 @FindBy(how = How.XPATH, using="//*[@id=\"useremail\"]")
	    WebElement UserEmail;
	    
	    @FindBy(how = How.XPATH, using="//*[@id=\"password\"]")
	    WebElement Password;
	    
	    @FindBy(how = How.XPATH, using="//*[@id=\"LoginForm\"]/button")
	    WebElement Signin;
	    
	    @FindBy(how = How.XPATH, using=" /html/body/div[1]/div/div[1]/ul/li[8]/a")
	    WebElement Coupon;
	    
	    @FindBy(how = How.XPATH, using=" /html/body/div[3]/div/div/div[2]/div/div/div/div[1]/a")
	    WebElement AddCoupon;
	    
	    @FindBy(how = How.XPATH, using="//*[@id=\"coupon_name\"]")
	    WebElement AddedCoupon1;
	    
	    @FindBy(how = How.XPATH, using=" //*[@id=\"addcategory\"]/div/div[2]/div/div/button")
	    WebElement Add;
	    
	    @FindBy(how = How.XPATH, using=" //*[@id=\"bootstrap-data-table-export\"]/tbody/tr[1]/td[5]/a")
	    WebElement Action;
	    
	    @FindBy(how = How.XPATH, using="//*[@id=\"addcategory\"]/div/div[2]/div/div/button")
	    WebElement update;
	    
	    public void Enter_Uemail(String Uemail) {
	        UserEmail.sendKeys(Uemail);
	    }
	    
	    public void Enter_Password(String Pw) {
	        Password.sendKeys(Pw);
	    }
	    public void Click_Signin() {
	        Signin.click();
	    }
	    public void Click_couponl() {
	    	Coupon.click();
	    }
	    public void Click_Addcoupon() {
	    	AddCoupon.click();
	    }
	    public void Enter_Addco(String Addco1) {
	    	AddedCoupon1.sendKeys(Addco1);
	    }
	    	public void Click_Add() {
		    	Add.click();
	    	}
	    	public void Click_Action() {
		    	Action.click();
	    }
	    	public void Click_Update() {
		    	update.click();
	    	}
	    public void Valid_Login(String Uemail,String Pw,String Addco1) {
	    	try {
	    		Enter_Uemail(Uemail);
	    		Enter_Password(Pw);
	    		Click_Signin();
	    		Click_couponl();
	    		Click_Addcoupon();
	    		Enter_Addco(Addco1);
	    		Click_Add();
	    		Click_Action();
	    		Click_Update();
	    	}catch(Exception ex) {
	    		ex.printStackTrace();
	    	}
	  }
	    public void InValid_Login(String Uemail,String Pw,String Addco1) {
	    	try {
	    		Enter_Uemail(Uemail);
	    		Enter_Password(Pw);
	    		Click_Signin();
	    		Click_couponl();
	    		Click_Addcoupon();
	    		Enter_Addco(Addco1);
	    		Click_Add();
	    		Click_Action();
	    		Click_Update();
	    	}catch(Exception ex) {
	    		ex.printStackTrace();
	    	}
	  }
	   public void InValidAllCapital(String Uemail,String Pw,String Addco1) {
	    	try {
	    		Enter_Uemail(Uemail);
	    		Enter_Password(Pw);
	    		Click_Signin();
	    		Click_couponl();
	    		Click_Addcoupon();
	    		Enter_Addco(Addco1);
	    		Click_Add();
	    		Click_Action();
	    		Click_Update();
	    	}catch(Exception ex) {
	    		ex.printStackTrace();
	    	}
	  }
	    public void InValidBlank(String Uemail,String Pw,String Addco1) {
	    	try {
	    		Enter_Uemail(Uemail);
	    		Enter_Password(Pw);
	    		Click_Signin();
	    		Click_couponl();
	    		Click_Addcoupon();
	    		Enter_Addco(Addco1);
	    		Click_Add();
	    		Click_Action();
	    		Click_Update();
	    	}catch(Exception ex) {
	    		ex.printStackTrace();
	    	}
	  }
	   public void InValidLowercase(String Uemail,String Pw,String Addco1) {
	    	try {
	    		Enter_Uemail(Uemail);
	    		Enter_Password(Pw);
	    		Click_Signin();
	    		Click_couponl();
	    		Click_Addcoupon();
	    		Enter_Addco(Addco1);
	    		Click_Add();
	    		Click_Action();
	    		Click_Update();
	    	}catch(Exception ex) {
	    		ex.printStackTrace();
	    	}
	  }
	    public void InValidSpecialchar(String Uemail,String Pw,String Addco1) {
	    	try {
	    		Enter_Uemail(Uemail);
	    		Enter_Password(Pw);
	    		Click_Signin();
	    		Click_couponl();
	    		Click_Addcoupon();
	    		Enter_Addco(Addco1);
	    		Click_Add();
	    		Click_Action();
	    		Click_Update();
	    	}catch(Exception ex) {
	    		ex.printStackTrace();
	    	}
	  }
	    public void InValidSymbols(String Uemail,String Pw,String Addco1) {
	    	try {
	    		Enter_Uemail(Uemail);
	    		Enter_Password(Pw);
	    		Click_Signin();
	    		Click_couponl();
	    		Click_Addcoupon();
	    		Enter_Addco(Addco1);
	    		Click_Add();
	    		Click_Action();
	    		Click_Update();
	    	}catch(Exception ex) {
	    		ex.printStackTrace();
	    	}
	  }
	    

}

	