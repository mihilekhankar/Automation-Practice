package testermihil;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import testermihil.pageobject.CartPage;
import testermihil.pageobject.CheckoutPage;
import testermihil.pageobject.LoginPage;
import testermihil.pageobject.ProductCatalog;

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {

		String productName = "ADIDAS ORIGINAL";	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Global level implicit wait
		driver.manage().window().maximize();
	

		// LoginPage
		LoginPage loginpage = new LoginPage(driver);
		loginpage.goTo(); 
		loginpage.loginApplication("mihilekhankar@gmail.com", "Admin@123");

		//ProductCatalog
		ProductCatalog productCatalog = new ProductCatalog(driver);
		List<WebElement> products = productCatalog.getProductList();
		
		
		productCatalog.addProductToCart(productName);
		productCatalog.goToCartPage();

		// Cart page
		CartPage cartPage = new CartPage(driver);
		Boolean match = cartPage.VerifyProductDisplay(productName);
		Assert.assertTrue(match);
		cartPage.goToCheckout();
		

		// Payment page
		CheckoutPage checkoutPage = cartPage.goToCheckout();
		checkoutPage.selectCountry("india");
		

		
		
		

		/*
		 * driver.findElement(By.cssSelector(".form-group input")).sendKeys("ind");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * List<WebElement> options =
		 * driver.findElements(By.cssSelector(".ng-star-inserted"));
		 * 
		 * for (WebElement option : options)
		 * 
		 * {
		 * 
		 * if (option.getText().equalsIgnoreCase("India"))
		 * 
		 * {
		 * 
		 * option.click();
		 * 
		 * } } Thread.sleep(10000);
		 */

//		Actions a = new Actions(driver);
//		a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));
//		
//		driver.findElement(By.xpath("(//button[contains(@class,'ta-item')][2]")).click();		
		driver.findElement(By.cssSelector(".action__submit")).click();
		
		String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		driver.close();
	}
}
