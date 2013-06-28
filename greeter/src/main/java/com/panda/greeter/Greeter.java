package com.panda.greeter;

import com.panda.person.Person;

public class Greeter {
  public String greet() {
    return "Hello World";
  }

  public String greetTo(Person person) {
    return "Hi, " + person.name() + ".";
  }
}

