Feature: adding new employee to the table
@data
  Scenario: adding new employee to the table
    Given user is on the homepage datatable website
    When user click on usernew button
    Then user should see the create new entry
    And user should enter firstname
    And user should enter lastname
    And user should enter position
    And user should enter office

    And user should enter extention
    And user should enter startdate
    And user should enter salary
    And user should click create button
    And user enter firstname to search box
    Then user can see firstname inserted to the table