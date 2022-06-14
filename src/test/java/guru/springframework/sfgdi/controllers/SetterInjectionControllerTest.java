package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectionControllerTest {

  SetterInjectionController controller;

  @BeforeEach
  void setUp() {
    controller = new SetterInjectionController();
    controller.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting());
  }
}