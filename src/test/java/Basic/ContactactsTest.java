package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContactactsTest {
	
	
	@Test
	public void CreateContactTest() {
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://localhost:8888/");
			driver.findElement(By.name("user_name")).sendKeys("admin");
			driver.findElement(By.name("user_password")).sendKeys("admin");
			driver.findElement(By.id("submitButton")).click();
			
			//To click on contacts button
			driver.findElement(By.xpath("//a[text()='Contacts']")).click();
	}

}
