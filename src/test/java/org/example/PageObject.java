package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

//PageFactory allows us to create test pages with the same mechanism behind it.
// This way, we don’t need to write WebDriver initialization code for each of our pages.
public class PageObject {
    protected WebDriver driver;

    public PageObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

