package testermihil.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testermihil.AbstractComponents.AbstractComponent;

public class CheckoutPage extends AbstractComponent{
	
	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".action__submit")
	WebElement submit;
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement country;

	@FindBy(xpath="(//button[contains(@class,'ta-item')][2]")
	WebElement selectCounty;
	
	By results =By.cssSelector(".ta-results");
	
	public void selectCountry(String CountryName)
	{
		Actions a = new Actions(driver);
		a.sendKeys(country, CountryName).build().perform();
		waitForElementToAppear(By.cssSelector(".ta-results"));
		selectCounty.click();		
	}
	
	public void submitOrder()
	{
		submit.click();
	}
	
	
}


