import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   //Implicit Wait
	
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] veggies = { "Cucumber", "Beans", "Tomato" };
		Thread.sleep(2000);
		addItems(driver, veggies);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		
	/*	//Explicit wait
		WebDriverWait w = new WebDriverWait (driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Code applied ..!')]")));
	*/	
		
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();		
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Code applied ..!')]")).getText());
	}

	public static void addItems(WebDriver driver, String[] veggies) {
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-"); // Spliting "Cucumber" from name "Cucumber - 1 kg"
			String formatedName = name[0].trim();

			// Converting array into array list

			List<String> iteamList = Arrays.asList(veggies);

			if (iteamList.contains(formatedName)) {

				j++;
				// click on add to cart button
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				if (j == veggies.length)
					break;
			}

		}
	}

}
