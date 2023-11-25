package StepDefinitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.manager.SeleniumManager;

public class HomePageSteps {
    @Then("Home page is displayed for the loggedIn User$")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("Home page is displayed"+ LoginSteps.driver.getTitle());
    }
}
