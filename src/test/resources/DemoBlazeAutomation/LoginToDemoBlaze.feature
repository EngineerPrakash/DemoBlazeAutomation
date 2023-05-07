Feature: Login to DemoBlaze App

  Scenario:Login to DemoBlaze Application with username and password
    Given I open the demo blaze application with url
    When I click the Sign Up
    And I enter the username and Password
    Then the sign up of the application should be successful with message
