@SmokeScenario
Feature: Sample Test

  @SmokeTest
  Scenario: Login Test
    Given Launch URL
    When User logn with valid credentials
    Then Home page is displayed
    Then Home page is displayed for the loggedIn User

  @SmokeTest
  Scenario: Login Test
    Then Home page is displayed
    And Browser is closed