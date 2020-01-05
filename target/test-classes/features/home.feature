@all
Feature:
  Background:
Given user on the login page
  @for
  Scenario: login bookit
    When user logs in as a teacher
    Then homepage should be displayed
  @by
  Scenario: login bookit
    When user logs in as a team lead
    Then homepage should be displayed
  @last
  Scenario: login bookit
    When user logs in as a team member
    Then homepage should be displayed
@fur
  Scenario Outline: login as different members
  When user logs in as a <type>
    Then homepage should be displayed

    Examples:
      | type        |
      | team member |
      | team lead   |
      | teacher     |


