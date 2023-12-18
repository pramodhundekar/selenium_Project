package base_Package;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class Browser {
	
	public static WebDriver driver;
	public WebDriverWait wait;
	public Actions action;
	public File file;
	public FileInputStream fis;
	public Properties prop;

	public void setup(String url) {
		
		file = new File("C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Creating Property files\\config.properties");
		try {
			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String browser = prop.getProperty("Browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
			//WebDrivermanager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);	
		} else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ".//drivers//msedgedriver.exe");
			//WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");	
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		action = new Actions(driver);
	}
}