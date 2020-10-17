package com.orangeHRM.testCases;

import com.orangeHRM.webPages.HomePageTitleAndLogo;
import com.orangeHRM.webPages.OrangeLogin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class VerifyOrangeLogin {
    WebDriver driver;
    OrangeLogin login;
    HomePageTitleAndLogo titleLogo;

    @BeforeTest
    public void setupWebDriver(){
        login = new OrangeLogin(driver);
        System.setProperty(login.getChromeName(), login.getChromePath());
        driver = new ChromeDriver();
        System.out.println("WebDriver Setup: WebDriver Setup Successful.");
    }

    @Test(priority = 1)
    public void launchHomepage(){
        login = new OrangeLogin(driver);
        driver.get(login.getUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        System.out.println("Homepage started successfully.");
    }

    @Test(priority = 2)
    public void verifyOrangeLoginProcess() throws Exception {
        System.out.println("---------------------------------------------");
        login = new OrangeLogin(driver);
        titleLogo = new HomePageTitleAndLogo(driver);
        titleLogo.homePageTitle();
        titleLogo.verifyHomepageLogo();
        login.typeUserName();
        Thread.sleep(3000);
        login.typePassword();
        Thread.sleep(3000);
        login.clickOnLogin();
        Thread.sleep(3000);
        login.returnToPreviousPage();
        Thread.sleep(3000);
        login.requestPassword();
        Thread.sleep(3000);
        System.out.println("--------------------------------------------------");
    }


    @AfterTest
    public void tearDown(){
        driver.quit();
        System.out.println("Test Completed Successfully!");
    }
}
