package selenium_Project1.Drivers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Orange_HRM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
	//ChromeOptions option= new ChromeOptions();
	//option.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");	
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']/parent::a")).click();
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	Actions action=new Actions(driver);
	

	action.clickAndHold(driver.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']/parent::div"))).build().perform();
	 action.sendKeys(Keys.DOWN).build().perform();  
	driver.findElement(By.xpath("//div[text()='-- Select --']")).sendKeys(Keys.DOWN);
	 Thread.sleep(1000);
	 
	 action.sendKeys(Keys.UP).build().perform();
	//driver.findElement(By.xpath("//div[text()='-- Select --']")).sendKeys(Keys.DOWN);
	 Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='-- Select --']")).sendKeys(Keys.ENTER);

}}