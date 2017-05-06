@canary1
Feature: Canary feature

  Scenario: Verify response code of Canary endpoint
    Given I want to send a canary request
    When I send the request
    Then I get an OK response