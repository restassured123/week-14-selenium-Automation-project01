package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputerPage extends Utility {

        By desktopButton = By.xpath("//div[@class = 'sub-category-item']/h2/a[normalize-space() = 'Desktops']");


        public void clickOnDesktop(){
            clickOnElement(desktopButton);

        }
}

