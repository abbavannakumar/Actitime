package actitime.elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class LoginLocators {
		
		public LoginLocators(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		
		@FindBy(id="username")
		private WebElement usernameTB;
		@FindBy(name="pwd")
		private WebElement passwordTB;
		@FindBy(xpath="//a[@id='loginButton']")
		 private WebElement loginButtonTB;
		 
		 public WebElement getusernameTB()
		 {
			 return usernameTB;
		 }
		 
		 public WebElement getpasswordTB()
		 {
			 return passwordTB;
		 }
		 
		 public WebElement getloginButtonTB()
		 {
			 return loginButtonTB;
		 }
		 
		 
		 public void loginApp(String username,String password)
		 {
			 getusernameTB().sendKeys("admin");
			 getpasswordTB().sendKeys("manager");
			 getloginButtonTB().click();
			 
			 
			 
			 
		
	}
}
