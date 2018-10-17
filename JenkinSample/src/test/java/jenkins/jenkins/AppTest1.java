package jenkins.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

/**
 * Unit test for simple App.
 */
public class AppTest1 extends App
{
//	 WebDriver driver=resuse();
	@Test
	public void Script1() throws InterruptedException
	{
	driver=App.resuse();
  	Thread.sleep(4000);
//		driver.manage().window().maximize();

	driver.get("http://www.accenture.com");
	Thread.sleep(4000);
//	org.testng.Assert.fail();
//	driver.findElement(By.name("q")).click();
//	driver.findElement(By.name("q")).sendKeys("yahoo");
	System.out.println("accentue loaded");
	
	
	}
}

