 package Utils;

import org.openqa.selenium.WebElement;

public class SeleniumHelper {

	public static void verifyElement(WebElement element) {
		if(element.isDisplayed()) {
			System.out.println("Element is present");
		}else
			System.out.println("Element no present" );
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
}
