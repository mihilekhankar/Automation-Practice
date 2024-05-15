import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class AssignmentPractise {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");


		// Find and fill out the name input field
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Mihil Ekhankar");

		// Find and fill out the email input field
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mihil@example.com");
				
		// Find and fill out the password input field
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("admin123");
	
		// Find and click on the checkbox for "I am a Vegetarian"
		driver.findElement(By.id("exampleCheck1")).click();

		//Find and select the 'Male' dropdown button
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		
		//Find and select the Employment Status radio button
		driver.findElement(By.id("inlineRadio2")).click();

		//Find and select the 'Submit' button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
/*		// Wait for the success message to appear
		driver.wait(EC.visibility_of_element_located(By.xpath("//div[@class='alert alert-success']")));


		// Print success message
		driver.findElement(By.xpath("//input[@type='submit']")).text print("Success Message:", success_message);
	
*/
	}

}
