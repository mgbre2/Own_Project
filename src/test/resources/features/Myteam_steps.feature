Feature: we were looking the team functionality
  @we
  Scenario: user lookinng
    Given user in the login page
    And user logging in with the valid data
    And the home page should display
    When the user goes to the "my team" page
    Then following team members should be displayed:
      | Alexie      |
      | Alexie      |
      | Monty       |
      | Christophe  |