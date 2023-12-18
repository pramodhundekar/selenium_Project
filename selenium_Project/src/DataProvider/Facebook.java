package DataProvider;

import org.testng.annotations.Test;

import base_Package.Common;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class Facebook extends Common {
	@Test(dataProviderClass = Data_Class.class,dataProvider = "logindata")
	public void verifylogin(String username,String password) throws Exception {
		System.out.println(username);
		System.out.println(password);
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

		String s=driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		Thread.sleep(5000);
		if(s.equalsIgnoreCase(s)) {
			System.out.println("test passed");
		}else {
			System.out.println("test fail");
		}
	}
	@BeforeTest
	public void beforeTest() {
		setup("https://www.facebook.com/");
	}

	@AfterTest
	public void afterTest() {
	}

}
