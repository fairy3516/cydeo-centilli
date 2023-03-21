Feature: User should be able to login to home page

  Scenario: To be logged in Centrilli home page
    Given user is on the login page
    When user enters "posmanager10@info.com" to the email box
    And user enters posmanager to the password box
    And user clicks to the login button
    Then user is on the Centrilli page
