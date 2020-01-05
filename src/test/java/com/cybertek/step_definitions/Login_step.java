package com.cybertek.step_definitions;

import com.cybertek.pages.MapPage;
import com.cybertek.pages.NavigationMenu;
import com.cybertek.pages.SignInPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_step extends NavigationMenu {





    @When("user logs in using {string} and {string}")
    public void user_logs_in_using_and(String email, String password) {
        System.out.println("Email: "+ email);
         System.out.println("Password: "+ password);
        SignInPage signInPage=new SignInPage();
        signInPage.login(email,password);

    }


    @Then("title should be {string}")
    public void title_should_be(String title) {
        System.out.println("title: "+title);

    }

    @Then("there should be {int} menu options")
    public void there_should_be_menu_options(Integer count) {
        System.out.println("count =" +count);

}
}