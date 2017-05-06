package se.omegapoint.opkoko.cucumber;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

  @RequestMapping("/addition")
  public int addition(
      @RequestParam(value = "number1") int number1,
      @RequestParam(value = "number2") int number2
  ) {
    return number1 + number2;
  }
}
