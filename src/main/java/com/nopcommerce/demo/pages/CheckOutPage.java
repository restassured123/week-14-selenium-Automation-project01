package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By clickOnContinue = By.xpath("//button[@class='button-1 new-address-next-step-button']");
    By nextDayButton = By.xpath("//input[@id='shippingoption_1']");
    By continueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By confirmOrder = By.xpath("//button[contains(text(),'Confirm')]");
    By continueButtonThatTakesToHomePage = By.xpath("//button[contains(text(),'Continue')]");



    public void checkOutContinue(){
        clickOnElement(clickOnContinue);
    }
    public void selectNextDayAir(){
        clickOnElement(nextDayButton);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }
    public void clickOnConfirm(){
        clickOnElement(confirmOrder);
    }
    public void setClickOnContinue(){
        clickOnElement(continueButtonThatTakesToHomePage);
    }

}
