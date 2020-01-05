package com.cybertek.step_definitions;

import com.cybertek.pages.LoginBookit;
import com.cybertek.pages.MapPage;
import com.cybertek.pages.SignInPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_steps {
    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlbookit"));
    }


    @When("user logs in as a team member")
    public void user_logs_in_as_a_team_member() {
        System.out.println("logging as member");
        System.out.println("email =" + ConfigurationReader.getProperty("member_email"));
        System.out.println("password =" + ConfigurationReader.getProperty("member_password"));
        SignInPage signInPage = new SignInPage();
        signInPage.email.sendKeys(ConfigurationReader.getProperty("member_email"));
        signInPage.password.sendKeys(ConfigurationReader.getProperty("member_password"));
        signInPage.signIn.click();


    }


    @When("user logs in as a team lead")
    public void user_logs_in_as_a_team_lead() {
        System.out.println("logging as lead");
        SignInPage signInPage = new SignInPage();
        signInPage.email.sendKeys(ConfigurationReader.getProperty("leader_email"));
        signInPage.password.sendKeys(ConfigurationReader.getProperty("leader_password"));
        signInPage.signIn.click();

    }

    @When("user logs in as a teacher")
    public void user_logs_in_as_a_teacher() {
        System.out.println("logging as a teacher");
        SignInPage signInPage = new SignInPage();
        signInPage.email.sendKeys(ConfigurationReader.getProperty("teacher_email"));
        signInPage.password.sendKeys(ConfigurationReader.getProperty("teacher_password"));
        signInPage.signIn.click();
    }
}