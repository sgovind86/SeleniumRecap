# my first test in cucumber
  Feature: validate the login capabibility
    Scenario: As a sales advisor sucessfully login using a valid login credentials
      Given I launched automation practice
      When I clicked on signin page
      And I enter valid login credentials on login
      Then I been taken to my account page
