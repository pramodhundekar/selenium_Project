package TestNG;

import org.testng.annotations.Test;

import base_Package.Common;

import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Orange_H_R_M extends Common {
	
  @Test
  public void login(){
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']/parent::div")).click();
	 driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']")).click();
	 driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	Actions action = new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"))).build().perform();
	 action.sendKeys(Keys.DOWN).build().perform();
	 action.sendKeys(Keys.DOWN).build().perform();
  }
  @BeforeTest
  public void beforeTest() {
	  setup("https://opensource-demo.orangehrmlive.com");
	  }
	 
  

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
