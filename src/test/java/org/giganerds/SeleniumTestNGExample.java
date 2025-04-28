package org.giganerds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTestNGExample {

    @Test
    public void launchBrowser() {
        // Set the path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "E:/Sem-06/QA/selenium_pract/selenium/chromedriver/chromedriver");
        System.setProperty("webdriver.chrome.driver", "");

        // Instantiate the WebDriver and open a webpage
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();
    }
}
