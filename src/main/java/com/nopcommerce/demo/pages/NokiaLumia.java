package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NokiaLumia extends Utility {

    //By changeQuantity = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCard = By.xpath("//button[@id='add-to-cart-button-20']");
    By closeMessage = By.xpath("//span[@class = 'close']");
    By shoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");
    By clickOnCheckBox = By.xpath("//input[@id='termsofservice']");
    By checkOutButton = (By.id("checkout"));
    By registerTab = By.xpath("//button[contains(text(),'Register')]");



    public void changeNokiaQuantity(){
        WebElement element = driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']"));
        element.clear();
        sendTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"),"2");
    }
    public void addToCartNokia(){
        clickOnElement(addToCard);
    }
    public void closeGreenMessage(){
        clickOnElement(closeMessage);
    }
    public void hoverFromShoppingToGoCart(){
        mouseHoverFromOneElementToAnotherAndClick(shoppingCart,goToCart);
    }
    public void selectClickOnCheckBox(){
        clickOnElement(clickOnCheckBox);
    }
    public void clickOnCheckOut(){
        clickOnElement(checkOutButton);
    }
    public void clickOnRegisterTab(){
        clickOnElement(registerTab);
    }



}
