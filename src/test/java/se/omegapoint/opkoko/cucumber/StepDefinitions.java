package se.omegapoint.opkoko.cucumber;

import cucumber.api.java8.En;

public class StepDefinitions implements En {

  private final StepHelper stepHelper = new StepHelper();

  public StepDefinitions() {

    Given("^I want to send a canary request$",
        () -> stepHelper.setRequestUrl("/canary"));

    When("^I send the request$", stepHelper::performRequest);

    Then("^I get an OK response$", stepHelper::verifyOkResponse);

    And("^the response is (.+)$",
        (String correctResponse) -> stepHelper.verifyResponseString(correctResponse));

    Given("^I want to perform (.+)$",
        (String operation) -> stepHelper.setOperation("/" + operation)
    );

    And("^I want to input numbers (.+) and (.+)$",
        (Integer number1, Integer number2) -> stepHelper.setInputNumbers(number1, number2));
  }
}
