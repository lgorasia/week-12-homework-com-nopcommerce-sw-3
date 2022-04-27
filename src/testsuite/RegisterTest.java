package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";
    WebDriver driver;

    @Before
    public void openUp() {
        openBrowser(baseUrl);
    }

   // @After
    public void tearDown() {
        closeBrowser();
    }

    @Test

    public void userShouldNavigateToRegisterPageSuccessfully() {
        // Locate registration link and click the link
        clickOnElement(By.linkText("Register"));

        //This is from requirement
        String expectedMessage = "Register";
        // find the Register text
        String actualmessage = getTextFromElement(By.tagName("h1"));

        Assert.assertEquals(expectedMessage, actualmessage);

    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        // Locate registration link and click the link
        clickOnElement(By.linkText("Register"));

        //select gender radio button
        clickOnElement(By.id("gender-male"));

        // select first name
        sendTextToElement(By.id("FirstName"),"Rahul");
        // select Last name
        sendTextToElement(By.id("LastName"),"Patel");

        //select day
        sendTextToElement(By.name("DateOfBirthDay"),"29");

        // select month
        sendTextToElement(By.name("DateOfBirthMonth"),"May");
        //select year
        sendTextToElement(By.name("DateOfBirthYear"),"1984");
        //enter email
        sendTextToElement(By.id("Email"),"abcdefghi@gmail.com");
        //enter password
        sendTextToElement(By.id("Password"),"1123456789");
        // confirm password
        sendTextToElement(By.id("ConfirmPassword"),"1123456789");
        //Click the register button
        clickOnElement(By.id("register-button"));


        //Find registration completion page
        String expectedMessage = "Your registration completed";
        String actualMessage =  getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));

        Assert.assertEquals(expectedMessage, actualMessage);
    }
}