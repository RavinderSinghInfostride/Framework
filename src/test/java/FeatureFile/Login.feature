#Feature: feature to test login functionality
#
#  Scenario: Check login is successful with valid credentials
#    Given user is on login page
#    When user enters username and password
#    And clicks on login button
#    Then user is navigated to home page

Feature: feature to test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters "<username>" and "<password>"
    And clicks on login button
    Then user is navigated to home page
    And user logs out
    And browser closes
    Examples:
      | username | password |
      | standard_user | secret_sauce |