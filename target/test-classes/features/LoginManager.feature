@aa
Feature: Login as a mananger
  @cc
  Scenario Outline: Login functionality
    Given user lands to the login page
    Then user should login as "<user id>" and "<password>"
    Then home page sould diplayed
    Examples:
    |user id                 |password|
    |in_ex_manager2@info.com |LLighg89|
    |in_ex_officer2@info.com |LLighg94|