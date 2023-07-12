package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BuildPage extends Utility {

    By processor = (By.xpath("//select[@id='product_attribute_1']"));
    By ram = By.xpath("//select[@id='product_attribute_2']");
    By hdd = By.xpath("//input[@id='product_attribute_3_7']");
    By os = By.xpath("//input[@id='product_attribute_4_9']");
    By software = (By.id("product_attribute_4_9"));
    By software1 = By.xpath("//input[@id='product_attribute_5_12']");
    By addToCart = By.id("add-to-cart-button-1");
    By closeBar = (By.xpath("//span[@class = 'close']"));
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By checkOnTermsCondition = (By.id("termsofservice"));
    By firstName = (By.id("BillingNewAddress_FirstName"));
    By lastName = (By.id("BillingNewAddress_LastName"));
    By email = (By.id("BillingNewAddress_Email"));
    By selectCountry = (By.xpath("//select[@id='BillingNewAddress_CountryId']"));
    By city = (By.id("BillingNewAddress_City"));
    By address = (By.id("BillingNewAddress_Address1"));
    By postalCode = (By.id("BillingNewAddress_ZipPostalCode"));
    By phoneNumber = (By.id("BillingNewAddress_PhoneNumber"));
    By continueButton = By.xpath("//button[@name = 'save']");
    By checkNextDayAirButton = (By.id("shippingoption_1"));
    By continueShippingButton = By.xpath("//button[text() = 'Continue'][@class = 'button-1 shipping-method-next-step-button']");
    By creditCard = (By.id("paymentmethod_1"));
    By continueCreditCardButton = By.xpath("//div[@id='payment-method-buttons-container']//button[text()='Continue']");
    By masterCard = (By.id("CreditCardType"));
    By cardHolderName = (By.id("CardholderName"));
    By cardNumber = (By.id("CardNumber"));
    By cardExpirationMonth = (By.id("ExpireMonth"));
    By getCardExpirationYear= (By.id("ExpireYear"));
    By cardCode= (By.id("CardCode"));
    By continueButtonPaymentCard = (By.xpath("//div[@id='payment-info-buttons-container']//button[text()='Continue']"));
    By confirmOrder = (By.xpath("//button[contains(text(),'Confirm')]"));
    By continueButtonAfterOrderPlaced= (By.xpath("//button[contains(text(),'Continue')]"));

    public void selectProcessor(String text) {
        selectByValueFromDropDown(processor, text);
    }

    public void selectRam(String text) {
        selectByValueFromDropDown(ram, text);
    }

    public void clickHdd() {
        clickOnElement(hdd);
    }

    public void clickOs() {
        clickOnElement(os);
    }

    public void clickSoftware() {
        clickOnElement(software);
    }

    public void clickSoftwareTwo() {
        clickOnElement(software1);
    }

    public void clickAddToCart() {
        clickOnElement(addToCart);
    }

    public void clickOnCloseBar() {
        clickOnElement(closeBar);
    }

    public void hoverOnShoppingCart() {
        mouseHoverToElement(shoppingCart);
    }

    public void clickOnGoToCart() {
        mouseHoverToElementAndClick(goToCart);
    }

    public void changeQuantity() {
        WebElement element = driver.findElement(By.xpath("//input[@class = 'qty-input']"));
        element.clear();
        sendTextToElement(By.xpath("//input[@class = 'qty-input']"), "2");
    }

    public void termsAndCondition() {
        clickOnElement(checkOnTermsCondition);
    }

    public void enterFirstName(String text) {
        sendTextToElement(firstName, text);
    }

    public void enterLastName(String text) {
        sendTextToElement(lastName, text);
    }

    public void enterEmailAddress(String text) {
        sendTextToElement(email, text);
    }

    public void selectCountryFromList(String text) {
        selectByVisibleTextFromDropDown(selectCountry, text);
    }

    public void setCity(String text) {
        sendTextToElement(city, text);
    }

    public void setAddress(String text) {
        sendTextToElement(address, text);
    }

    public void setPostalCode(String text) {
        sendTextToElement(postalCode, text);
    }

    public void setPhoneNumber(String text) {
        sendTextToElement(phoneNumber, text);
    }

    public void clickContinue() {
        clickOnElement(continueButton);

    }

    public void clickOnNextDayButton() {
        clickOnElement(checkNextDayAirButton);
    }

    public void clickOnContinueShippingButton() {
        clickOnElement(continueShippingButton);
    }

    public void selectCreditCard() {
        clickOnElement(creditCard);
    }

    public void clickOnContinueCreditCardButton() {
        clickOnElement(continueCreditCardButton);
    }

    public void selectMasterCardFomDropDown(String text) {
        selectByValueFromDropDown(masterCard, text);
    }

    public void enterCardHolderName(String text) {
        sendTextToElement(cardHolderName, text);
    }
    public void enterCardNumber(String text){
        sendTextToElement(cardNumber,text);
    }
    public void selectExpireMonth(String text){
        selectByValueFromDropDown(cardExpirationMonth, text);
    }
    public void selectExpireYear(String text){
        selectByValueFromDropDown(getCardExpirationYear, text);
    }

    public void  enterCardCode(String text){
        sendTextToElement(cardCode, text);
    }
    public void clickOnContinueButtonOfPaymentCard(){
        clickOnElement(continueButtonPaymentCard);
    }
    public void clickOnConfirmOrder(){
        clickOnElement(confirmOrder);
    }
    public void continueButtonAfterOrderPlacedSuccessfully(){
        clickOnElement(continueButtonAfterOrderPlaced);
    }

}

