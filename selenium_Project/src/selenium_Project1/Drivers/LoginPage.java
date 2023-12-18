package selenium_Project1.Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		ChromeOptions  o= new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(o);
		driver.get("https://google.co.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("selenium tutorial");
		Thread.sleep(1000);
		driver.findElement(By.name("btnK")).click();
		

	}

}
