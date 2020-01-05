package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoomPage extends NavigationMenu{
    public RoomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//p[@class='subtitle is-7'])[1]")
    public WebElement capacityQuote;

    @FindBy(className = "room-info-icon")
    public WebElement capacityImg;

    @FindBy(xpath = "(//p[@class='title is-6'])[2]")
    public WebElement equipment;

}
