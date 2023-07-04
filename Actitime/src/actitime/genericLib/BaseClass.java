package actitime.genericLib;

	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	

import actitime.elementRepository.LoginLocators;

 

	public class BaseClass  {
		public WebDriver driver;
		public Datautility du=new Datautility(); 
		public CommonUtility cu=new CommonUtility();
		
		@BeforeClass(alwaysRun = true)
		public void launchBrowser()
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		@BeforeMethod(alwaysRun = true)
		public void login() throws IOException
		{   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			this.driver.navigate().to(du.getdataFromProperties("url"));
			driver.get(du.getdataFromProperties("url"));
			LoginLocators ll=new LoginLocators(driver);
			ll.loginApp(du.getdataFromProperties("username"),du.getdataFromProperties("password"));
		}
		
		@AfterMethod(alwaysRun = true)
		public void logout()
		{
			driver.findElement(By.id("logoutlink")).click();
		}
		
		@AfterClass(alwaysRun = true)
		public void closeBrowser()
		{
			driver.close();
		}
	}





