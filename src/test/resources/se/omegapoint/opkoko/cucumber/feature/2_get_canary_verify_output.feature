@canary1
Feature: Canary feature with verification of response body

  Scenario Outline: Verify response and output code of Canary endpoint
    Given I want to send a canary request
    When I send the request
    Then I get an OK response
    And the response is <response>

    Examples:
      | response |
      | OPKoKoKap |

