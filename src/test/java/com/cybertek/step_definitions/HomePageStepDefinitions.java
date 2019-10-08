package com.cybertek.step_definitions;

public class HomePageStepDefinitions {
          
//     @Then("verify new report file has correct extension")
//     public void verify_new_report_file_has_correct_extension() {
//         // go to downloads folder
//         String downloads = System.getProperty("user.home") + "/Downloads";
//         // select the most recent file
//         mostRecentFile = FileUtility.getMostRecentFile(downloads);
//         // it should be our new report file, verify extension
//         Assert.assertNotNull("File not found", mostRecentFile);
//         Assert.assertTrue("Extension must be xlsx", mostRecentFile.endsWith("xlsx"));

//     }

//     @Then("report file has correct number of rows")
//     public void report_file_has_correct_number_of_rows() {
//         String sheetName = "Random generator";
//         report = new ExcelUtil(mostRecentFile, sheetName);

//         int actual = report.rowCount();
//         int expectedRowNum = 51;
//         Assert.assertEquals("Row number did not match", expectedRowNum, actual);

//     }

//     @Then("report file has correct column names")
//     public void report_file_has_correct_column_names() {
//         List<String> actualColNames = report.getColumnsNames();
//         List<String> expColNames = Arrays.asList("First Name", "Last Name", "Gender", "Age", "Email", "Phone");

//         Assert.assertEquals("Headers did not match", expColNames, actualColNames);
//     }

}
