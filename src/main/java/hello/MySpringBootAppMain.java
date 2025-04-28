package hello;

import hello.boot.MySpringApplication;
import hello.boot.MySpringBootApplication;

@MySpringBootApplication
public class MySpringBootAppMain {

  public static void main(String[] args) {
    System.out.println("MySpringBootMain.main");
    MySpringApplication.run(MySpringBootAppMain.class, args);
  }
}