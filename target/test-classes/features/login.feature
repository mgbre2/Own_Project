Feature: login functionality

  @wip

  Scenario:  As a manager login the page
    Given user is on the login page
    When user logs in using "in_ex_manager2@info.com" and "LLighg89"
    Then Expenses title should be displayed
    And user should click Expenses button
