package se.omegapoint.opkoko.cucumber;

import static org.junit.Assert.assertEquals;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

class StepHelper {

  private String requestUrl;
  private RestTemplate restTemplate;
  private ResponseEntity responseEntity;
  private final String serverUrl = "http://localhost:8080";

  StepHelper() {
    restTemplate = new RestTemplate();
  }

  void setRequestUrl(String requestUrl) {
    this.requestUrl = serverUrl + requestUrl;
  }

  void performRequest() {
    this.responseEntity = restTemplate.getForEntity(requestUrl, String.class);
  }

  void verifyOkResponse() {
    assertEquals(200, responseEntity.getStatusCode().value());
  }

  void verifyResponseString(String correctResponse) {
    assertEquals(correctResponse, responseEntity.getBody());
  }

  void setOperation(String operation) {
    this.requestUrl = serverUrl + operation;
  }

  void setInputNumbers(Integer number1, Integer number2) {
    this.requestUrl += "?number1=" + number1 + "&number2=" + number2;
  }
}
