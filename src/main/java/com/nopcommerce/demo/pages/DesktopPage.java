package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By sortByButton = (By.xpath(" //option[contains(text(),'Name: Z to A')]"));
    By sortByAToZ = By.xpath("//option[contains(text(),'Name: A to Z')]");
    By addToCardButton = By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]");

    public void sortByButton(){
        clickOnElement(sortByButton);
    }
    public void setSortByAToZ(){
        clickOnElement(sortByAToZ);
    }
    public void clickAddToCardButton(){
        clickOnElement(addToCardButton);
    }


}
