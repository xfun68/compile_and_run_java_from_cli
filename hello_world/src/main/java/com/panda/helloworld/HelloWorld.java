package com.panda.helloworld;

import com.panda.greeter.Greeter;
import com.panda.person.Person;

class HelloWorld {
  public static void main(String[] args) {
    Greeter greeter = new Greeter();

    System.out.println(greeter.greet());

    Person person = new Person("Obama");
    String greeting = greeter.greetTo(person);
    System.out.println(greeting);
  }
}

