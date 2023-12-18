package selenium_Project1.Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Microsoft_Edge_CreateONe {
WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Microsoft_Edge_CreateONe c=new Microsoft_Edge_CreateONe();
		c.setup();
		c.createone();
	}
	public void setup() {
		
System.setProperty("webdriver.chrome.dreiver","C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe" );
ChromeOptions option= new ChromeOptions();
option.addArguments("--remote-allow-origins=*") ;
driver =new ChromeDriver();
driver.get("https://login.microsoftonline.com");


	}
public void createone() throws InterruptedException {
	Thread.sleep(3000);
	driver.findElement(By.id("signup")).click();

	driver.findElement(By.name("MemberName")).sendKeys("ramesh25023@outlook.com");
	
	
	driver.findElement(By.id("iSignupAction")).click();
	Thread.sleep(3000);
	driver.findElement(By.name("Password")).sendKeys("ramesh@23");
	driver.findElement(By.id("ShowHidePasswordCheckbox")).click();
	driver.findElement(By.id("iSignupAction")).click();
	driver.close();
	
	
}
}
