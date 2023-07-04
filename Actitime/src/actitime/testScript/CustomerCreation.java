package actitime.testScript;

import org.openqa.selenium.By;

import actitime.genericLib.BaseClass;
import java.io.IOException;
	
import org.testng.annotations.Test;
	



	public class CustomerCreation extends BaseClass {

			@Test
			public void createCustomer() throws IOException {
				
				
	         String customerName=du.getdataFromExcelsheet("Sheet1", 0, 1);
				int num=cu.getRandomNum();
				customerName=customerName+num;
				
				
				driver.findElement(By.id("container_tasks")).click();
				
				driver.findElement(By.className("ellipsis")).click();
				
				driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
				
				driver.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(customerName);
				
				driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("good");
				driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
				cu.explicitWait(driver,By.cssSelector(".titleEditButtonContainer>title"),customerName);
			    String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>title")).getText();
				System.out.println(actualcustomername);
			}
		}


