@canary1
Feature: Addition clever title

  Scenario Outline: Verify addition of two numbers
    Given I want to perform addition
    And I want to input numbers <number1> and <number2>
    When I send the request
    Then I get an OK response
    And the response is <response>

    Examples:
      | number1 | number2 | response |
      | 3       | 4       | 7        |
      | 1       | -2      | -1       |
      | 10      | 10      | 20       |

