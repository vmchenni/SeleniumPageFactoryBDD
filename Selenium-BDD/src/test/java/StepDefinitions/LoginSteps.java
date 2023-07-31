package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pagefactory.LoginPage_PF;


public class LoginSteps {
    WebDriver driver =null;
    LoginPage_PF loginPage_pf= null;
    @Given("Launch URL")

    public void launch_url() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("launch_url!");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://practice.automationbro.com/my-account/");
        loginPage_pf = new LoginPage_PF(driver);
    }

    @When("User logn with valid credentials")
    public void user_logn_with_valid_credentials() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("User logn with valid credentials!");
        loginPage_pf.setTxtUserName("username");
        loginPage_pf.setTxtPassword("password");
        loginPage_pf.clickLoginButton();
        Thread.sleep(5000);
        Assert.assertEquals("HomePageIsDosplayed","HomePageIsDosplayed");
        driver.close();
        driver.quit();


    }

    @Then("Home page is displayed")
    public void home_page_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("Home page is displayed");
    }

}
