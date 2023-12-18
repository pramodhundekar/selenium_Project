package selenium_Project1.Drivers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.grid.Main;

public class PH_Travels {

	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.shaadi.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div/div/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='Man']")).click();
		driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div[2]")).click();
		driver.findElement(By.xpath("//div[text()='25']")).click();
		
	}

}
