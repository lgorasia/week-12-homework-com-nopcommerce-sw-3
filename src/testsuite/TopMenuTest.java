package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void openUp() {
        openBrowser(baseUrl);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

    @Test
//locate computers
    public void userShouldNavigateToComputerPageSuccessfully() {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
         //this is requirement
        String expectedText = "Computers";
        //finding actual text
        String actualText=getTextFromElement(By.tagName("h1"));

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
//locate electonics
    public void userShouldNavigateToElectronicsPageSuccessfully() {
       clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));

        //this is requirement
        String expectedText = "Electronics";
        //finding actual text
        String actualText= getTextFromElement(By.tagName("h1"));

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));

        //this is requirement
        String expectedText = "Apparel";
        //finding actual text
        String actualText = getTextFromElement(By.tagName("h1"));

        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));

        //this is requirement
        String expectedText = "Digital downloads";
        //finding actual text
        String actualText=getTextFromElement(By.tagName("h1"));

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));

        //this is requirement
        String expectedText = "Books";
        //finding actual text
        String actualText =getTextFromElement(By.tagName("h1"));

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));

        //this is requirement
        String expectedText = "Jewelry";
        //finding actual text
        String actualText =  getTextFromElement(By.tagName("h1"));

        Assert.assertEquals(expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));

        //this is requirement
        String expectedText = "Gift Cards";
        //finding actual text
        String actualText =getTextFromElement(By.tagName("h1"));

        Assert.assertEquals(expectedText, actualText);

    }

}
