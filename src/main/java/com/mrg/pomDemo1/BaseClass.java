package com.mrg.pomDemo1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
    String chromePath;
    String chromeName;
    WebDriver driver = null;
    String url;

    public BaseClass(){
        chromeName = "G:\\BrowserDrivers\\ChromeDriver 84.0.4147.30\\chromedriver.exe";
        chromePath = "webdriver.chrome.driver";
        url = "https://opensource-demo.orangehrmlive.com/";
    }

    @BeforeSuite
    public void initializeHomePage(){
        System.setProperty(chromeName, chromePath);
        System.out.println("Driver initialized successfully");
    }

    @AfterSuite
    public void tearDownDriver(){
        driver.quit();
    }

}
