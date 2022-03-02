package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

import Utils.SeleniumHelper;

public class WomenPage extends LoadableComponent<WomenPage>{
	WebDriver driver;
	@FindBy(xpath="xpath of jense Cat") WebElement jeansCatagory;
	public WomenPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public ProductPage clickJeansCatagory() {
		SeleniumHelper.clickOnElement(jeansCatagory);
		return new ProductPage(driver);
	}
}
