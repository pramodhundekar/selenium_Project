package selenium_Project1.Drivers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Add_to_Cart_In_Amazon {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mobile phones");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='add-to-cart-button']/following-sibling::span")));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']/following-sibling::span")).click();
		driver.findElement(By.xpath("//input[@class=\"a-button-input\"]/following-sibling::span[@id=\"attach-sidesheet-checkout-button-announce\"]")).click();

	}

}
