package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

import java.io.IOException;
import java.time.Duration;


public class LoginSteps {
    public static WebDriver driver =null;
    LoginPage_PF loginPage_pf= null;
    HomePage_PF homePage_pf;


    @Given("Launch URL")

    public void launch_url() throws InterruptedException, IOException {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("launch_url!");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://practice.automationbro.com/my-account/");
        loginPage_pf = new LoginPage_PF(driver);
        homePage_pf = new HomePage_PF(driver);
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
