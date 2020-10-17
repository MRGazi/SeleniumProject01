package com.orangeHRM.testCases;

import com.orangeHRM.webPages.OrangeLogin;
import com.orangeHRM.webPages.PracticeFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PracticeFormTest {
    WebDriver driver;
    OrangeLogin setup;
    PracticeFormPage formPage;

    @BeforeTest
    public void setupWebDriver(){
        setup = new OrangeLogin(driver);
        System.setProperty(setup.getChromeName(),setup.getChromePath());
        driver = new ChromeDriver();
    }

    @Test(priority = 1)
    public void launchFormPage(){
        formPage = new PracticeFormPage(driver);
        driver.get(formPage.url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @Test(priority = 2)
    public void FillInTheForm() throws Exception {
        formPage.enterFirstName("Hossain");
        formPage.enterLastName("Sharker");
        Thread.sleep(3000);
        //formPage.genderMale();
        formPage.genders();
        Thread.sleep(3000);
        //formPage.expYears5();
        System.out.println("---------------------------");
        formPage.yearsOfExperience();
        Thread.sleep(3000);
        System.out.println("---------------------------");
        formPage.applicationDate("August 11, 2018");
        //formPage.profession();
        Thread.sleep(3000);
        formPage.professions();
        Thread.sleep(3000);
        formPage.selenium();
        Thread.sleep(3000);
        formPage.continents();
        Thread.sleep(3000);
        formPage.selCommands();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void verifyGenders(){
        formPage.submitButton();
    }

}
