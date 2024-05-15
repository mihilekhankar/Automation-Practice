import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
		WebElement rows = driver.findElement(By.xpath("//body/div[3]/div[1]/fieldset[1]/table[1]"));
		List<WebElement>TotalRowsList = rows.findElements(By.tagName("tr"));
		System.out.println("Total number of Rows in the table are : "+ TotalRowsList.size());

		
		WebElement columns = driver.findElement(By.xpath("//body/div[3]/div[1]/fieldset[1]/table[1]"));
		List<WebElement>TotalColumnsList = columns.findElements(By.tagName("th"));
		System.out.println("Total number of Rows in the table are : "+ TotalColumnsList.size());
	
		
		WebElement tableRow = driver.findElement(By.xpath("//body[1]/div[3]/div[1]/fieldset[1]/table[1]/tbody[1]/tr[3]"));
        String rowtext = tableRow.getText();
		System.out.println("Third row of table : "+rowtext);
		
		
		
		
/*		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
	    
	    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

	   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));   */
		
	}

}
