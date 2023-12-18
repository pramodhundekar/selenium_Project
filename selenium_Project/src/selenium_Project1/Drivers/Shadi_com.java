package selenium_Project1.Drivers;

import java.time.Duration;

import javax.swing.text.Highlighter.Highlight;
import javax.swing.text.html.parser.DTD;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v109.network.model.DataReceived;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shadi_com {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
		ChromeOptions op= new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shaadi.com");

	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		//WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("input[@class='MuiInputBase-input MuiOutlinedInput-input")));
		driver.findElement(By.xpath("//label[text()=\"I'm looking for a\"]/following-sibling::div/div/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='Woman']")).click();
		driver.findElement(By.xpath("//label[text()='aged']/following-sibling::div/div[1]/div")).click();
		driver.findElement(By.xpath("//div[text()='24']")).click();
		driver.findElement(By.xpath("//div[text()='to']//following-sibling::div")).click();
		driver.findElement(By.xpath("//div[text()='26']")).click();
		driver.findElement(By.xpath("//label[text()='of religion']/following-sibling::div/div/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='Hindu']")).click();
		driver.findElement(By.xpath("//label[text()='and mother tongue']/following-sibling::div/div/div[1]")).click();
		driver.findElement(By.xpath("//div[text()='More']/following-sibling::div[text()='Marathi']")).click();
		driver .findElement(By.xpath("//button[text()=\"Let's Begin\"]")).click();
		driver.findElement(By.xpath("//span[text()='My Friend']")).click();
		driver.findElement(By.xpath("//span[text()='Male']")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//label[text()='First name']/following-sibling::div/input")));
        driver.findElement(By.xpath("//label[text()='First name']/following-sibling::div/input")).sendKeys("Ramana");
        driver.findElement(By.xpath("//label[text()='Last name']/following-sibling::div/input")).sendKeys("Verma");
        driver.findElement(By.xpath("//label[text()='Day']/following-sibling::div/input")).sendKeys("25");
        driver.findElement(By.xpath("//label[text()='Month']/following-sibling::div/input")).sendKeys("05");
        driver.findElement(By.xpath("//label[text()='Year']/following-sibling::div/input")).sendKeys("1999");
       driver.findElement(By.xpath("//p[text()='Continue']")).click();
       driver.findElement(By.xpath("//label[text()='Religion']/following-sibling::div")).click();
     //  driver.findElement(By.xpath("//p[text()='Submit']")).click();
       driver.findElement(By.xpath("//li[text()='Hindu']")).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Community']/following-sibling::div")));
       driver.findElement(By.xpath("//div[text()='Community']/following-sibling::div")).click();
       driver.findElement(By.xpath("//li[text()='Frequently used Communities']/following-sibling::li[text()='Marathi']")).click();
       driver.findElement(By.xpath("//div[text()='Living in']/following-sibling::div/div")).click();
       driver.findElement(By.xpath("//li[text()='Frequently used Countries']/following-sibling::li[text()='India']")).click();
       driver.findElement(By.xpath("(//p[text()='Continue']/../../parent::button)[2]")).click(); 
//      Actions act = new Actions(driver);
//		act.sendKeys(Keys.PAGE_UP).build().perform();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Email ID']/following-sibling::div/input")))	;
     driver.findElement(By.xpath("//label[text()='Email ID']/following-sibling::div/input")).sendKeys("ramanaverma@gmail.com");
    driver.findElement(By.xpath("//label[text()='Mobile no.']/following-sibling::div/input")).sendKeys("8956231478");

       
		
		
		
	
	}
}

