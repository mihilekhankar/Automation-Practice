import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrabbingTextAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption2")).click();
		
		String taketext = driver.findElement(By.xpath("//body/div[1]/div[4]/fieldset[1]/label[2]")).getText();
		
		driver.findElement(By.id("dropdown-class-example")).sendKeys(taketext);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(taketext);
		
		driver.findElement(By.id("alertbtn")).click();
		
	}

}
