package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyteamPage extends NavigationMenu {

//    public MyteamPage(){
//        PageFactory.initElements(Driver.getDriver(),this);
//    }
//    @FindBy(linkText = "my")
//    public WebElement my;
//    @FindBy(xpath = "(//a[@class='navbar-item'])[6]")
//    public WebElement self;
//    @FindBy(css = "hr[class='navbar-divider']")
//    public WebElement team;


    @FindBy(css = "div[class='main-wrap center-vertically']")
    public List<WebElement>names;

    @FindBy(xpath = "//p[.='name']/../p[1]")
    public List<WebElement> allNames;

    @FindBy(xpath = "//p[.='role']/../p[1]")
    public List<WebElement> allRoles;
    @FindBy(linkText = "map")
    public WebElement map;

    @FindBy(css ="p[class='title is-6']")
    public List<WebElement> AllNameslast;




}
