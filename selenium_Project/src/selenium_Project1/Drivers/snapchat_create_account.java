package selenium_Project1.Drivers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class snapchat_create_account {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		snapchat_create_account c= new snapchat_create_account();
		c.setup();
		c.signup();

	}
public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
	ChromeOptions p=new ChromeOptions();
	p.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver();
	driver.get("https://accounts.snapchat.com/accounts/signup?client_id=snapkit");
	driver.manage().window().maximize();
}
public void signup() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("karthik");
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("kumar");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("karthik24");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("karthikk@24");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("karthikk123@gmail.com");
	driver.findElement(By.xpath("//select[@name='birthdayMonth']")).sendKeys("may");
	driver.findElement(By.xpath("//input[@name='birthdayDay']")).sendKeys("19");
	driver.findElement(By.xpath("//input[@name='birthdayYear']")).sendKeys("1999");
}}
	
