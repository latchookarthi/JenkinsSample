package jenkins.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Hello world!
 *
 */
public class App 

{
     static WebDriver driver = null;
//	 protected static WebDriver driver;
//@BeforeTest
static
     WebDriver resuse()
    {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalakshmi.ragavan\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");	
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src.main.resources\\drivers\\chromedriver.exe");
    	 driver		=new ChromeDriver();
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalakshmi.ragavan\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
    	 System.out.println("driver loaded");
//    	 System.out.println(System.getProperty("user.dir")+"\\src.main.resources\\drivers\\chromedriver.exe");
//return driver;
		return driver;
    }

//    @AfterTest
    public void quit()
    {
    
//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalakshmi.ragavan\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
    	System.out.println("driver closing");
driver.quit();
    }
}
