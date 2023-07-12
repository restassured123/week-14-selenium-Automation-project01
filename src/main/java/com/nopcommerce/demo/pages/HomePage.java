package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By computerButton = By.xpath("//a[text()='Computers ']");
    By electronicButton = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space() = 'Electronics']");
    By cellPhone = By.xpath("//a[text() = 'Cell phones ']");
    By logOutButton = By.xpath("//a[contains(text(),'Log out')]");




    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }
    public void clickOnComputer() {
        clickOnElement(computerButton);
    }
    public void moveToElementToAnotherAndCLick(){
        mouseHoverFromOneElementToAnotherAndClick(electronicButton,cellPhone);
    }
    public void clickOnLogOut(){
        clickOnElement(logOutButton);
    }




}

