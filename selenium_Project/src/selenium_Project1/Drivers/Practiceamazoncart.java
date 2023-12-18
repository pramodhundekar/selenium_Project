package selenium_Project1.Drivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practiceamazoncart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
//ChromeOptions option=  new ChromeOptions();
//option.addArguments("--remote-allows-origins=*");
WebDriver driver= new ChromeDriver();
driver.get("https://www.amazon.in/?tag");
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("noise smart wath");
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
driver.findElement(By.xpath("a-section aok-relative s-image-fixed-height")).click();
	}

}
