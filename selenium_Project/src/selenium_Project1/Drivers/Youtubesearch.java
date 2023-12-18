package selenium_Project1.Drivers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Youtubesearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		//ChromeOptions op= new ChromeOptions();
		//op.addArguments("--remote-allow-origins=*");


		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("raja ko rani se pyar ho gaya ");


		driver.findElement(By.xpath("//button[@id=\"search-icon-legacy\"]")).click();
		//WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")));
		
		
		driver.findElement(By.xpath("//yt-formatted-string[@class='style-scope ytd-video-renderer']")).click();
		
		
		driver.findElement(By.xpath("//div[text()='Skip']")).click();
	}

}
