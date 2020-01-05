package com.cybertek.step_definitions;

public class creat_steps {
    //LoginPage login = new LoginPage();

    //CreatePage creat = new CreatePage();

    /*
        Test case # 1:
        Scenario: Verify the empty message on login home page
        Given manager should be able to navigate to the url
        When  manager signs in the home page
        Then  manager should see an empty message "emptyMessage"
        And manager should be able to verify the empty message


    @Given("manager should be able to navigate to the url")
    public void manager_should_be_able_to_navigate_to_the_url() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("manager signs in the home page")
    public void manager_signs_in_the_home_page() {
        login.Database.click();
        login.Email.sendKeys(ConfigurationReader.getProperty("managerUser"));
        login.Password.sendKeys(ConfigurationReader.getProperty("managerPassword"));
        login.LoginBtn.click();
        BrowserUtils.wait(5);
    }

    @Then("manager should see an empty message {string}")
    public void manager_should_see_an_empty_message(String emptyMessage) {

        emptyMessage = EMPTY_INBOX_MESSAGE;

        System.out.println(emptyMessage);
    }

    @Then("manager should be able to verify the empty message")
    public void manager_should_be_able_to_verify_the_empty_message() {

        String actual = "Congratulations, your inbox is empty";
        String expected = creat.emptyMessage.getText();
        Assert.assertEquals(expected, EMPTY_INBOX_MESSAGE);
    }

    /*
    Test case # 2:
    Scenario: Verify the empty message on login home page
    Given manager is on home page
    When  manager clicks on Manufacturing module
    Then  manager should be able to see Manufacturing Orders page
    And manager should be able to verify Manufacturing Orders text
    */

    // @Given("manager is on home page")
    /*
    public void manager_is_on_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        login.Database.click();
        login.Email.sendKeys(ConfigurationReader.getProperty("managerUser"));
        login.Password.sendKeys(ConfigurationReader.getProperty("managerPassword"));
        login.LoginBtn.click();
        BrowserUtils.wait(5);

    }

    @When("manager clicks on Manufacturing module")
    public void manager_clicks_on_Manufacturing_module() {

        creat.manufacture.click();
    }

    @Then("manager should be see BriteERP logo at the top left")
    public void manager_should_be_see_BriteERP_logo_at_the_top_left() {

        Assert.assertTrue(creat.briteErpLogo.isDisplayed());
    }


    @Then("manager should be able to verify Manufacturing Orders text")
    public void manager_should_be_able_to_verify_Manufacturing_Orders_text() {

        String actual = "Manufacturing Orders";
        String expected = creat.ordersMessage.getText();

        Assert.assertEquals(actual, expected);
    }

        Test Case # 3:

        Scenario: Verify the list of available items
        When  manager clicks on Materials Availability
        Then  manager should see a list of Partial Available items
        And manager should be able to verify the list of Partial Available items



    @When("manager clicks on Materials Availability")
    public void manager_clicks_on_Materials_Availability() {
        creat.materialsAvaillability.click();
        BrowserUtils.wait(5);

    }

    @Then("manager should see a list of Partial Available items")
    public void manager_should_see_a_list_of_Partial_Available_items() {

        for (int idx = 0; idx < creat.partiallyAvaillable.size(); idx++){

            System.out.println(creat.partiallyAvaillable.get(idx).getText());
        }

    }

    @Then("manager should be able to verify the list of Partial Available items")
    public void manager_should_be_able_to_verify_the_list_of_Partial_Available_items() {

        for (int idx = 0; idx < creat.partiallyAvaillable.size(); idx++) {

            Assert.assertTrue(creat.partiallyAvaillable.get(idx).getText().contains("Partially Available"));
        }
      }


        Test Case # 4:

        Scenario: Verify the finish product message
        When  manager clicks on create button
        Then  manager should see a new window page
        And manager clicks on Finished Products link
        And manager should be able to verify the Finish Product Standard Message



    @When("manager clicks on create button")
    public void manager_clicks_on_create_button() {

        creat.manufacture.click();
        BrowserUtils.wait(3);
        creat.createBtn.click();
    }

    @Then("manager should see a new window page")
    public void manager_should_see_a_new_window_page() {

        Assert.assertTrue(creat.newLink.isDisplayed());

    }

    @Then("manager clicks on Finished Products link")
    public void manager_clicks_on_Finished_Products_link() {

        creat.finishProducts.click();
        System.out.println("This message should show up: " + FINISH_PRODUCTS_MESSAGE);
    }

    @Then("manager should be able to verify the Finish Product Standard Message")
    public void manager_should_be_able_to_verify_the_Finish_Product_Standard_Message() {

        String actual = "Use the Produce button or process the work orders to create some finished products.";
        String expected = creat.finishText.getText();

        Assert.assertEquals(expected, actual);

    }




*/









}


