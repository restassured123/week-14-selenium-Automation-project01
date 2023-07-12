package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    ComputerPage computerPage = new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildPage buildPage = new BuildPage();
    CellPhone cellPhone = new CellPhone();
    NokiaLumia nokiaLumia = new NokiaLumia();
    RegisterPage registerPage = new RegisterPage();
    ShoppingCart shoppingCart = new ShoppingCart();
    CheckOutPage checkOutPage = new CheckOutPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        homePage.moveToElementToAnotherAndCLick();
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Cell phones')]"), "Cell phones");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.moveToElementToAnotherAndCLick();
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Cell phones')]"), "Cell phones");
        cellPhone.clickOnListView();
        Thread.sleep(2000);
        cellPhone.clickOnNokia();
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"), "Nokia Lumia 1020");
        verifyTwoStrings(By.xpath("//span[@id='price-value-20']"), "$349.00");
        nokiaLumia.changeNokiaQuantity();
        nokiaLumia.addToCartNokia();
        Thread.sleep(2000);
        verifyTwoStrings(By.xpath("//p[@class = 'content']"), "The product has been added to your shopping cart");
        nokiaLumia.closeGreenMessage();
        Thread.sleep(2000);
        nokiaLumia.hoverFromShoppingToGoCart();
        Thread.sleep(2000);
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Shopping cart')]"), "Shopping cart");
        Thread.sleep(2000);
        //verifyTwoStrings(By.xpath("//input[@class = 'qty-input']"),"2");
        Thread.sleep(2000);
        verifyTwoStrings(By.xpath("//span[text()='$698.00'][@class = 'product-subtotal']"), "$698.00");
        Thread.sleep(2000);
        nokiaLumia.selectClickOnCheckBox();

        nokiaLumia.clickOnCheckOut();
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"), "Welcome, Please Sign In!");
        nokiaLumia.clickOnRegisterTab();
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Register')]"), "Register");
        registerPage.selectGender();
        registerPage.enterFirstName("Dhiren");
        registerPage.enterLastName("Ganvir");
        registerPage.enterEmail("d@gmail.com");
        registerPage.enterPassword("Prime123");
        registerPage.confirmPassword("Prime123");
        registerPage.clickOnRegisterTab();
        verifyTwoStrings(By.xpath("//div[contains(text(),'Your registration completed')]"), "Your registration completed");
        registerPage.clickOnContinueTab();
        Thread.sleep(2000);
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Shopping cart')]"), "Shopping cart");
        Thread.sleep(2000);
        loginPage.clickOnLogIn();
        loginPage.enterEmail("d@gmail.com");
        loginPage.enterPassword("Prime123");
        loginPage.setClickOnLogIn();
        shoppingCart.clickOnTermsAndCondition();
        shoppingCart.clickOnCheckOut();
        checkOutPage.checkOutContinue();
        Thread.sleep(2000);
        buildPage.selectCountryFromList("United Kingdom");
        Thread.sleep(2000);
        buildPage.setCity("London");
        buildPage.setAddress("124 kings way");
        buildPage.setPostalCode("NW10 5UL");
        buildPage.setPhoneNumber("07111222333");
        Thread.sleep(2000);
        buildPage.clickContinue();
        Thread.sleep(2000);

        checkOutPage.selectNextDayAir();
        checkOutPage.clickOnContinue();
        buildPage.selectCreditCard();
        buildPage.clickOnContinueCreditCardButton();
        buildPage.selectMasterCardFomDropDown("MasterCard");
        buildPage.enterCardHolderName("dj");
        buildPage.enterCardNumber("5654234596545478");
        buildPage.selectExpireMonth("5");
        buildPage.selectExpireYear("2030");
        buildPage.enterCardCode("123");
        buildPage.clickOnContinueButtonOfPaymentCard();
        verifyTwoStrings(By.xpath("//li[@class='payment-method']"), "Payment Method: Credit Card");
        verifyTwoStrings(By.xpath("//li[@class='shipping-method']"), "Shipping Method: Next Day Air");
        verifyTwoStrings(By.xpath("//span[text()='$698.00'][@class = 'product-subtotal']"), "$698.00");
        checkOutPage.clickOnConfirm();
        verifyTwoStrings(By.xpath("//h1[contains(text(),'Thank you')]"), "Thank you");
        verifyTwoStrings(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"), "Your order has been successfully processed!");
        checkOutPage.setClickOnContinue();
        verifyTwoStrings(By.xpath("//h2[contains(text(),'Welcome to our store')]"), "Welcome to our store");
        homePage.clickOnLogOut();
        String eurl = "https://demo.nopcommerce.com/";
        String aurl = driver.getCurrentUrl();
        Assert.assertEquals(eurl, aurl);

    }

}

