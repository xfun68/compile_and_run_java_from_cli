package com.panda.helloworld;

import com.panda.greeter.Greeter;
import com.panda.person.Person;

class HelloWorld {
  public String hi() {
    String result = "";
    Greeter greeter = new Greeter();
    Person person = new Person("Obama");

    result += greeter.greet();
    result += "\n";
    result += greeter.greetTo(person);

    return result;
  }
}

