package com.cybertek.step_definitions;

import com.cybertek.pages.LoginManagerPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class LoginManager_spteps {

    LoginManagerPage log=new LoginManagerPage();
    @Given("user lands to the login page")
    public void user_lands_to_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }

    @Then("user should login as {string} and {string}")
    public void user_should_login_as_and(String email, String pass) {
        log.email.sendKeys(email);
        log.password.sendKeys(pass);
        log.login.click();

    }

    @Then("home page sould diplayed")
    public void home_page_sould_diplayed() {
        String expected ="Congratulations, your inbox is empty";

String atual =log.homepage.getText();
        Assert.assertEquals(expected,atual);
//        Driver.getDriver().close();
    }



}
