package selenium_Project1.Drivers;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Practice {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shaadi.com/");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div/div/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='Man']")).click();
		driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div/div[1]/div")).click();
		driver.findElement(By.xpath("//div[text()='26']")).click();
		driver.findElement(By.xpath("//div[text()='to']/following-sibling::div/div")).click();
		driver.findElement(By.xpath("//div[text()='30']")).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("label[text()='of religion"))); 
				
		driver.findElement(By.xpath("//label[text()='of religion']/following-sibling::div/div/div[1]")).click();
	}
		
	}


