package selenium_Project1.Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Gmail_Account_Create {
WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmail_Account_Create g= new Gmail_Account_Create();
		g.setup();
		g.login();
	}
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		ChromeOptions o= new ChromeOptions();
		o.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");

	}
	public void login() {
		driver.findElement(By.name("firstName")).sendKeys("ramesh");
		
		driver.findElement(By.id("lastName")).sendKeys("kulkarni");
		driver.findElement(By.name("Username")).sendKeys("rameshkulkarni107");
		driver.findElement(By.name("Passwd")).sendKeys("ramesh@1111");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("ramesh@1111");
		driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe")).click();
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
	}

}
