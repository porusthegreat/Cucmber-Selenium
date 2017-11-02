package specs;

import pageObjects.SignInPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class SignInTest extends DriverFactory{

    @When("User Chooses to SignIn")
    public void userChoosesToSignIn(){
        new SignInPage(driver).clickOnSignInButton();
    }

    @Then("User should see an error")
    public void showError(){
        String error = new SignInPage(driver).loginFlow();
        Assert.assertTrue(error.contains("There were errors in your submission"));
    }
}
