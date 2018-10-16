package jenkins.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Hello world!
 *
 */
public abstract class App 

{
    protected WebDriver driver = null;
//	 protected static WebDriver driver;
@BeforeTest
    protected void resuse()
    {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalakshmi.ragavan\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src.main.resources\\drivers\\chromedriver.exe");
    	 driver		=new ChromeDriver();
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalakshmi.ragavan\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
    	 System.out.println("driver loaded");
//    	 System.out.println(System.getProperty("user.dir")+"\\src.main.resources\\drivers\\chromedriver.exe");
//return driver;
    }

    @AfterTest
    protected void quit()
    {
    
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalakshmi.ragavan\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
    	System.out.println("driver closing");
driver.quit();
    }
}
