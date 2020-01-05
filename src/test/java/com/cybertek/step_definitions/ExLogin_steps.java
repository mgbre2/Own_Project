package com.cybertek.step_definitions;

import com.cybertek.pages.ExLoginPage;
import com.cybertek.pages.SignInPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.an.E;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import javax.security.auth.login.Configuration;

import static com.cybertek.utilities.ApplicationConstants.EMPTY_INBOX_MESSAGE;

public class ExLogin_steps {
    @Given("manager should be able to navigate to the url")
    public void manager_should_be_able_to_navigate_to_the_url() {
        System.out.println("i am logging");
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("manager signs in the home page")
    public void manager_signs_in_the_home_page() {
        System.out.println("email=" +ConfigurationReader.getProperty("manager_username"));
        System.out.println("password=" +ConfigurationReader.getProperty("manager_password"));
        ExLoginPage exLoginPage =new ExLoginPage();
        exLoginPage.email.sendKeys(ConfigurationReader.getProperty("manager_username"));
        exLoginPage.password.sendKeys(ConfigurationReader.getProperty("manager_password"));
        exLoginPage.Sigin.click();
    }

    @Then("manager should see an empty message {string}")
    public void manager_should_see_an_empty_message(String emptyMessage) {
        emptyMessage = EMPTY_INBOX_MESSAGE;

        System.out.println(emptyMessage);
    }

    @Then("manager should be able to verify the empty message")
    public void manager_should_be_able_to_verify_the_empty_message() {
        ExLoginPage exLoginPage =new ExLoginPage();

        String actual = "Congratulations, your inbox is empty";
        String expected = exLoginPage.creat.getText();
        Assert.assertEquals(expected, actual);

    }
}
