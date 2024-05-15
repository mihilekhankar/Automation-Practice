import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Selstart{

	public static void main(String[] args) {
		
		// Invoking Browser
		// Chrome - ChromeDriver -> Method
		// chromedriver.exe -> invoke chrome browser
		// Selenium Manager will helps invoke chorme automatically
		
		//Microsoft Edge browser
		//WebDriver driver = new EdgeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "path where driver is saved in your system");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.marvel.com/movies");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
	}

}
