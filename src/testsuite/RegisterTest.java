package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setBaseUrl() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {
        //click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        // * Verify the text ‘Signing up is easy!’
        String expectedMessage = "Signing up is easy!";
        String actualMessage = getTextFromElement(By.xpath("//h1[text()='Signing up is easy!']"));
        Assert.assertEquals("Signing up is easy!", expectedMessage, actualMessage);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        //click on the ‘Register’ link
        clickOnElement(By.linkText("Register"));
        // Enter First name
        sendTextToElement(By.name("customer.firstName"), "Nem");
        //  Enter Last name
        sendTextToElement(By.name("customer.lastName"), "Mac");
        //Enter Address
        sendTextToElement(By.name("customer.address.street"), "Regal Street");
        //Enter City
        sendTextToElement(By.name("customer.address.city"), "Frankfort");
        //Enter State
        sendTextToElement(By.name("customer.address.state"), "Franklin");
        //     * Enter Zip Code
        sendTextToElement(By.name("customer.address.zipCode"), "1111111");
        //     * Enter Phone
        sendTextToElement(By.name("customer.phoneNumber"), "+95 5555555555");
        //     * Enter SSN
        sendTextToElement(By.name("customer.ssn"), "A1A");
        //     * Enter Username
        sendTextToElement(By.id("customer.username"), "NM121");
//     * Enter Password
        sendTextToElement(By.id("customer.password"), "123456");
//     * Enter Confirm
        sendTextToElement(By.id("repeatedPassword"), "123456");
//     * Click on REGISTER button
        clickOnElement(By.xpath("//input[@value='Register']"));
        String expectedMessage = "Your account was created successfully. You are now logged in.";
        String actualMessage = getTextFromElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']"));
        Assert.assertEquals("Your account was created successfully. You are now logged in.", expectedMessage, actualMessage);
    }
        @After
        public void testDown() {
            closeBrowser();
        }
}

