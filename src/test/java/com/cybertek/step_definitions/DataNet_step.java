package com.cybertek.step_definitions;

import com.cybertek.pages.DataNetTable;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DataNet_step {
    DataNetTable dataNetTable=new DataNetTable();

    @Given("user is on the homepage datatable website")
    public void user_is_on_the_homepage_datatable_website() {
        Driver.getDriver().get("https://editor.datatables.net/");
    }

    @When("user click on usernew button")
    public void user_click_on_usernew_button() {
        dataNetTable.newname.click();

    }

    @Then("user should see the create new entry")
    public void user_should_see_the_create_new_entry() {
        Assert.assertTrue(dataNetTable.form.isDisplayed());
    }

    @Then("user should enter firstname")
    public void user_should_enter_firstname() {
        dataNetTable.firstname.sendKeys("john");
    }

    @Then("user should enter lastname")
    public void user_should_enter_lastname() {
       dataNetTable.lastname.sendKeys("james");
    }

    @Then("user should enter position")
    public void user_should_enter_position() {
       dataNetTable.position.sendKeys("worker");
    }

    @Then("user should enter office")
    public void user_should_enter_office() {
        dataNetTable.office.sendKeys("dc");
    }

    @Then("user should enter extention")
    public void user_should_enter_extention() {
       dataNetTable.extention.sendKeys("45");
    }

    @Then("user should enter startdate")
    public void user_should_enter_startdate() {
       dataNetTable.date.sendKeys("2011-07-04");
    }

    @Then("user should enter salary")
    public void user_should_enter_salary() {
       dataNetTable.salaray.sendKeys("40000");
    }

    @Then("user should click create button")
    public void user_should_click_create_button() {
        dataNetTable.create.click();
    }

    @Then("user enter firstname to search box")
    public void user_enter_firstname_to_search_box() {
       dataNetTable.search.sendKeys("john");
    }

    @Then("user can see firstname inserted to the table")
    public void user_can_see_firstname_inserted_to_the_table() {
        String expected="john";
        String acual=dataNetTable.result.getText();
        Assert.assertTrue(acual.contains(expected));

    }


}
