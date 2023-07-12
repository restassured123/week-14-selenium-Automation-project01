package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ComputerPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildPage buildPage = new BuildPage();

    @Test
    public void verifyProductArrangeInAlphabeticalOrder(){
        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.sortByButton();
        // Storing in Descending order.
        List<WebElement> DesktopListInDescendingOrder = driver.findElements(By.xpath("//div[@class = 'details']//a"));
        List<String> desktopListBefore = new ArrayList<>();
        for (WebElement value : DesktopListInDescendingOrder) {
            desktopListBefore.add(value.getText());
        }
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.setSortByAToZ();
        Thread.sleep(2000);
        desktopPage.clickAddToCardButton();

        Thread.sleep(2000);
        String expected = "Build your own computer";
        String actual = getTextFromElement(By.xpath("//h1[contains(text(),'Build your own computer')]"));
        Assert.assertEquals(actual, expected);
        buildPage.selectProcessor("1");
        buildPage.selectRam("5");
        buildPage.clickHdd();
        buildPage.clickOs();
        buildPage.clickSoftware();
        buildPage.clickSoftwareTwo();
        String eprice = "$1,475.00";
        String aprice = driver.findElement(By.xpath("//span[normalize-space() = '$1,475.00']")).getText();
        Assert.assertEquals(eprice, aprice);
        buildPage.clickAddToCart();
        String expectedMessage1 = "The product has been added to your shopping cart";
        String actualMessage1 = getTextFromElement(By.xpath("//p[@class = 'content']"));
        Assert.assertEquals(expectedMessage1,actualMessage1);
        buildPage.clickOnCloseBar();
        Thread.sleep(2000);
        buildPage.hoverOnShoppingCart();
        Thread.sleep(2000);
        buildPage.clickOnGoToCart();
        Thread.sleep(2000);
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Shopping cart')]"),"Shopping cart");
        Thread.sleep(2000);
        buildPage.changeQuantity();
        clickOnElement(By.id("updatecart"));
        verifyTwoStrings(By.xpath("//span[text()='$2,950.00'][@class = 'product-subtotal']"),"$2,950.00");
        Thread.sleep(2000);
        buildPage.termsAndCondition();
        clickOnElement(By.id("checkout"));
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"), "Welcome, Please Sign In!");
        clickOnElement(By.xpath("//button[contains(text(),'Checkout as Guest')]"));
        buildPage.enterFirstName("dj");
        buildPage.enterLastName("Ganvir");
        buildPage.enterEmailAddress("prime123@gmail.com");
        buildPage.selectCountryFromList("United Kingdom");
        Thread.sleep(2000);
        buildPage.setCity("London");
        buildPage.setAddress("124 kings way");
        buildPage.setPostalCode("NW10 5UL");
        buildPage.setPhoneNumber("07111222333");
        buildPage.clickContinue();
        buildPage.clickOnNextDayButton();
        buildPage.clickOnContinueShippingButton();
        buildPage.selectCreditCard();
        buildPage.clickOnContinueCreditCardButton();
        buildPage.selectMasterCardFomDropDown("MasterCard");
        buildPage.enterCardHolderName("dj");
        buildPage.enterCardNumber("5654234596545478");
        buildPage.selectExpireMonth("5");
        buildPage.selectExpireYear("2030");
        buildPage.enterCardCode("123");
        buildPage.clickOnContinueButtonOfPaymentCard();
        verifyTwoStrings(By.xpath("//li[@class='payment-method']"),"Payment Method: Credit Card");
        verifyTwoStrings(By.xpath("//li[@class='shipping-method']"),"Shipping Method: Next Day Air");
        verifyTwoStrings(By.xpath("//span[text()='$2,950.00'][@class = 'product-subtotal']"), "$2,950.00");
        buildPage.clickOnConfirmOrder();
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Thank you')]"),"Thank you");
        verifyTwoStrings(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"),"Your order has been successfully processed!");
        buildPage.continueButtonAfterOrderPlacedSuccessfully();
        verifyTwoStrings(By.xpath("//h2[contains(text(),'Welcome to our store')]"),"Welcome to our store");






















    }

}
