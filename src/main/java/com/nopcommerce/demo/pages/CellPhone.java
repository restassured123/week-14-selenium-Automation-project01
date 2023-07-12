package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CellPhone extends Utility {
    By listView = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia = By.xpath("//a[@title = 'Show details for Nokia Lumia 1020']");


    public void clickOnListView(){
        clickOnElement(listView);
    }
    public void clickOnNokia(){
        clickOnElement(nokiaLumia);
    }


}
