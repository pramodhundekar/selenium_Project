package TestNG;

import org.testng.annotations.Test;

import base_Package.Common;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class NewTest236 extends Common {
  @Test
  public void f() {

	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");	
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']/parent::a")).click();
		//driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-butto
  }
  @BeforeTest
  public void beforeTest() {
	  setup("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
