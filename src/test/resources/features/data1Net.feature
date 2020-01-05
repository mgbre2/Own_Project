Feature: adding datas
  @data1
  Scenario: adding new employee to the table
Given user is on the homepage datatable website
When user click on usernew button
Then user should see the create new entry
And user should enter firstname "dage"
And user should enter lastname "wood"
And user should enter position "drive"
And user should enter office "11"

And user should enter extention "12"
And user should enter startdate "2017-05-06"
And user should enter salary "20000"
And user should click create button
And user enter firstname "dage" to search box
Then user can see firstname "dage"inserted to the table