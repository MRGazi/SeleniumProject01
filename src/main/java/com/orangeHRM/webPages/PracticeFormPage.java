package com.orangeHRM.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class PracticeFormPage {
    WebDriver driver;
    public String url = "https://www.techlistic.com/p/selenium-practice-form.html";
    public PracticeFormPage(WebDriver driver){
          this.driver = driver;
    }
    WebElement element;
    Select items;
    List<WebElement> listedElements;

    By firstName = By.name("firstname");
    By lastName = By.name("lastname");
    By genderMale = By.id("sex-0");
    By genderFemale = By.id("sex-1");
    By genders = By.xpath("//*[@name=\"sex\"]");
    By yoExp = By.xpath("//*[@name=\"exp\"]");
    By expYears1 = By.id("exp-0");
    By expYears2 = By.id("exp-1");
    By expYears3 = By.id("exp-2");
    By expYears4 = By.id("exp-3");
    By expYears5 = By.id("exp-4");
    By expYears6 = By.id("exp-5");
    By expYears7 = By.id("exp-6");
    By datePicker = By.id("datepicker");
    By professionManu = By.id("profession-0");
    By professionAuto = By.id("profession-1");
    By professions = By.xpath("//*[@name=\"profession\"]");
    By toolUFT = By.id("tool-0");
    By protector = By.id("tool-1");
    By selenium = By.id("tool-2");
    By continents = By.id("continents");
    By selCommands = By.id("selenium_commands");
    By upload = By.xpath("//*[@id=\"photo\"]");
    By download = By.partialLinkText(" Click here to Download");
    By submitButton = By.xpath("//*[@id=\"submit\"]");

    public void enterFirstName(String fName){
        driver.findElement(firstName).sendKeys(fName);
    }
    public void enterLastName(String lName){
        driver.findElement(lastName).sendKeys(lName);
    }
    public void genderMale(){
        driver.findElement(genderMale).click();
    }
    public void genderFemale(){
        driver.findElement(genderFemale).click();
    }
    public void genders(){
         listedElements = driver.findElements(genders);
         int genderSize = listedElements.size();
         System.out.println("Total Size of Genders: " + genderSize);
         for (int i = 0; i < genderSize; i++){
             String strValue1 = listedElements.get(i).getAttribute("value");
             if (strValue1.equalsIgnoreCase("Female")){
                 listedElements.get(i).click();
             }
         }

    }
    public void yearsOfExperience(){
        listedElements = driver.findElements(yoExp);
        int yoExpSize = listedElements.size();
        System.out.println("Size of Years of Experience: " + yoExpSize);
        for (int i = 0; i < yoExpSize; i++){
            String strValue1 = listedElements.get(i).getAttribute("value");
            System.out.println("Value: "+strValue1);
            if (strValue1.equalsIgnoreCase("6")){
                listedElements.get(i).click();
            }
        }
    }
    public void professions(){
        listedElements = driver.findElements(professions);
        int sizeOfProfessions = listedElements.size();
        System.out.println("Size of Professions: " + sizeOfProfessions);
        for (int i = 0; i < sizeOfProfessions; i++){
            String strValue = listedElements.get(i).getAttribute("value");
            System.out.println("value: " + strValue);
            listedElements.get(i).click();
        }
        System.out.println("Profession is selected properly.");
    }


    public void expYears1(){
        driver.findElement(expYears1).click();
    }
    public void expYears2(){
        driver.findElement(expYears2).click();
    }
    public void expYears3(){
        driver.findElement(expYears3).click();
    }
    public void expYears4(){
        driver.findElement(expYears4).click();
    }
    public void expYears5(){
        driver.findElement(expYears5).click();
    }
    public void expYears6(){
        driver.findElement(expYears6).click();
    }
    public void expYears7(){
        driver.findElement(expYears7).click();
    }

    public void applicationDate(String date) {
        driver.findElement(datePicker).sendKeys(date);
    }

    public void profession() {
        driver.findElement(professionAuto).click();
    }

    public void selenium() {
        driver.findElement(selenium).click();
    }

    public void continents(){
        element = driver.findElement(continents);
        items = new Select(element);
        items.selectByVisibleText("Australia");
    }

    public void selCommands(){
        element = driver.findElement(selCommands);
        items = new Select(element);
        items.selectByVisibleText("WebElement Commands");
    }
    public void submitButton(){
        element = driver.findElement(submitButton);
        element.click();
    }

}
