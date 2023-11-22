@SmokeScenario
Feature: Sample Test

  Background: Background Steps
    Given Launch URL
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


  @SmokeTest
  Scenario: Sample Test
    Then Home page is displayed
    Then User gets all country links
    |Aus |
    |IND |
    | HK |