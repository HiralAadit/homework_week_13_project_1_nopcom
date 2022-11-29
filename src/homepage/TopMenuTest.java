package homepage;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

import java.util.Locale;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";



    @Before
    public void setBaseUrl() {
        openBrowser(baseUrl);
    }
//public void selectMenu(String menu){
//    String mainmenu = menu.toLowerCase();
//    String expression = "//a[@href ='/" + mainmenu + "']";
//    driver.findElement(By.xpath(expression)).click();
//}
    public void selectMenu(String menu) {
        String mainmanu = menu.toLowerCase();
        if (mainmanu == "computers ") {
            //locate computer on menu and click it
            clickOnElement(By.linkText("Computers"));
            //Get title
            String title = driver.getTitle();
            //validate page navigation by assert
            Assert.assertEquals("title not mention:", "NopCommerce demo store. Computer.title");
        } else if (mainmanu == "electronics") {
            //locate computer on menu and click it
            clickOnElement(By.linkText("Electronics"));
            //Get title
            String title = driver.getTitle();
            //validate page navigation by assert
            Assert.assertEquals("title not mention:", "NopCommerce demo store. Computer.title");
        } else if (mainmanu == "apparel") {
            //locate computer on menu and click it
            clickOnElement(By.linkText("Apparel"));
            //Get title
            String title = driver.getTitle();
            //validate page navigation by assert
            Assert.assertEquals("title not mention:", "NopCommerce demo store. Computer.title");
        } else if (mainmanu == "digital downloads") {
            //locate computer on menu and click it
            clickOnElement(By.linkText("Digital downloads"));
            //Get title
            String title = driver.getTitle();
            //validate page navigation by assert
            Assert.assertEquals("title not mention:", "NopCommerce demo store. Computer.title");
        } else if (mainmanu == "books") {
            //locate computer on menu and click it
            clickOnElement(By.linkText("Books"));
            //Get title
            String tile = driver.getTitle();
            //validate page navigation by assert
            Assert.assertEquals("title not mention:", "NopCommerce demo store. Computer.title");
        } else if (mainmanu == "jewelry") {
            //locate computer on menu and click it
            clickOnElement(By.linkText("Jewelry"));
            //Get title
            String tile = driver.getTitle();
            //validate page navigation by assert
            Assert.assertEquals("title not mention:", "NopCommerce demo store. Computer.title");
        } else if (mainmanu == "gift Cards ") {
            //locate computer on menu and click it
            clickOnElement(By.linkText("Gift Cards "));
            //Get title
            String tile = driver.getTitle();
            //validate page navigation by assert
            Assert.assertEquals("title not mention:", "NopCommerce demo store. Computer.title");
        } else {
            System.out.println("please enter valid top mane name");
        }
    }
        @Test
        public void verifyPageNavigation(){
            selectMenu("Computers");
            selectMenu("Electronics");
            selectMenu("Apparel");
            selectMenu("Digital downloads");
            selectMenu("Books");
            selectMenu("Jewelry");

        }
    }
