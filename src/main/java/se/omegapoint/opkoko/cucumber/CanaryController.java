package se.omegapoint.opkoko.cucumber;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CanaryController {

  @RequestMapping("/canary")
  public String canary() {
    return "OPKoKoKap";
  }
}
