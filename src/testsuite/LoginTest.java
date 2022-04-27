package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {
    String baseUrl="https://demo.nopcommerce.com/";
    @Before
    public void openUp(){
        openBrowser(baseUrl);
    }
   // @After
    public void tearDown(){
        closeBrowser();
    }
    @Test
    public void userShouldNavigateToLoginPageSuccessfully(){
        //find longin link
        clickOnElement(By.linkText("Log in"));

        // required message
        String expectedMessage = "Welcome, Please Sign In!";
        //find welcome text element and get the text
        String actualMessage=getTextFromElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));

        // varification
        Assert.assertEquals("Not nevigate to lonin page", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
//find longin link
        clickOnElement(By.linkText("Log in"));

        //find email field
        sendTextToElement(By.id("Email"),"abcdefgh@gmail.com");
        //find password field
        sendTextToElement(By.id("Password"),"1123456789");
        //find login button and click
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));

        //find log out text
        String expectedText = "Log out";
        // find actual text
        String actualText= getTextFromElement(By.linkText("Log out"));

        Assert.assertEquals(expectedText,actualText);
    }
    @Test
    public void verifyTheErrorMessage(){
        //find longin link
        clickOnElement(By.linkText("Log in"));

        //find email field
        sendTextToElement(By.id("Email"),"abdcdef@gmail.com");
        //find password field
        sendTextToElement(By.id("Password"),"123456f789");
        //find login button and click
        clickOnElement(By.xpath("//button[contains(text(),'Log in')]"));
        // required message
        String expectedmessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actalMessage= getTextFromElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));


        Assert.assertEquals(expectedmessage, actalMessage);

    }
}
