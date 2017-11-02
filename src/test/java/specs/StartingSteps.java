package specs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class StartingSteps {
    private WebDriver driver;

    @Before
    public void setupDriver(){
        driver = new DriverFactory().getDriver();
        System.out.println("-------Driver Instantiated-----------");
    }

    @After
    public void destroyDriver(){
        new DriverFactory().destroyDriver();
        System.out.println("------Driver value is null--------");
    }


    @Given("User is on Landing Page")
    public void navigateToUrl(){
        driver.get("http://www.cleartrip.com");
        driver.manage().window().maximize();
    }
}
