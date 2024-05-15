import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingLinks {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1. Finding total number of links available on webpage

		System.out.println(driver.findElements(By.tagName("a")).size());
		

		// 2. Finding total number of links available only in footer of webpage

		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // Limiting webdriver scope

		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		

		// 3. Finding total number of links present in first column of footer only

		WebElement footercolumndriver = driver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]")); // Limiting webdriver scope

		System.out.println(footercolumndriver.findElements(By.tagName("a")).size());

		
		// 4. Click on each available links in footer column and check if the page open or not
		
		for(int i=1; i<footercolumndriver.findElements(By.tagName("a")).size(); i++)
		{
			String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
			footercolumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
			
		}	
			
		// 5. Get and print title from all different open windows
			
		Set<String> diffwin = driver.getWindowHandles();
		Iterator<String> iterator = diffwin.iterator();
			
		while(iterator.hasNext())
		{
			driver.switchTo().window(iterator.next());
			System.out.println(driver.getTitle());			
		}
			
		
	}

}
