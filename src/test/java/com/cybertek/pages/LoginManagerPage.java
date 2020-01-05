package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginManagerPage {
    public LoginManagerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement email;
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement password;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement login;
    @FindBy(xpath = "//div[@class='o_thread_title']")
    public WebElement homepage;


}