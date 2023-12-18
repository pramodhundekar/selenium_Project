package selenium_Project1.Drivers;

import java.sql.Driver;
import java.sql.DriverAction;
import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtube_song {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com");
//		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");


driver.close();
		
		
		
}
}
