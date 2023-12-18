package TestNG;

import org.testng.annotations.Test;

import base_Package.Common;

import org.testng.annotations.BeforeTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class Example_Findelements extends Common {
  @Test
  public void verifytotalLinks() {
	  
	  //total no of links in main menu
	  
	 List<WebElement>Links= driver.findElements(By.tagName("a"));
	 System.out.println("total links in the main page:"+Links.size());
	 
	 //total no of links in footer
	 
	 WebElement footer= driver.findElement(By.id("glbfooter"));
	 int footerLinks=footer.findElements(By.tagName("a")).size();
	 System.out.println("total no of footer Links:"+footerLinks);
	 
	 // total no of footer links in 2nd section
	WebElement col= driver.findElement(By.xpath("//div[@id='gf-BIG']//td[2]"));
List<WebElement>colList =col.findElements(By.tagName("a"));
System.out.println("total no of col Links:"+colList.size());
for (int i = 0; i < colList.size(); i++) {
	System.out.println(colList.get(i).getText());	
}
for (WebElement element : colList) {
	String text=element.getText();
	if(text.equalsIgnoreCase("Developers")){
	element.click();
	}
}
	
isElementVisible(By.xpath("//img[@class='logo']"));
String title=driver.getTitle();
String url=driver.getCurrentUrl();
String value= driver.findElement(By.xpath("//img[@class='logo']")).getAttribute("alt");
System.out.println(" *************************************************** ");
System.out.println("Title:"+title);
System.out.println("URL:"+url);
System.out.println("Attribute value:"+value);
  
  
if(title.contains("Developers") && url.contains("developer") && value.contains("Developers")){
	System.out.println("test passed");
}
else {
	System.out.println("test fail");
}
}

  
  @BeforeTest
  public void beforeTest() {
	  setup("https://www.ebay.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
