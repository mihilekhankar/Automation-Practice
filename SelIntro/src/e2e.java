import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Selection on way trip radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='AMD']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BOM']"))
				.click();

		// Select date from calendar

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

		// TO make sure other calendar stay disable when we select one way trip
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("its disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// Select passenger

		driver.findElement(By.id("divpaxinfo")).click();

		Thread.sleep(2000L);

		for (int i = 1; i < 5; i++)

		{

			driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		// Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5
		// Adult");

		// Select currency
		WebElement statiDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(statiDropdown);
		// dropdown.selectByIndex(1);
		dropdown.selectByValue("INR");

		// Select friends and family check box
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();

		Thread.sleep(2000L);

		// Click on search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		System.out.println("List of flights is showing!");

	}

}
