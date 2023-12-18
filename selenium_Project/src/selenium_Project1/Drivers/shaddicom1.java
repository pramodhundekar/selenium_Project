package selenium_Project1.Drivers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class shaddicom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
driver.manage().window().maximize();
driver.get("https://www.shaadi.com");

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div/div/div")).click();
driver.findElement(By.xpath("//div[text()='Man']")).click();
driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div[1]/div")).click();
driver.findElement(By.xpath("//div[text()='26']")).click();
driver.findElement(By.xpath("//div[text()='to']/following-sibling::div/div")).click();
driver.findElement(By.xpath("//div[text()='30']")).click();
		
		

	}

}
