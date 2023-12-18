package selenium_Project1.Drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class You_tube_Song_Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
//	ChromeOptions op = new ChromeOptions();
//	op.addArguments("--remote-allow-origins=*");
//	
//	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.primevideo.com/");
	driver.manage().window().maximize();

	}

}
