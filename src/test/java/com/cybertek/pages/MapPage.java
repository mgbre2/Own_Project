package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.WeakHashMap;

public class MapPage extends NavigationMenu{
    public MapPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (css = "div[class='map']")
    public List<WebElement> allrooms;
    @FindBy(linkText = "map")
    public WebElement map;

    @FindBy(css = "a>span.room-name")
    public List<WebElement> copyRooms;
    @FindBy(xpath = "//span[@class='room-name has-text-centered']")
    public List<WebElement>Lastrooms;

    public WebElement room(String roomName) {
        return Driver.getDriver().findElement(By.linkText(roomName));
    }

}
