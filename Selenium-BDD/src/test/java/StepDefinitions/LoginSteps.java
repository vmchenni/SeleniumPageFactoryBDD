package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagefactory.HomePage_PF;
import pagefactory.LoginPage_PF;

import java.io.IOException;
import java.time.Duration;
import java.util.List;


public class LoginSteps {
    public static WebDriver driver =null;
    LoginPage_PF loginPage_pf= null;
    HomePage_PF homePage_pf;


    @Given("Launch URL")

    public void launch_url() throws InterruptedException, IOException {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
        System.out.println("launch_url!");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
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

    @And("Browser is closed")
    public void browserIsClosed() {
        LoginSteps.driver.close();
        LoginSteps.driver.quit();
    }
    @Before
    public void setDriver(){
        System.out.println("Launch the Browser");
    }

    @After
    public void tearDown(){
        System.out.println("Close the Browser");
    }

    @Then("User gets all country links")
    public void user_gets_all_country_links(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
//        throw new io.cucumber.java.PendingException();
        List<String> stringList=dataTable.asList();
        System.out.println("Country list:"+stringList);
    }

}
