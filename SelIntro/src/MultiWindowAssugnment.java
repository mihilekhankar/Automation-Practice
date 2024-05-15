import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowAssugnment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Set<String> windows = driver.getWindowHandles(); 

		Iterator<String>it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);

		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		
		driver.switchTo().window(parentId);
		
		//System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());

	}

}
