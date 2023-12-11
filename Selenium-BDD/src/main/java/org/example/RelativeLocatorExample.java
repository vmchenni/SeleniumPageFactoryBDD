package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.locators.RelativeLocator;


public class RelativeLocatorExample {


    public static void main(String args[]) throws InterruptedException {

        WebDriver driver;

        driver = new ChromeDriver();

        driver.get("https://www.browserstack.com/");


        WebElement appLive = driver.findElement(By.xpath("//*[@id=\"featured-tab-content\"]/div[2]/div[1]/div/a[1]/span[1]/h4"));

        WebElement getADemo = driver.findElement(RelativeLocator.with(By.tagName("button")).above(appLive));

        getADemo.click();
    }

}