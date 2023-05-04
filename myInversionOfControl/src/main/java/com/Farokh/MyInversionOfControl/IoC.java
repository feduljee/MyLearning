package com.Farokh.MyInversionOfControl;

public class IoC {

  public static void main(String[] args) {
    //IoC container = new IoC();
    User user = new User(new MyOracleDatabase());
    user.add("This is some database");
  }
}
