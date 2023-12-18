package TestNG;

import org.testng.annotations.Test;

import base_Package.Common;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class Handling_Alerts extends Common{
  @Test
  public void verifyalert  () throws InterruptedException {
	  driver.findElement(By.linkText("See an example alert")).click();
	  waitForAlertPresent();
//	  Alert alert=driver.switchTo().alert();
//	  alert.getText();
//	  alert.accept();
	 String text= driver.switchTo().alert().getText();
	  System.out.println("text1:"+text);
	  driver.switchTo().alert().accept();
	  driver.findElement(By.linkText("See a sample confirm")).click();
	  waitForAlertPresent();
	  text = driver.switchTo().alert().getText();
	  System.out.println("Text2: "+text);
	  driver.switchTo().alert().dismiss();
	  
	  
	  driver.findElement(By.linkText("See a sample prompt")).click();
	  waitForAlertPresent();
	  driver.switchTo().alert().sendKeys("selenium");
	  Thread.sleep(5000);
	  text=driver.switchTo().alert().getText();
	  System.out.println("text3:"+text);
	  driver.switchTo().alert().accept();
	  
	  
	  

	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  setup("https://www.selenium.dev/documentation/webdriver/interactions/alerts/");
  }

  @AfterTest
  public void afterTest() {
  }

}
