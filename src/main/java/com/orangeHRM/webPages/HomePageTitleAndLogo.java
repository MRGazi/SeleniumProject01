package com.orangeHRM.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePageTitleAndLogo {
    WebDriver driver;
    WebElement element;
    By homePageLogo = By.xpath("//div[@id='divLogo']//img");

    public HomePageTitleAndLogo(WebDriver driver){
        this.driver = driver;
    }

    public void homePageTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "OrangeHRM";
        Assert.assertEquals(actualTitle, expectedTitle,"Titles do not Match");
        System.out.println("Titles Verified Successfully");
    }

    public void verifyHomepageLogo(){
        element = driver.findElement(homePageLogo);
        Assert.assertTrue(element.isDisplayed(),"Homepage logo is not displayed.");
        System.out.println("Home page logo is displayed on the page.");
    }


}
