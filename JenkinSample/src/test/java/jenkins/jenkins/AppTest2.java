package jenkins.jenkins;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest2 extends App
{

	@Test
	public void Script1()
	{
		driver=App.resuse();

		driver.get("https://www.google.com");
//		driver.manage().window().maximize();
		System.out.println("google 2 loaded");
		driver.findElement(By.name("q")).click();
//		driver.findElement(By.name("q")).sendKeys("accenture");
	}
}

