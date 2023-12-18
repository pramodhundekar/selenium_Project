package selenium_Project1.Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PHP_Travels {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver= new ChromeDriver(option);
		driver.manage().window().maximize();
driver.get("https://phptravels.com/");

	
	
	
	}

}
