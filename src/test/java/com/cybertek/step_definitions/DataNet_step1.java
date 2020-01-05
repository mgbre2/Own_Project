package com.cybertek.step_definitions;

import com.cybertek.pages.DataNetTable;
import com.cybertek.utilities.BrowserUtils;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class DataNet_step1 {
    DataNetTable dataNetTable=new DataNetTable();
    @Then("user should enter firstname {string}")
    public void user_should_enter_firstname(String Firstname) {
        dataNetTable.firstname.sendKeys(Firstname);


    }

    @Then("user should enter lastname {string}")
    public void user_should_enter_lastname(String lastname) {
       dataNetTable.lastname.sendKeys(lastname);
    }

    @Then("user should enter position {string}")
    public void user_should_enter_position(String position) {
        dataNetTable.position.sendKeys(position);

    }

    @Then("user should enter office {string}")
    public void user_should_enter_office(String Office) {
       dataNetTable.office.sendKeys(Office);
    }

    @Then("user should enter extention {string}")
    public void user_should_enter_extention(String Extention) {
        dataNetTable.extention.sendKeys(Extention);

    }

    @Then("user should enter startdate {string}")
    public void user_should_enter_startdate(String Date) {
        dataNetTable.date.sendKeys(Date);
    }

    @Then("user should enter salary {string}")
    public void user_should_enter_salary(String Salary) {
        dataNetTable.salaray.sendKeys(Salary);
    }

    @Then("user enter firstname {string} to search box")
    public void user_enter_firstname_to_search_box(String Firstname) {
        dataNetTable.search.sendKeys(Firstname);
    }

    @Then("user can see firstname {string}inserted to the table")
    public void user_can_see_firstname_inserted_to_the_table(String Firstname) {
        String expected="dage";
        BrowserUtils.wait(10);
        String actual=dataNetTable.result.getText();
        Assert.assertTrue(actual.contains(expected));
    }


}
