package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {

    By termsAndCondition = (By.id("termsofservice"));
    By checkOutButton = By.xpath("//button[@id='checkout']");


    public void clickOnTermsAndCondition(){
        clickOnElement(termsAndCondition);
    }
    public void clickOnCheckOut(){
     clickOnElement(checkOutButton);
    }
}

