package selenium_Project1.Drivers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtube_Song1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
ChromeOptions op= new ChromeOptions();
op.addArguments("--remote-allows-origins=*");
WebDriver driver= new ChromeDriver();
driver.get("https://www.youtube.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//input[@id='search']")).sendKeys("raja ko rani se");
driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Skip Ads']")));
		driver.findElement(By.xpath("//div[text()='Skip Ads']")).click();
	//	driver.close();
//		System.getProperty("webriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
//		ChromeOptions op=new ChromeOptions();
//		op.addArguments("--remote-allow-origins=*");
//		WebDriver driver =new ChromeDriver(op);
//		driver.get("https://www.shaadi.com/");
//		driver.manage().window().maximize();
	
	}

}
