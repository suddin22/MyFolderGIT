package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	@FindBy(xpath="xpath value of HomePageLogo") WebElement HomeLogo;
	@FindBy(xpath="xpath value of women menu") WebElement WomenMenu;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver.this);
	}
	public void verifyHomePageLogo() {
		SleniumHelper.clickOnElement(homeLogo);
	}
	public WomenPage clickOnWomenMenuBar() {
	SleniumHelper.clickOnElement(womenMenu);
	return new WomenPage(driver);
}
}