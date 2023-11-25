package pagefactory;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;


import java.util.logging.LogManager;

public class LoginPage_PF {

    WebDriver driver;
    private @FindBy(id = "username")
    WebElement txtUserName;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(name = "login")
    WebElement btnLogin;

    public LoginPage_PF(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setTxtUserName(String userName){
        txtUserName.sendKeys(userName);
    }

    public void setTxtPassword(String pwd){
        txtPassword.sendKeys(pwd);
    }

    public void clickLoginButton(){
        btnLogin.click();
    }
}
