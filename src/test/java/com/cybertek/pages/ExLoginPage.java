package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExLoginPage {
    public ExLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "#login")
    public WebElement email;
    @FindBy (css = "#password")
    public WebElement password;
    @FindBy(xpath = "//*[.='Log in']")
    public WebElement Sigin;
    @FindBy(xpath = "//*[.='Congratulations, your inbox is empty']")
    public WebElement creat;
}
