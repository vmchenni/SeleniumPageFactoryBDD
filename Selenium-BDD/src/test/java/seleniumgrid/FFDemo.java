package seleniumgrid;

import io.appium.java_client.remote.MobileBrowserType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class FFDemo {
    @Test
    public void testApp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(Browser.CHROME.browserName());

        WebDriver webDriver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),desiredCapabilities);

        webDriver.findElement(By.tagName("a")).sendKeys("Vishwanath");

        Thread.sleep(5000);


        webDriver.quit();

    }
}
