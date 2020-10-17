package com.orangeHRM.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeLogin {
    WebDriver driver;
    private String url = "https://opensource-demo.orangehrmlive.com/";
    private String chromeName = "webdriver.chrome.driver";
    private String chromePath = "G:\\BrowserDrivers\\ChromeDriver 84.0.4147.30\\chromedriver.exe";
    By userName = By.xpath("//input[@id='txtUsername']");
    By password = By.xpath("//input[@id='txtPassword']");
    By logIn = By.id("btnLogin");
    By forgotPassword = By.linkText("Forgot your password?");

    public OrangeLogin(WebDriver driver){
         this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getChromeName() {
        return chromeName;
    }

    public void setChromeName(String chromeName) {
        this.chromeName = chromeName;
    }

    public String getChromePath() {
        return chromePath;
    }

    public void setChromePath(String chromePath) {
        this.chromePath = chromePath;
    }

    public void typeUserName(){
        driver.findElement(userName).sendKeys("Admin");
        System.out.println("Username Entered Successfully.");
    }
    public void typePassword(){
        driver.findElement(password).sendKeys("admin123");
        System.out.println("Password Entered Successfully.");
    }
    public void clickOnLogin(){
        driver.findElement(logIn).click();
        System.out.println("Clicked on Login button successful.");
    }
    public void returnToPreviousPage(){
        driver.navigate().back();
        System.out.println("Returned to the main page successfully.");
    }
    public void requestPassword(){
        String reqPassword = driver.findElement(forgotPassword).getText();
        System.out.println("Password Request Test: "+ reqPassword);
    }
}
