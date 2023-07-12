package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By genderTab = By.id("gender-male");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By emailId= By.id("Email");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By clickOnRegister = By.id("register-button");
    By continueTab = By.xpath("//a[contains(text(),'Continue')]");


    public void selectGender() {
        clickOnElement(genderTab);
    }
    public void enterFirstName(String text) {
        sendTextToElement(firstName, text);
    }
    public void enterLastName(String text) {
        sendTextToElement(lastName, text);
    }
    public void enterEmail(String text){
        sendTextToElement(emailId,text);

    }
    public void enterPassword(String text){
        sendTextToElement(password,text);
    }
    public void confirmPassword(String text){
        sendTextToElement(confirmPassword,text);
    }
    public void clickOnRegisterTab(){
        clickOnElement(clickOnRegister);
    }
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }
}
