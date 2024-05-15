import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Implicit Wait

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

		driver.findElement(By.id("password")).sendKeys("learning");

		driver.findElement(By.xpath("//span[contains(text(),'Admin')]")).click();

		// driver.findElement(By.xpath("//button[@id='okayBtn']")).click();

		driver.findElement(By.cssSelector("option[value='consult']")).click();

		driver.findElement(By.id("terms")).click();

		/*
		 * WebDriverWait w = new WebDriverWait (driver,5);
		 * w.until(ExpectedConditions.urlToBe(
		 * "https://rahulshettyacademy.com/angularpractice/shop");
		 */

		driver.findElement(By.id("signInBtn")).click();

		// Next Add to cart page
		
		String[] mobiles = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		Thread.sleep(2000);
		addItems(driver, mobiles);
		
		driver.findElement(By.className("btn btn-info")).click();
		driver.findElement(By.className("nav-link btn btn-primary")).click();

	}
	
	public static void addItems(WebDriver driver, String[] mobiles) {
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("");
			String formatedName = name[0].trim();

			// Converting array into array list

			List<String> iteamList = Arrays.asList(mobiles);

			if (iteamList.contains(formatedName)) {

				j++;
				// click on add to cart button
				driver.findElements(By.xpath("//div[@class='card-footer']/button")).get(i).click();

				if (j == mobiles.length)
					break;
			}

		}
		
	}
}
