package specs;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DriverFactory {

    protected static WebDriver driver;

    public DriverFactory(){
       initialize();
    }

    public void initialize(){
        if(driver == null){
            createNewDrierInstance();
        }
    }

    public void createNewDrierInstance(){
        /*System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
        driver = new ChromeDriver();*/
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setJavascriptEnabled(true);
        caps.setCapability("Platform", Platform.ANY);
        caps.setCapability("takesScreenshot", true);
        caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "lib/phantomjs");
        System.setProperty("phantomjs.binary.path", "lib/phantomjs");
        driver = new PhantomJSDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver(){
        driver.quit();
    }
}
