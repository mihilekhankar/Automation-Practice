import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopAutomation {

	public static void main(String[] args) throws InterruptedException {

		String text = "Mihil";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();

		// Handling single button alert pop up on browser
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		Thread.sleep(2000L);

		// Handling double button alert pop up on browser
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
