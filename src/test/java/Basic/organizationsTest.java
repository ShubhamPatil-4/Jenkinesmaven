package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class organizationsTest {
	@Test
	public void CreateOrganizationsTest() {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		
		//To find WE and pass value in it
		driver.findElement(By.name("user_name")).sendKeys("admin");;
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		
//		//To find Organizations WE and click on it
//				driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
	}

}
