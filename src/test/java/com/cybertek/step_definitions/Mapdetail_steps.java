package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.MyteamPage;
import com.cybertek.pages.NavigationMenu;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Mapdetail_steps extends NavigationMenu {

@Then("homepage should be displayed")
public void homepage_should_be_displayed() {
    System.out.println("I can see the home page now!!");
    // verify the header
    String expected = "map";

    MapPage mapPage= new MapPage();

        BrowserUtils.waitForVisibility(mapPage.map, 5);

//    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
////        wait.until(ExpectedConditions.textToBePresentInElement(mapPage.header, "map"));
//
//    wait.until(ExpectedConditions.urlContains("map"));

    // ExpectedConditions.url to be

    String actual = mapPage.title.getText();

    // assertions are coming from Junit
    Assert.assertEquals(expected, actual);
}

    @Then("I should be able to see {string} room")
    public void i_should_be_able_to_see_room(String roomName) {
    System.out.println(roomName);
    MapPage mapPage =new MapPage();
    List<String>allrooms=BrowserUtils.getElementsText(mapPage.Lastrooms);
    System.out.println(allrooms);
    Assert.assertTrue(allrooms.contains(roomName));

    }
    @Then("the user should be able to see following conference rooms:")
    public void the_user_should_be_able_to_see_following_conference_rooms(List<String> rooms) {
    MapPage mapPage =new MapPage();
    List<String>allroom=BrowserUtils.getElementsText(mapPage.Lastrooms);
    System.out.println(rooms);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    System.out.println(allroom);
    Assert.assertTrue(allroom.containsAll(rooms));

    }
    @When("the user goes to the {string} page")
    public void the_user_goes_to_the_page(String page) {
    MapPage mapPage=new MapPage();

    switch (page){
        case "hunt":
            mapPage.hunt.click();

            break;
        case "my team":
            mapPage.goToTeam();
            break;
        case "genaral":
            mapPage.goToSchedulGeneral();
            break;
        case "my self":
            mapPage.goToSelf();

            break;

        case "my":
            mapPage.goToMySchedule();
    }

    }

    @Then("following team members should be displayed:")
    public void following_team_members_should_be_displayed(List<String>name) {
    System.out.println(name);
    MyteamPage myteamPage=new MyteamPage();
    List<String>allname=BrowserUtils.getElementsText(myteamPage.AllNameslast);
    System.out.println(allname);
    System.out.println(">>>>>>>>>>>>>>>>>>>>");
        List<String>lname=BrowserUtils.getElementsText(myteamPage.allNames);
        System.out.println(lname);
    Assert.assertTrue(allname.containsAll(name));


    }




}