package utilities;

import browesertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    /**
     * THis method will click on element
     */
    public void clickOnElement(By by) {
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    /*This method will send on element
     */
    public String getTextFromElement(By by) {
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
    }
    //Homework 4 method acceptAlert,dismissAlert, getTextFromAlert, sendtoAlert(String text)
    //******* Select class Methods**********************

    //this method will swith to alert
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    //this method will switch to alert
    //acceptAlert
    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
    //dismissAlert
    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }
    //String getTextFromAlert
    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }
    //sendTextToAlert(String text)
    public void sendTextToAlert(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    //This method will select option by visible text
    public void selectByVisibleTextFromDropDown(By by,String text){
        WebElement drodown = driver.findElement(by);
        Select select = new Select(drodown);
        select.selectByVisibleText(text);
    }
    // This method will select the option by value
    public void selectByValue(By by, String text) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByValue(text);
    }
    // This method will select the option by index(int)

    public void selectByIndex(By by, int index) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByIndex(index);
    }
    // This method will select the option by contains text
    public void selectByContainsText(By by, String text1) {
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        selectByContainsText(by, text1);
    }
    //*****************************Window Handle*****************************





    //*****************************************Action Class**************************
    //mouseHoverTOElement(By by)
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        WebElement mouseHoverToElement = driver.findElement(by);
        //mouseHoverToElement(by);
        actions.moveToElement(mouseHoverToElement).build().perform();
    }
    //mouseHoverToElementAndClick(By by)
    public void mouseHoverToElementAndclick(By by){
        Actions actions = new Actions(driver);
        WebElement mouseHoverClick = driver.findElement(by);
        actions.moveToElement(mouseHoverClick).click().build().perform();
    }
    // in hw create othe 2 method Index &....

    /*/**
     * This method will select the option by value
     */

    /**
     * This method will select the option by index
     */

    /**
     * This method will select the option by contains text
     */
//***************** Window handle***************
    //****************** Action Class**************
//mouseHoverToElementAndClick(By by)
}





