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
	public void Script1() throws InterruptedException
	{
		driver=App.resuse();
		Thread.sleep(10000);

		driver.get("https://www.google.com");
		driver.manage().window().fullscreen();

		System.out.println("google 2 loaded");
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("accenture");
		System.out.println("entered the value");

		driver.close();
	}
}

