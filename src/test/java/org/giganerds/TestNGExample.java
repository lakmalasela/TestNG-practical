package org.giganerds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNGExample {

//    @Test
//    public void launchBrowser() {
//        // Set the path to ChromeDriver (only once!)
//        System.setProperty("webdriver.chrome.driver", "E:/Sem-06/QA/selenium_pract/selenium/chromedriver/chromedriver.exe");
//
//        // Instantiate the WebDriver and open a webpage
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com");
//        driver.quit();
//    }

    WebDriver driver;

    @BeforeTest
    @Parameters("url")
    public void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "E:/Sem-06/QA/selenium_pract/selenium/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test(dataProvider = "testData")
    public void testWithMultipleData(String input) {
        System.out.println("Testing with input: " + input);
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @DataProvider(name = "testData")
    public Object[][] getData() {
        return new Object[][]{
                {"First Input"},
                {"Second Input"},
                {"Third Input"}
        };
    }
}
