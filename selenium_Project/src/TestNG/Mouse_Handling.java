

package TestNG;

import org.testng.annotations.Test;

import base_Package.Common;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class Mouse_Handling extends Common{
  @Test(priority=1)
  public void verifydraggable() {
 driver.findElement(By.xpath("//a[text()='Draggable']")).click();
 driver.switchTo().frame(0);
 action.clickAndHold(driver.findElement(By.id("draggable"))).build().perform();
 action.clickAndHold(driver.findElement(By.id("draggable"))).moveByOffset(120, 90).build().perform();
 driver.switchTo().defaultContent();
 
  }
  @Test(priority = 2)
  public void verifydroppable() {
	  driver.findElement(By.xpath("//a[text()='Droppable']")).click();
	  driver.switchTo().frame(0);
	 action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
	 driver.switchTo().defaultContent();
	  }
  @Test(priority=3)
  public void verifyresiable() {
	  driver.findElement(By.xpath("//a[text()='Resizable']")).click();
	 driver.switchTo().frame(0);
	 action.clickAndHold(driver.findElement(By.xpath("//h3[text()='Resizable']/following-sibling::div[3]"))).moveByOffset(110, 90).build().perform();
	 driver.switchTo().defaultContent();
  }
  @Test(priority=4)
  public void verifyselectable() {
	  driver.findElement(By.xpath("//a[text()='Selectable']")).click();
	  driver.switchTo().frame(0);
	  action.clickAndHold(driver.findElement(By.xpath("//li[text()='Item 3']"))).build().perform();
	  driver.switchTo().defaultContent();
  }
  @Test(priority = 5)
  public void verifysortable() {
	  driver.findElement(By.xpath("//a[text()='Sortable']")).click();
	  driver.switchTo().frame(0);
	  action.clickAndHold(driver.findElement(By.xpath("//li[text()='Item 5']"))).moveByOffset(0, 130).build().perform();
	  driver.switchTo().defaultContent();
  }
  @Test(priority=6)
  public void verifydialog() {
	  driver.findElement(By.xpath("//a[text()='Dialog']")).click();
	  driver.switchTo().frame(0);
	  action.click(driver.findElement(By.xpath("//button[@type='button']"))).build().perform();
	  driver.switchTo().defaultContent();
	  
  }
  @Test(priority = 7)
  public void verifymenu() {
	  driver.findElement(By.xpath("//a[text()='Menu']")).click();
	  driver.switchTo().frame(0);   
	  action.click(driver.findElement(By.xpath("//div[text()='Electronics']"))).click().build().perform();
	  driver.switchTo().defaultContent();
	  
  }
  @Test(priority=8)
  public void verifyslider() {
	  driver.findElement(By.xpath("//a[text()='Slider']")).click();
	  driver.switchTo().frame(0);
	  action.clickAndHold(driver.findElement(By.xpath("//span[@tabindex=\"0\"]"))).moveByOffset(180, 0).build().perform();
	  driver.switchTo().defaultContent();
  }
  @Test(priority=9)
  public void verifytooltip() {
	  driver.findElement(By.xpath("//a[text()='Tooltip']")).click();
	  driver.switchTo().frame(0);
	  action.moveToElement(driver.findElement(By.xpath("//a[text()='Tooltips']"))).build().perform();
	  driver.switchTo().defaultContent();
  }
  @Test(priority=10)
  public void verifyspinner() {
	  driver.findElement(By.xpath("//a[text()='Spinner']")).click();
	  driver.switchTo().frame(0);
	  action.click(driver.findElement(By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-triangle-1-s']"))).build().perform();
	  driver.switchTo().defaultContent();
  }
  @Test(priority=11)
  public void verifyeffect() {
	  driver.findElement(By.xpath("Effect")).click();
	  driver.switchTo().frame(0);
	  action.click(driver.findElement(By.xpath("//select[@name=\"effects\"]"))).build().perform();
	  driver.switchTo().defaultContent();
  }
  @BeforeTest
  public void beforeTest() {  
	  setup("https://jqueryui.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
