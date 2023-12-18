package TestNG;

import org.testng.annotations.Test;

import base_Package.Common;

import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;

public class Handling_Multiple_Windows extends Common {
  @Test
  public void verifywindowhandles() {
	  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("https://phptravels.com/")));
	String parentwind=  driver.getWindowHandle();
	System.out.println("parentw:"+parentwind);
	driver.findElement(By.xpath("//li/a[text()='Sign Up']")).click();
Set<String > wind=	driver.getWindowHandles();
System.out.println(wind);
	
	   
  
  

  
  
  
  
  } {
  }
  @BeforeTest
  public void beforeTest() {
	  setup("https://phptravels.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
