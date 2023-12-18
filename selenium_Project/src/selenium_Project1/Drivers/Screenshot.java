package selenium_Project1.Drivers;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.netty.util.AsciiString;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot {
  
   public static void main(String[]args) throws IOException  {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\pramo\\eclipse-workspace\\selenium_Project\\Drivers\\chromedriver.exe");
	   ChromeOptions op= new ChromeOptions();
	   op.addArguments("--remote-allow-origins=*");
       WebDriver driver = new ChromeDriver(op);
       driver.manage().window().maximize();
       driver.get("http://google.com/");

       // 1. create the object reference of TakesScreenshot
       // assign the current driver to it , type cast it to TakesScreenshot
       TakesScreenshot ts = (TakesScreenshot) driver;

       // 2. call the method getScreenshotAs() using ts (object reference of TakesScreenshot)
       // store this into file object
       File srcFile = ts.getScreenshotAs(OutputType.FILE);

      // String timeStamp = new SimpleDateFormat("_yyyyMMdd_hhmmss").format(new Date());
     File trg=new File("C:\\Users\\pramo\\eclipse-workspace\\Test_project_maven\\screenshot");

       // 3. copy this file object into a real image file.
       FileUtils.copyFile(srcFile,trg);
   }
}
