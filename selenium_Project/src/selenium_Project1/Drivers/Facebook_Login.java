package selenium_Project1.Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Facebook_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	String path=	System.getProperty("user.dir");
	//	System.out.println(path);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(op);
				
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("hundekarPramod");
		driver.findElement(By.name("pass")).sendKeys("Pramod@123");
		driver.findElement(By.id("loginbutton")).click();
				
	}

}
