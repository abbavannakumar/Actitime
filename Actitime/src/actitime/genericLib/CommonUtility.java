package actitime.genericLib;
import org.openqa.selenium.WebElement;
	import java.time.Duration;
	import java.util.List;
	import java.util.Random;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class CommonUtility {		
		public int getRandomNum()
		{
			Random r= new Random();
			int num=r.nextInt(10000);
			return num;
		}
		public void cancelalert(WebDriver driver)
		{
			Alert alt=driver.switchTo().alert();
			alt.dismiss();
		}
		public String alerthmsg(WebDriver driver)
		{
			Alert alt=driver.switchTo().alert();
			String msg=alt.getText();
			return msg;
		}
		
		public void getselectbyvisibletext(WebElement dropdown,String visibletext)
		{
			Select s=new Select(dropdown);
					s.selectByVisibleText(visibletext);
		}
		
		public void getselectbyindex(WebElement dropdown,int index)
		{
			Select s=new Select(dropdown);
			s.selectByIndex(index);
		}
		
		public void getselectbyvalue(WebElement dropdown,String value)
		{
			Select s=new Select(dropdown);
			s.selectByValue(value);
		}
		
		public void getselectbyoption(WebElement dropdown, String option)
		{
			Select s=new Select(dropdown);
			s.getOptions();
		}
		
		public void explicitWait(WebDriver driver,By locator, String name)
		{
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.textToBePresentInElementLocated(locator,name));
		}
		public void getselectByVisibleText(WebElement dropdown,String visibleText)
		{
			Select s=new Select(dropdown);
			s.selectByVisibleText(visibleText);
		}
		public void getselectByIndex(WebElement dropdown,int index)
		{
			Select s=new Select(dropdown);
			s.selectByIndex(index);
		}
		public void getselectByValue(WebElement dropdown,String value)
		{
			Select s=new Select(dropdown);
			s.selectByVisibleText(value);
		}
		public void getOptions(WebDriver driver,By locator)
		{
			WebElement dropdown=driver.findElement(locator);
			Select s=new Select(dropdown);
			List<WebElement> allist=s.getOptions();
		}

		
		
		
		
		
	}
