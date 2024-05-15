import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LikeFromExplore {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   //Global level implicit wait
		driver.manage().window().maximize(); 
		driver.get("https://www.instagram.com/");
		
		
		//Login
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("_life_lines_");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Rasengan@106");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Navigate to search page
		List <WebElement> tabs = driver.findElements(By.cssSelector(".x9jhf4c"));
		WebElement search = tabs.stream().filter(tab -> tab.getText().equals("Search")).findFirst().orElse(null);
		search.click();
		
		//Enter text into search box
		driver.findElement(By.cssSelector(".x7xwk5j")).sendKeys("#motivational", Keys.ENTER);
	}

}
