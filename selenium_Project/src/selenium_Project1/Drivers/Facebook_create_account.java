package selenium_Project1.Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Facebook_create_account {

	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Facebook_create_account f=new Facebook_create_account();
		f.setup();
		f.createaccount();
	}
	@Test     
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}
	public void createaccount() throws InterruptedException {
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Pramod");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Hundekar");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("9700916457");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("pramod@123");
		Thread.sleep(3000);
		driver.findElement(By.name("birthday_day")).sendKeys("19");
		Thread.sleep(3000);
		driver.findElement(By.id("month")).sendKeys("may");
		Thread.sleep(3000);
		driver.findElement(By.name("birthday_year")).sendKeys("1999");
		Thread.sleep(3000);

	}

}
