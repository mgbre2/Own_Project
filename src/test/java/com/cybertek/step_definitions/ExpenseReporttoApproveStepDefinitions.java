package com.cybertek.step_definitions;

import com.cybertek.pages.ExpenseReportstoApprovePage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.DatabaseUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;


    public class ExpenseReporttoApproveStepDefinitions {
        ExpenseReportstoApprovePage Expo = new ExpenseReportstoApprovePage();

        @Then("user click on Expenses Report to Approve")
        public void user_click_on_Expenses_Report_to_Approve() {
//BrowserUtils.wait(10);
            //BrowserUtils.waitForVisibility(Expo.ExpenseReportsToApp,  3);
            BrowserUtils.waitForClickablility(Expo.ExpenseReportsToApp, 5);
            Expo.ExpenseReportsToApp.click();

        }

        @Then("Expenses Report to Approve should display")
        public void expenses_Report_to_Approve_should_display() {
            Expo.ExpenseReportsToApp.isDisplayed();
        }

        @Then("user click on create button")
        public void user_click_on_create_button() {
            BrowserUtils.wait(5);
            Expo.create.click();
        }

        @When("user click and run the epmloyees dropdown")
        public void user_click_and_run_the_epmloyees_dropdown() {
            BrowserUtils.wait(5);
            Expo.eployee.click();
        }

        @Then("the following employees  should be in database")
        public void the_following_employees_should_be_in_database( List<String> database) {
//BrowserUtils.wait(5);
            List<String> mylist = database;
            System.out.println(database);

            String sql = "select name from hr_employee;";
//BrowserUtils.wait(5);
            List<Object> nameFormData = DatabaseUtility.getColumnData(sql, "name");

            System.out.println(nameFormData);

            for (String s : mylist) {

                Assert.assertTrue(nameFormData.toString().contains(s));
            }
            System.out.println("it is passed");

        }

        @Given("user should enter the Expense Summary Report {string}")
        public void user_should_enter_the_Expense_Summary_Report(String box) {
            //Expo.ExpenseReportsToApp.click();
            //Expo.create.click();
            Expo.summarybox.sendKeys(box);

        }

        @Given("user click and sellect from the Employee box")
        public void user_click_and_sellect_from_the_Employee_box() {
            Expo.eployee.click();
            Expo.demouser.click();
        }


        @Given("user click on save buttonThen all the following should be in database")
        public void user_click_on_save_buttonThen_all_the_following_should_be_in_database
                (List<String>box1) {
            List<String>mybox = box1;


            String sql="select * from hr_expense;";
            for (String s:mybox){
                System.out.println(s);
                List<Object> datafromDB = DatabaseUtility.getColumnData(sql,"name");
                Assert.assertTrue(datafromDB.toString().contains(s));
            }

        }



    }




/*
List<WebElement> icons = new ArrayList<>();
        List<String> nameIcons = new ArrayList<>();

        for(int i=1; i < 4; i++){
            icons.add(expensesAnalysisPage.GraphicsIcons.get(i));
       }

        for(WebElement icon : icons){
           System.out.println(icon.getAttribute("data-original-title"));
           nameIcons.add(icon.getAttribute("data-original-title"));
        }

        Assert.assertTrue(nameIcons.containsAll(iconNames));
        System.out.println("Verify");
  // get the name of the team, it will be used to get tem id
        MyTeamPage myTeamPage = new MyTeamPage();
        BrowserUtils.wait(3);
        String teamName = myTeamPage.teamName.getText();
        System.out.println(teamName);
        // build the sql based on the team name
        String sql = "select u.firstname " +
                " from users u join team t on t.id = " +
                "u.team_id and t.name = '" + teamName + "';";
        // getColumnData returns data of a single column
        List<Object> names = DatabaseUtility.getColumnData(sql, "firstname");

        System.out.println(names);
        // get the actual name
        List<String> actualNames = BrowserUtils.getElementsText(myTeamPage.allNames);

        Assert.assertEquals(names.size(), actualNames.size());
        // make sure all names appear in the expected list
        for (Object name : names) {
            Assert.assertTrue(actualNames.contains(name.toString()));
    @Then("the following employees  should be in database")
    public void the_following_employees_should_be_in_database(List<String> employees) {
        //List<WebElement> results = Expo.allemployees;
        //List<String> databaseinfo = new ArrayList<>();
        String sql = "";

        //for (WebElement result : results) {
        // System.out.println(result.getAttribute("data-original-title"));
        //databaseinfo.add(result.getAttribute("data-original-title"));


        List<Object> names = DatabaseUtility.getColumnData(sql, "firstname");

        System.out.println(names);
        // get the actual name
        List<String> Eemployees = BrowserUtils.getElementsText(Expo.allemployees);

        Assert.assertEquals(names.size(), Eemployees.size());
        // make sure all names appear in the expected list
        for (Object name : names) {
            Assert.assertTrue(Eemployees.contains(name.toString()));
        }
    }
        @Then("user should enter the Expense Summary Report {string}")
        public void user_should_enter_the_Expense_Summary_Report(List<String> boxs) {

        }

        @Then("user click and sellect from the Employee box")
        public void user_click_and_sellect_from_the_Employee_box() {

        Expo.eployee.click();
        Expo.demouser.click();
        }

        @Then("user click on save button")
        public void user_click_on_save_button() {
            Expo.save.click();
        }

        @Then("all the following should be in database")
        public void all_the_following_should_be_in_database() {

        }
*/

