@SmokeScenario
Feature: Sample Test

  @SmokeTest
  Scenario: Login Test
    Given Launch URL
    When User logn with valid credentials
    Then Home page is displayed