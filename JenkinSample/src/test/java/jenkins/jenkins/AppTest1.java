package jenkins.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
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
	System.out.println("driver loaded");
	Window win = driver.manage().window();
		
	//win.
	win.fullscreen();
	System.out.print("Hi" + win.getSize());

	//driver.manage().window().fullscreen();
	System.out.println("maximize");
    driver.switchTo().window(driver.getWindowHandle());
	driver.get("http://www.accenture.com");
	
	Thread.sleep(40000);
//	org.testng.Assert.fail();
//	driver.findElement(By.name("q")).click();
//	driver.findElement(By.name("q")).sendKeys("yahoo");
	System.out.println("accentue loaded");
	driver.close();
	
	}
}

