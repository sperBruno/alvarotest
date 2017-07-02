Feature: Testing for login  page

  Scenario: Login with valid credentials

    Given I login with valid credentials
    Then I expect the userName is displayed



  Scenario: Adding a user client

    Given I am on catalog page
    And  I insert a user client information
    Then I expect the userName is create sucessfully