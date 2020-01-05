@login
Feature: login functionality
@gg
  Scenario: teacher login
    Given user on the login page

    When user logs in using "daldie7l@seattletimes.com" and "ruthannjohnes"
    Then homepage should be displayed
    And title should be "homepage"
    And there should be 44 menu options
#  @ok
#  Scenario: team leader login
#    Given user on the login page
#      # use the login info of a team lead
#    When user logs in using "myemail@gmail.com" and "regularpassword"
#    Then homepage should be displayed
#    And title should be "homepage"