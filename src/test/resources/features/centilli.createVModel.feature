Feature: User should be able to login to Centrilli

  Background: : User is expected to be logged as Posmanager

     Given user is on the login page
     When user enters email enter password and login
     And user clicks more icon
     And user clicks fleet icon
     And user clicks vehicle model button
     Then user is on the vehicle create page

      Scenario: User create a vehicle model
        When user clicks create button
        And user write Artun to Model name field
        And user clicks Make field and write Artun
        And user clicks save button
        And user clicks create and edit button
        And user clicks Save1 button
        Then user clicks save button


