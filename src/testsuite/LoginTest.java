package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setBaseUrl() {
        openBrowser(baseUrl);
    }
   /* public String getTextFromElement(By by){
        WebElement actualTextMessageElement = driver.findElement(by);
        return actualTextMessageElement.getText();
        }
    */

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // Enter valid username
        sendTextToElement(By.name("username"), "Nem");
        //Enter valid password
        sendTextToElement(By.name("password"), "123456");
        //Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//input[@class='button']"));
        //Verify the ‘Accounts Overview’ text is display
        //String expectedMessage = "‘Accounts Overview";
       // String actualMessage = getTextFromElement(By.xpath(""));
       // Assert.assertEquals("‘Accounts Overview", expectedMessage, actualMessage);

    }

    @Test
    public void verifyTheErrorMessage() {
        // Enter invalid username
        sendTextToElement(By.name("username"), "Nam");
        // Enter invalid password
        sendTextToElement(By.name("password"), "133456");
        //  Click on Login button
        clickOnElement(By.xpath("//input[@class='button']"));
        //Verify the error message ‘The username and password could not be verified.
        String expectedMessage = "The username and password could not be verified";
        String actualMessage = getTextFromElement(By.xpath(""));
        Assert.assertEquals("‘The username and password could not be verified", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLogOutSuccessfully(){
         // Enter valid username
        sendTextToElement(By.name("username"), "Nema");

         // Enter valid password
        sendTextToElement(By.name("password"), "1234567");
         // Click on ‘LOGIN’ button
        clickOnElement(By.xpath("//input[@class='button']"));
        // Click on ‘Log Out’ link
        clickOnElement(By.xpath("//a[text()='Log Out']"));
         //Verify the text ‘Customer Login’




        //@After
        //  public void testDown() {
        //    closeBrowser();
        //  }
    }
}





