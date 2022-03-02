package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.SeleniumHelper;

public class ProductDetailPage {
	WebDriver driver;
	@FindBy(xpath="xpath of jense Cat") WebElement skinny;
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public ProductDetailsPage clickJeansCatagory() {
		SeleniumHelper.clickOnElement(skinny);
		return new ProductPage();
	}
}
