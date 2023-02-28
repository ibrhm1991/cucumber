package com.cybertek.library.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private Driver(){}
    private static WebDriver driver;

    public static WebDriver getDriver(){
        String browser= ConfigurationReader.getProperty("browser");
       if(browser.equals("chrome")) {
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();
       }
        return driver;
    }
    public static void closeDriver(){
        driver.quit();
    }
}
