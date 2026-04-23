package org.giganerds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTestNGExample {

    @Test
    public void launchBrowser() {
        // Set the path to ChromeDriver
//        System.setProperty("webdriver.chrome.driver", "C:\\GigaNerds\\Sem-06\\QA\\pract\\TestNG\\TestNG-practical\\chromedriver.exe");
//        System.setProperty("webdriver.chrome.driver", "");
//
//        // Instantiate the WebDriver and open a webpage
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//        driver.quit();
        WebDriver driver = new ChromeDriver(); // Selenium auto handles driver
        driver.get("https://www.google.com");
        driver.quit();
   }

}
