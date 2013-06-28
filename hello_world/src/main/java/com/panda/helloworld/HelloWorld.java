package com.panda.helloworld;

import com.panda.greeter.Greeter;

class HelloWorld {
  public static void man(String[] args) {
    Greeter greeter = new Greeter();
    System.out.println(greeter.greet());
  }
}

