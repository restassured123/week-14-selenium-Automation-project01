package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By login = (By.xpath("//a[contains(text(),'Log in')]"));
    By email = (By.id("Email"));
    By password= (By.id("Password"));
    By clickOnLogIn = (By.xpath("//button[contains(text(),'Log in')]"));



    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
    public void clickOnLogIn(){
        clickOnElement(login);
    }
    public void enterEmail(String text){
        sendTextToElement(email,text);
    }
    public void enterPassword(String text){
        sendTextToElement(password,text);
    }
    public void setClickOnLogIn(){
        clickOnElement(clickOnLogIn);
    }

}
