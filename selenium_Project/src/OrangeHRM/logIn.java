package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class logIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origin=*");
	WebDriver driver= new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//span[text()='Admin']")).click();
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	Actions action=new Actions(driver);
	action.clickAndHold(driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/parent::div"))).build().perform();
	action.sendKeys(Keys.DOWN).build().perform();
	//driver.close();
	
	
	
	}

}
