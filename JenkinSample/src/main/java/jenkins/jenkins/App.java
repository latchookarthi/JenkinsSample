package jenkins.jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;



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
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src.main.resources/drivers/chromedriver-2");
//	System.out.println("values"+ System.getProperty("user.dir")+"/src.main.resources/drivers/chromedriver-2");
    	 driver		=new ChromeDriver();
//    	 driver		=new SafariDriver();


//    	 DesiredCapabilities capability = DesiredCapabilities.chrome();        
//         capability.setCapability("ignoreZoomSetting", true);
//         capability.setCapability("ignoreProtectedModeSettings", true);
////System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajalakshmi.ragavan\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
//    	 System.out.println("driver loaded");
////    	 System.out.println(System.getProperty("user.dir")+"\\src.main.resources\\drivers\\chromedriver.exe");
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
