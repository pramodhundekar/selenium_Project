package selenium_Project1.Drivers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_java_doc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		ChromeOptions o=new ChromeOptions();
		//o.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/overview-summary.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).click();
		driver.findElement(By.xpath("//a[text()='WebDriver']")).click();
		driver.findElement(By.xpath("//label[text()='SEARCH:']/following-sibling::input[@id='search']")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Interface WebDriver");
		
	}

}
