package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

    @FindBy(id = "Log Out")
    WebElement btnLogout;

    public HomePage_PF(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }
}
