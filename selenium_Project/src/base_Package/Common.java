package base_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Common  extends Browser{


		public void isElementVisible(By locator) {
			
			try {
				wait.until(ExpectedConditions.visibilityOfElementLocated(locator));	
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("Unable fo find elment with Locator: "+locator);
			}
			
		}
		
		
		public void isElementClickable(By locator) {
			try {
				wait.until(ExpectedConditions.elementToBeClickable(locator));
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("element is unable to click Locator: "+locator);
			}
		}
		public void waitForAlertPresent() {
			try {
				wait.until(ExpectedConditions.alertIsPresent());
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Failed to Wait for An Alert or Alert is not Avaialble");

	}
		}}

