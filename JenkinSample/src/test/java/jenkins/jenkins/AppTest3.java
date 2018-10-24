package jenkins.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest3 extends App
{

	@Test
	public void Script1()
	{
		driver=App.resuse();

		driver.get("https://www.disney.com");
//		driver.manage().window().maximize();
		driver.manage().window().fullscreen();

		System.out.println("firefox 3 loaded");
//		driver.findElement(By.name("q")).click();
//		driver.findElement(By.name("q")).sendKeys("accenture");
		driver.close();
	}
}

